package br.com.nilomartins.poo;

public class GalinhaTest {
    public static void main(String[] args) {

        Galinha g1 = new Galinha();
        g1.botar().botar().botar();

        Galinha g2 = new Galinha();
        g2.botar().botar();

        System.out.println("Galinha 1: " + g1.ovos);
        System.out.println("Galinha 2: " + g2.ovos);
        System.out.println("Total de ovos: " + Galinha.ovosDaGranja);
        System.out.println("Media de ovos: " + Galinha.mediaDeOvos(2));

    }
}
