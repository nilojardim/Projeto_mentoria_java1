package br.com.nilomartins.poo;

public class Matematica {
    /** @return a raiz quadrada segundo a equação de pell*/
    int raiz(int numero) {
        int raiz = 0, impar = 1;
        while (numero >= impar){
            numero -= impar;
            impar += 2;//próximo número ímpar
            ++raiz;
        }
        return raiz;
    }

    int maior(int um, int dois) {
        if(um > dois) {
            return um;
        } else {
            return dois;
        }
    }

    double soma(double um, double dois){
        double s = um + dois;
        return s;
    }

}
