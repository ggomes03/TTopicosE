package main;

import java.util.List;
import sql.*;

public class SqlGenerator {
    public static String generate(Host host) {
        StringBuilder sb = new StringBuilder();
        for (Banco banco : host.getBanco()) {
            sb.append("-- Banco: ").append(banco.getNome()).append("\n");
            for (Tabela tabela : banco.getTabela()) {
                sb.append("CREATE TABLE ").append(tabela.getNome()).append(" (\n");
                // Colunas
                for (int i = 0; i < tabela.getColuna().size(); i++) {
                    Coluna col = tabela.getColuna().get(i);
                    sb.append("    ")
                      .append(col.getNome()).append(" ")
                      .append(col.getTipo_dado()).append(" ")
                      .append(Boolean.TRUE.equals(col.isNulo()) ? "NULL" : "NOT NULL");
                    if (i < tabela.getColuna().size() - 1 ||
                        !tabela.getChaveprimaria().isEmpty() ||
                        !tabela.getChaveestrangeira().isEmpty()) {
                        sb.append(",");
                    }
                    sb.append("\n");
                }
                // PK
                for (int i = 0; i < tabela.getChaveprimaria().size(); i++) {
                    ChavePrimaria pk = tabela.getChaveprimaria().get(i);
                    sb.append("    PRIMARY KEY (");
                    for (int j = 0; j < pk.getColuna().size(); j++) {
                        sb.append(pk.getColuna().get(j).getNome());
                        if (j < pk.getColuna().size() - 1)
                            sb.append(", ");
                    }
                    sb.append(")");
                    if (i < tabela.getChaveprimaria().size() - 1 ||
                        !tabela.getChaveestrangeira().isEmpty()) {
                        sb.append(",");
                    }
                    sb.append("\n");
                }
                // FK
                for (int i = 0; i < tabela.getChaveestrangeira().size(); i++) {
                    ChaveEstrangeira fk = tabela.getChaveestrangeira().get(i);
                    sb.append("    FOREIGN KEY (");
                    for (int j = 0; j < fk.getColuna().size(); j++) {
                        sb.append(fk.getColuna().get(j).getNome());
                        if (j < fk.getColuna().size() - 1)
                            sb.append(", ");
                    }
                    sb.append(") REFERENCES ")
                      .append(fk.getTabela().getNome())
                      .append(" (");
                    // Supõe que fk refere às PKs da tabela referenciada
                    List<ChavePrimaria> pksRef = fk.getTabela().getChaveprimaria();
                    if (!pksRef.isEmpty()) {
                        ChavePrimaria pkRef = pksRef.get(0);
                        for (int j = 0; j < pkRef.getColuna().size(); j++) {
                            sb.append(pkRef.getColuna().get(j).getNome());
                            if (j < pkRef.getColuna().size() - 1)
                                sb.append(", ");
                        }
                    }
                    sb.append(")");
                    if (i < tabela.getChaveestrangeira().size() - 1) {
                        sb.append(",");
                    }
                    sb.append("\n");
                }
                sb.append(");\n\n");
            }
        }
        return sb.toString();
    }
}