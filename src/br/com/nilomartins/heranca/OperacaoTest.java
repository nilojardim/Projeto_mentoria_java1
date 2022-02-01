package br.com.nilomartins.heranca;

public class OperacaoTest {

    public static void calcule(OperacaoMatematica o, double x, double y) {
        System.out.println(o.calcular(x, y));
    }

    public static void main(String[] args) {
        calcule(new Soma(), 5, 5);
        calcule(new Mutiplicacao(), 5, 5);


    }
}
