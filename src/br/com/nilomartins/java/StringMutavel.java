package br.com.nilomartins.java;

public class StringMutavel {
    public static void main(String[] args) {

        StringBuffer s0 = new StringBuffer();
        StringBuilder s1 = new StringBuilder("Java");

        s1.toString(); //Para retornar o valor string do objeto
        s1.length(); //Que informa o tamanho da string que está dentro do objeto
        //System.out.println(s1.length());
        s1.capacity(); //Ele informa a capacidade de armazenamento de novos caracteres dentro do objeto sem alocar memoria
        //System.out.println(s1.capacity());

        //System.out.println(s1);
        s1.reverse(); //inverte a ordem do caractere
        //System.out.println(s1);

        s1.append(" Trabalhando ");
        char [] c = {'c', 'o', 'm'};
        s1.append(c).append(" Textos. ");
        System.out.println(s1);

        String s = "Oi" + " como " + "vai voce?";
        String sb = new StringBuilder("Oi")
                .append(" como ").append("vai voce?").toString();

        String url = new StringBuilder("www.xti.com.br").delete(0, 4).toString();
        System.out.println(url);


    }
}
