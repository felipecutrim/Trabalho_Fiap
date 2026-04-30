package br.com.meucontrole;

public class Despesa extends Transacao {

    public Despesa() {
        super();
    }

    public Despesa(int idTransacao, String tipo, double valor, String data) {
        super(idTransacao, tipo, valor, data);
    }

    public void exibirDespesa() {
        System.out.println("Executando método exibirDespesa()");
    }
}