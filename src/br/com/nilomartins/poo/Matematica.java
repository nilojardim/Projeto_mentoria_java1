package br.com.nilomartins.poo;

public class Matematica {

    double soma(double ... numeros) {
        double total = 0;
        for (double n : numeros){
            total += n;
        }
        return total;
    }

    double media(int x) {
        System.out.print("media(int x) ");
        return x;
    }

    double media(int x, int y) {
        System.out.print("media (int x, int y) ");
        return (x + y) / 2;
    }

    double media(double ... numeros) {
        System.out.print("media(int ... numeros) ");
        return this.soma(numeros) / numeros.length;
    }

        double media(String x, String y) {
            System.out.print("media(String x, String y) ");
            int ix = Integer.parseInt(x);
            int iy = Integer.parseInt(y);
            return (ix + iy) / 2;
        }



}
