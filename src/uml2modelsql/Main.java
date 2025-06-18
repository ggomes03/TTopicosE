package uml2modelsql;

public class Main {
    public static void main(String[] args) throws Exception {
        // Caminhos dos arquivos XMI e Ecore
        String inputEcorePath = "modelo_entidades.ecore";
        String inputModelPath = "meu_modelo_entidades.xmi";
        String sqlEcorePath = "modelo_sql.ecore";
        String outputSqlModelPath = "output_sql_model.xmi";

        // Carregar modelo de entidades
        ModelLoader loader = new ModelLoader();
        org.eclipse.emf.ecore.EObject entidadesRoot = loader.loadModel(inputEcorePath, inputModelPath);

        // Carregar metamodelo SQL
        org.eclipse.emf.ecore.EPackage sqlMetamodel = loader.loadMetamodel(sqlEcorePath);

        // Gerar modelo SQL
        SqlModelGenerator generator = new SqlModelGenerator();
        org.eclipse.emf.ecore.EObject sqlRoot = generator.transform(entidadesRoot, sqlMetamodel);

        // Salvar modelo SQL
        loader.saveModel(sqlRoot, sqlMetamodel, outputSqlModelPath);

        System.out.println("Transformação concluída! Modelo SQL salvo em: " + outputSqlModelPath);
    }
}