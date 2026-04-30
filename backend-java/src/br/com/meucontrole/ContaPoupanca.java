package br.com.meucontrole;

public class ContaPoupanca extends Conta {

    private double rendimento;

    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(int idConta, double saldo, String tipoConta, double rendimento) {
        super(idConta, saldo, tipoConta);
        this.rendimento = rendimento;
    }

    public void calcularRendimento() {
        System.out.println("Executando método calcularRendimento()");
    }
}