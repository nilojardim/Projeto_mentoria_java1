package br.com.nilomartins.erros;

public class SenhaInvalidaException extends Exception {

    public SenhaInvalidaException(String mensagem){
        super(mensagem);
    }

}
