package br.com.meucontrole;

public class Receita extends Transacao {

    public Receita() {
        super();
    }

    public Receita(int idTransacao, String tipo, double valor, String data) {
        super(idTransacao, tipo, valor, data);
    }

    public void exibirReceita() {
        System.out.println("Executando método exibirReceita()");
    }
}