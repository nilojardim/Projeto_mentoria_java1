package br.com.nilomartins;

import java.util.Arrays;

public class ArraySimples {

          public static void main (String[] args) {

              String[] paises = {"Brasil", "Russia", "India", "China"};

              System.out.println(Arrays.toString(paises));

              int posicao = Arrays.binarySearch(paises, "Russia");
              System.out.println(posicao);

        }


}
