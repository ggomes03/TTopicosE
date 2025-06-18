package uml2modelsql;
import org.eclipse.emf.ecore.*;
import java.util.*;

public class SqlModelGenerator {

    /**
     * Transforma o modelo de entidades em modelo SQL.
     * @param entidadesRoot Raiz do modelo de entidades (ModeloEntidade)
     * @param sqlMetamodel Metamodelo EPackage do SQL
     * @return Raiz do modelo SQL (Host)
     */
    public EObject transform(EObject entidadesRoot, EPackage sqlMetamodel) {
        // Busca EClasses do metamodelo SQL
        EClass hostClass = (EClass) sqlMetamodel.getEClassifier("Host");
        EClass bancoClass = (EClass) sqlMetamodel.getEClassifier("Banco");
        EClass tabelaClass = (EClass) sqlMetamodel.getEClassifier("Tabela");
        EClass colunaClass = (EClass) sqlMetamodel.getEClassifier("Coluna");
        EClass chavePrimariaClass = (EClass) sqlMetamodel.getEClassifier("ChavePrimaria");
        EClass chaveEstrangeiraClass = (EClass) sqlMetamodel.getEClassifier("ChaveEstrangeira");

        EFactory factory = sqlMetamodel.getEFactoryInstance();

        // Criar o modelo SQL raiz (Host)
        EObject host = factory.create(hostClass);
        List<EObject> bancos = getFeatureList(host, "banco");

        // Criar um banco fictício (pode customizar depois)
        EObject banco = factory.create(bancoClass);
        banco.eSet(bancoClass.getEStructuralFeature("nome"), "MeuBanco");
        bancos.add(banco);

        // Mapear entidades para tabelas
        Map<EObject, EObject> entidadeToTabela = new HashMap<>();

        // 1. Tabelas e colunas
        List<EObject> entidades = getFeatureList(entidadesRoot, "entidades");
        List<EObject> tabelas = getFeatureList(banco, "tabela");
        for (EObject entidade : entidades) {
            EObject tabela = factory.create(tabelaClass);
            String nomeTabela = (String) entidade.eGet(entidade.eClass().getEStructuralFeature("nome"));
            tabela.eSet(tabelaClass.getEStructuralFeature("nome"), nomeTabela);

            // Colunas
            List<EObject> atributos = getFeatureList(entidade, "atributos");
            List<EObject> colunas = getFeatureList(tabela, "coluna");
            for (EObject atributo : atributos) {
                EObject coluna = factory.create(colunaClass);
                coluna.eSet(colunaClass.getEStructuralFeature("nome"),
                        atributo.eGet(atributo.eClass().getEStructuralFeature("nome")));
                coluna.eSet(colunaClass.getEStructuralFeature("tipo_dado"),
                        atributo.eGet(atributo.eClass().getEStructuralFeature("tipo")));
                coluna.eSet(colunaClass.getEStructuralFeature("nulo"), false);
                colunas.add(coluna);
                coluna.eSet(colunaClass.getEStructuralFeature("tabela"), tabela);
            }

            tabelas.add(tabela);
            entidadeToTabela.put(entidade, tabela);
        }

        // 2. Chave Primária
        for (EObject entidade : entidades) {
            EObject tabela = entidadeToTabela.get(entidade);
            List<EObject> atributos = getFeatureList(entidade, "atributos");
            List<EObject> chavesPrimarias = getFeatureList(tabela, "chaveprimaria");
            List<EObject> colunasTabela = getFeatureList(tabela, "coluna");
            EObject chavePrimaria = factory.create(chavePrimariaClass);
            List<EObject> colunasChave = getFeatureList(chavePrimaria, "coluna");
            for (EObject atributo : atributos) {
                Boolean isPK = (Boolean) atributo.eGet(atributo.eClass().getEStructuralFeature("ehChavePrimaria"));
                if (isPK != null && isPK) {
                    // Procura a coluna correspondente
                    String nomeAtributo = (String) atributo.eGet(atributo.eClass().getEStructuralFeature("nome"));
                    for (EObject coluna : colunasTabela) {
                        if (nomeAtributo.equals(coluna.eGet(colunaClass.getEStructuralFeature("nome")))) {
                            colunasChave.add(coluna);
                        }
                    }
                }
            }
            if (!colunasChave.isEmpty()) {
                chavesPrimarias.add(chavePrimaria);
            }
        }

        // 3. Chaves estrangeiras (Relacionamentos)
        List<EObject> relacionamentos = getFeatureList(entidadesRoot, "relacionamentos");
        for (EObject relacionamento : relacionamentos) {
            EObject origem = (EObject) relacionamento.eGet(relacionamento.eClass().getEStructuralFeature("origem"));
            EObject destino = (EObject) relacionamento.eGet(relacionamento.eClass().getEStructuralFeature("destino"));
            EObject tabelaOrigem = entidadeToTabela.get(origem);
            EObject tabelaDestino = entidadeToTabela.get(destino);

            // Cria chave estrangeira na tabela de origem apontando para o PK da tabela de destino
            EObject chaveEstrangeira = factory.create(chaveEstrangeiraClass);
            getFeatureList(tabelaOrigem, "chaveestrangeira").add(chaveEstrangeira);
            chaveEstrangeira.eSet(chaveEstrangeiraClass.getEStructuralFeature("tabela"), tabelaDestino);

            // Simples: adiciona todas as PKs de destino como FK na origem
            List<EObject> pkDestino = getFeatureList(tabelaDestino, "chaveprimaria");
            if (!pkDestino.isEmpty()) {
                List<EObject> colunasFk = getFeatureList(chaveEstrangeira, "coluna");
                EObject pkObj = pkDestino.get(0);
                List<EObject> colunasPk = getFeatureList(pkObj, "coluna");
                List<EObject> colunasOrigem = getFeatureList(tabelaOrigem, "coluna");
                for (EObject colunaPk : colunasPk) {
                    // Procura coluna de mesmo nome na origem, ou cria nova se não existir
                    String nomeColunaPk = (String) colunaPk.eGet(colunaClass.getEStructuralFeature("nome"));
                    EObject colunaOrigem = null;
                    for (EObject col : colunasOrigem) {
                        if (nomeColunaPk.equals(col.eGet(colunaClass.getEStructuralFeature("nome")))) {
                            colunaOrigem = col;
                            break;
                        }
                    }
                    if (colunaOrigem == null) {
                        // Cria coluna FK se não existe
                        colunaOrigem = factory.create(colunaClass);
                        colunaOrigem.eSet(colunaClass.getEStructuralFeature("nome"), nomeColunaPk);
                        colunaOrigem.eSet(colunaClass.getEStructuralFeature("tipo_dado"),
                                colunaPk.eGet(colunaClass.getEStructuralFeature("tipo_dado")));
                        colunaOrigem.eSet(colunaClass.getEStructuralFeature("nulo"), false);
                        colunasOrigem.add(colunaOrigem);
                        colunaOrigem.eSet(colunaClass.getEStructuralFeature("tabela"), tabelaOrigem);
                    }
                    colunasFk.add(colunaOrigem);
                }
            }
        }

        return host;
    }

    @SuppressWarnings("unchecked")
    private List<EObject> getFeatureList(EObject obj, String feature) {
        return (List<EObject>) obj.eGet(obj.eClass().getEStructuralFeature(feature));
    }
}