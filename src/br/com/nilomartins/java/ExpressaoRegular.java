package br.com.nilomartins.java;

public class ExpressaoRegular {

    public static void main(String[] args) {

        boolean b = "Java".matches("Java");
        //System.out.println(b);

        /*MODIFICADORES
        (?i), Ignora maiúscula e minúscula
        (?x), Comentários
        (?m), Multilinhas
        (?s), Dottal
         */

        b = "Java".matches("(?im)java");
        //System.out.println(b);

        /*METACARACTERES
        .  qualquer caracter
        \d dígitos          [0-9]
        \D não é dígito     [^0-9]
        \s espaços          [\t\n\x0B\f\r]
        \S não é espaço     [^\s]
        \w letra            [a-zA-Z_0-9]
        \W não é letra */

        b = "@".matches(".");
        b = "2".matches("\\d");
        b = "#".matches("\\w");
        b = " ".matches("\\s");
        b = "Pi".matches("..");
        b = "Pie".matches("...");

        String cep = "\\d\\d\\d\\d\\d-\\d\\d\\d";
        b = "38406-136".matches(cep);
        //System.out.println(b);

        /* QUANTIFICADORES
        X{n}    X, exatamente n vezes
        X{n,}   X, pelo menos n vezes
        X{n, m} X, pelo menos n mais não maid do que m vezes
        X?      X, 0 ou 1 vez
        X*      X, 0 ou + vezes
        X+      X, 1 ou + vezes */

        b = "30".matches("\\d{2}");
        b = "320".matches("\\d{2,}");
        b = "328990".matches("\\d{2,5}");
        b = "".matches(".?");
        b = "aa".matches(".?"); //0 ou 1
        b = "aa".matches(".*");//0 ou  +
        b = "aa".matches(".+");//1 ou  +
        b = "38406-136".matches("\\d{5}-\\d{3}");
        b = "23/05/1988".matches("\\d{2}/\\d{2}/\\d{4}");
        //System.out.println(b);

        /*METACARACTER DE FRONTEIRA
        ^   inicia
        $   finaliza
        |   ou
        */

        b = "Pier21".matches("^Pier.*");
        b = "Pier21".matches(".*21$");
        b = "tem java aqui".matches(".*java.*");
        b = "tem java aqui".matches("^tem.*aqui$");
        b = "sim".matches("sim|não");
        //System.out.println(b);

        /*  AGRUPADORES
        [...]           Agrupamento
        [a-z]           Alcance
        [a-e][i-u]      União
        [a-z&&[aeiou]]  Interseção
        [^abc]          Exceção
        [a-z&&[^m-p]]   Subtração
        \x              Fuga literal */

        b = "x".matches("[a-z]");
        b = "3".matches("[0-9]");

        b = "True".matches("[tT]rue"); //true True
        b = "True".matches("[tT]rue|[yY]es");
        b = "yes".matches("[tT]rue|[yY]es");
        b = "Nilo".matches("[A-Z][a-z]*");//Primeiro Nome
        b = "alho".matches("[^abc]lho");
        b = "crau".matches("cr[ae]u");

        b = "rh@xti.com".matches("\\w+@\\w+\\.\\w{2,3}"); //validação de e-mail
        System.out.println(b);

        String doce = "Qual é o Doce mais doCe que o doce?"

    }
}
