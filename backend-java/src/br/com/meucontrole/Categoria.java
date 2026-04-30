package br.com.meucontrole;

public class Categoria {
    private int idCategoria;
    private String nome;
    private String descricao;

    public Categoria() {
    }

    public Categoria(int idCategoria, String nome, String descricao) {
        this.idCategoria = idCategoria;
        this.nome = nome;
        this.descricao = descricao;
    }

    public int getIdCategoria() { return idCategoria; }
    public void setIdCategoria(int idCategoria) { this.idCategoria = idCategoria; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public void cadastrarCategoria() {
        System.out.println("Executando método cadastrarCategoria()");
    }

    public void listarCategorias() {
        System.out.println("Executando método listarCategorias()");
    }

    public void excluirCategoria() {
        System.out.println("Executando método excluirCategoria()");
    }
}