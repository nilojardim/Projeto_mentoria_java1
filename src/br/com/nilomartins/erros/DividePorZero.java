package br.com.nilomartins.erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        boolean continua = true;

        do {
            try {
                System.out.print("Numero: ");
                int a = s.nextInt();
                System.out.print("Divisor: ");
                int b = s.nextInt();


                System.out.println(a / b);
                continua = false;
            } catch (InputMismatchException e1) {
                System.err.println("Numeros devem ser inteiros");
                s.nextLine();
            } catch (ArithmeticException e2) {
                System.err.println("Divisor deve ser diferente de zero");
            }
            finally {
                System.out.println("Finally Executado...");
            }


        } while (continua);
    }
}
