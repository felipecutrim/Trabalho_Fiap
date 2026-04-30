package br.com.meucontrole;

public class Conta {

    private int idConta;
    private double saldo;
    private String tipoConta;

    public Conta() {
    }

    public Conta(int idConta, double saldo, String tipoConta) {
        this.idConta = idConta;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public void consultarSaldo() {
        System.out.println("Executando método consultarSaldo()");
    }

    public void depositar() {
        System.out.println("Executando método depositar()");
    }

    public void sacar() {
        System.out.println("Executando método sacar()");
    }
}