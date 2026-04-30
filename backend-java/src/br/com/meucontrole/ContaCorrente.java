package br.com.meucontrole;

public class ContaCorrente extends Conta {

    private double limite;

    public ContaCorrente() {
        super();
    }

    public ContaCorrente(int idConta, double saldo, String tipoConta, double limite) {
        super(idConta, saldo, tipoConta);
        this.limite = limite;
    }

    public void consultarLimite() {
        System.out.println("Executando método consultarLimite()");
    }
}