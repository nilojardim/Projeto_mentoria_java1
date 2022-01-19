package br.com.nilomartins.poo;

public class MatematicaTest {
    public static void main(String[] args) {

        Matematica m = new Matematica();

        double [] numeros = {2,3,5,6,7,500,600};
        double total = m.soma(numeros);
        System.out.println("Total = " + total);
    }
}
