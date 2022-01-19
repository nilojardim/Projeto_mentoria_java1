package br.com.nilomartins;

public class CachorroTest {

    public static void main(String[] args) {

        Cachorro borderCollie = new Cachorro();
        borderCollie.raca = "Border Collie";
        borderCollie.tamanho = 40;
        borderCollie.latir();

        Cachorro viralata = new Cachorro();
        viralata.raca = "Vira-Lata";
        viralata.tamanho = 30;
        viralata.latir();

    }

}
