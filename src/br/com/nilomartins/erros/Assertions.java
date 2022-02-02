package br.com.nilomartins.erros;

import java.util.Scanner;

public class Assertions {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Entre um Numero de 0 a 10");
        int numero = s.nextInt();

        // as assertion são utilizadas apenas para auxilio do programador
        assert (numero >= 0 && numero <=10) : "Numero Invalido " + numero;
        System.out.println("Voce entrou " + numero);

    }
}
