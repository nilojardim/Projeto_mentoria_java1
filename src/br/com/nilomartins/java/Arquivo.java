package br.com.nilomartins.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("C:/XTI/files/texto.txt");
        System.out.println(path.toAbsolutePath());
        System.out.println(path.getParent());
        System.out.println(path.getRoot());
        System.out.println(path.getFileName());

        /* CRIAÇÃO DE DIRETORIOS */

        Files.createDirectories(path.getParent());

        /* ESCREVER E LER ARQUIVOS */
        byte[] bytes = "Meu Texto".getBytes();
        Files.write(path, bytes); //cria, limpa, escreve


    }
}
