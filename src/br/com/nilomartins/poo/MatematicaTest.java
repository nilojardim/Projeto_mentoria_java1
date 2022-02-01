package br.com.nilomartins.poo;

public class MatematicaTest {

    public static void main(String[] args) {

        Matematica m = new Matematica();

        System.out.println(m.media (5));
        System.out.println(m.media (5,3));
        System.out.println(m.media (5, 3, 54, 56));
        System.out.println(m.media ("50", "30"));
    }
}
