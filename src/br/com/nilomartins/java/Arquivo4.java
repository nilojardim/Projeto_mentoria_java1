package br.com.nilomartins.java;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo4 {

    public static void main(String[] args) {
        Path path = Paths.get("C:/xti/files/texto.txt");
        System.out.println(Files.exists((path)));
        System.out.println(Files.isDirectory((path)));
        System.out.println(Files.isRegularFile((path)));
    }


}
