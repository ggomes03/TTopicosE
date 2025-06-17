package main;

import java.nio.file.*;
import sql.*;
//public class Main {
//    public static void main(String[] args) throws Exception {
//        if (args.length < 2) {
//            System.out.println("Uso: java main.Main <input.xmi> <output.sql>");
//            return;
//        }
//        String xmiPath = args[0];
//        String outputPath = args[1];
//        Host host = (Host) ModelLoader.load(xmiPath);
//        String sql = SqlGenerator.generate(host);
//        Files.write(Paths.get(outputPath), sql.getBytes());
//        System.out.println("Arquivo gerado: " + outputPath);
//    }
//}


public class Main {
    public static void main(String[] args) throws Exception {
        
        String xmiPath = "/home/gustavo/eclipse-workspace/JAVA_SQL2CODE_SQL/model/My.sql"; // Caminho do arquivo de entrada (.xmi)
        String outputPath = "/home/gustavo/eclipse-workspace/JAVA_SQL2CODE_SQL/model/MyOutput.sql"; // Caminho do arquivo de saída (.sql)

        Host host = (Host) ModelLoader.load(xmiPath);
        String sql = SqlGenerator.generate(host);
        Files.write(Paths.get(outputPath), sql.getBytes());
        System.out.println("Arquivo gerado: " + outputPath);
    }
}

