package br.com.nilomartins.java;

public class StringToken {
    public static void main(String[] args) {

        String s = " XHTML; CSS; JavaScript; jQuery; Java";
        s = "Venha trabalhar na XIT";
        String [] tokens = s.split(" ");
        System.out.println(tokens.length + " tokens");
        for (String token : tokens) {
            System.out.println(token);
        }

    }
}
