package br.com.nilomartins.poo;

public class Conta {

    String cliente;
    double saldo;
    public Conta () {}
    public Conta (String cliente, double saldo){
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void exibeSaldo(){
        System.out.println(cliente + " seu saldo é " + saldo);
    }

    public void saca (double valor){
        saldo -= valor;
    }

    public void deposita (double valor){
        saldo += valor;
    }

    public void transferePara (Conta destino, double valor){
        this.saca(valor);
        destino.deposita(valor);
    }
}
