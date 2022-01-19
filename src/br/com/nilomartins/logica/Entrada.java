package br.com.nilomartins.logica;

import javax.swing.JOptionPane;

public class Entrada {

    public static void main(String[] args) {
        /*Entrada de dados com JOptionPane*/
        String nome = JOptionPane.showInputDialog("Qual seu nome?");
        /* Responder a entrada de dados com Janela */
        JOptionPane.showMessageDialog(null, nome);

       //System.out.println(args[0]);
        /* Entrada de dados usando Scaner
        Scanner s = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        String nome = s.nextLine();
        System.out.println("Bem vindo " + nome);*/



    }

}
