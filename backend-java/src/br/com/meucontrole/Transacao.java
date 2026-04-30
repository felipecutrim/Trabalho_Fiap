package br.com.meucontrole;

public class Transacao {

    private int idTransacao;
    private String tipo;
    private double valor;
    private String data;

    public Transacao() {
    }

    public Transacao(int idTransacao, String tipo, double valor, String data) {
        this.idTransacao = idTransacao;
        this.tipo = tipo;
        this.valor = valor;
        this.data = data;
    }

    public int getIdTransacao() {
        return idTransacao;
    }

    public void setIdTransacao(int idTransacao) {
        this.idTransacao = idTransacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void registrarTransacao() {
        System.out.println("Executando método registrarTransacao()");
    }

    public void listarTransacoes() {
        System.out.println("Executando método listarTransacoes()");
    }

    public void excluirTransacao() {
        System.out.println("Executando método excluirTransacao()");
    }
}