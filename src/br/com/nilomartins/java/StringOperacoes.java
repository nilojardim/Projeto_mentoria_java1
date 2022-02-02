package br.com.nilomartins.java;

import java.util.Locale;

public class StringOperacoes {

    public static void main(String[] args) {

        String s1 = "Write Once";
        String s2 = s1 + "Run AnyWhere";
        String s3 = new String("Java Virtual Machine");
        char[] array = {'J', 'a', 'v', 'a'};
        String s4 = new String(array);

        //OPERACOES
        int tamanho = s1.length();
        s1.charAt(0);//0 a length()-1
        String texto = s1.toString();

        //LOCALIZACAO
        int posicao = s3.indexOf("Virtual");
        int ultima = s3.lastIndexOf('a');
        boolean vazia = s3.isEmpty();
        //System.out.println(posicao);

        //COMPARACAO
        String xti = "XTI";
        //boolean x = xti.equals("xti");
        //boolean x = xti.equalsIgnoreCase("xti");
        //boolean x = xti.startsWith("ti");
        boolean x = xti.endsWith("TI");
        //System.out.println(x);

        //int c = "amor".compareTo("bola");//-1
        //int c = "amor".compareTo("amor");//1
        //System.out.println(c);

        String so = "Olhe, Olhe";
        boolean o = so.regionMatches(6, "Olher", 0, 4);
        //System.out.println(o);

        String l = "O Brasil é lindo";
        String sl = l.substring(11);
        sl = l.substring(2,8);

        sl = l.concat(" que Maravilha");
        sl = l.replace('s', 'z');
        //sl = l.replaceFirst(" ", "X");
        //sl = l.replaceAll(" ", "X");
        sl = l.toUpperCase(Locale.ROOT);
        sl = l.toLowerCase(Locale.ROOT);


        System.out.println("   espaços    ".trim());

    }
}
