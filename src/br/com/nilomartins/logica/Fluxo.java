package br.com.nilomartins.logica;

import java.util.*;


public class Fluxo {

    public static void main (String [] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Qual o seu palpite?");
        int palpite = s.nextInt();

        Random n = new Random();
        int dado = n.nextInt(6) + 1;//0-5

        System.out.println("Palpite =" + palpite);
        System.out.println("Dado =" + dado);

        if (palpite == dado) {
            System.out.println("Acertou");
        } else {
            System.out.println("Errou");
        }
    }
}
