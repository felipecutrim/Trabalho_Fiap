package br.com.meucontrole;

import br.com.meucontrole.dao.ContaDAO;
import br.com.meucontrole.dao.TransacaoDAO;
import br.com.meucontrole.dao.CategoriaDAO;
import br.com.meucontrole.dao.UsuarioDAO;
import java.sql.SQLException;
import java.util.List;

public class Teste {

    public static void main(String[] args) {

        try {
            // ===== TESTE CONTA =====
            ContaDAO contaDAO = new ContaDAO();
            contaDAO.cadastrar(new Conta(0, 1500.00, "Corrente"));
            contaDAO.cadastrar(new Conta(0, 3000.00, "Poupança"));
            contaDAO.cadastrar(new Conta(0, 500.00, "Corrente"));
            contaDAO.cadastrar(new Conta(0, 7000.00, "Poupança"));
            contaDAO.cadastrar(new Conta(0, 250.00, "Corrente"));
            System.out.println("=== Contas cadastradas ===");
            List<Conta> contas = contaDAO.getAll();
            for (Conta c : contas) {
                System.out.println("ID: " + c.getIdConta() + " | Saldo: " + c.getSaldo() + " | Tipo: " + c.getTipoConta());
            }
            contaDAO.fecharConexao();

            // ===== TESTE TRANSACAO =====
            TransacaoDAO transacaoDAO = new TransacaoDAO();
            transacaoDAO.cadastrar(new Transacao(0, "Receita", 2500.00, "11/03/2026"));
            transacaoDAO.cadastrar(new Transacao(0, "Despesa", 350.00, "11/03/2026"));
            transacaoDAO.cadastrar(new Transacao(0, "Receita", 1800.00, "12/03/2026"));
            transacaoDAO.cadastrar(new Transacao(0, "Despesa", 600.00, "12/03/2026"));
            transacaoDAO.cadastrar(new Transacao(0, "Receita", 3200.00, "13/03/2026"));
            System.out.println("\n=== Transações cadastradas ===");
            List<Transacao> transacoes = transacaoDAO.getAll();
            for (Transacao t : transacoes) {
                System.out.println("ID: " + t.getIdTransacao() + " | Tipo: " + t.getTipo() + " | Valor: " + t.getValor() + " | Data: " + t.getData());
            }
            transacaoDAO.fecharConexao();

            // ===== TESTE CATEGORIA =====
            CategoriaDAO categoriaDAO = new CategoriaDAO();
            categoriaDAO.cadastrar(new Categoria(0, "Alimentação", "Gastos com comida"));
            categoriaDAO.cadastrar(new Categoria(0, "Transporte", "Gastos com transporte"));
            categoriaDAO.cadastrar(new Categoria(0, "Saúde", "Gastos com saúde"));
            categoriaDAO.cadastrar(new Categoria(0, "Lazer", "Gastos com entretenimento"));
            categoriaDAO.cadastrar(new Categoria(0, "Educação", "Gastos com estudos"));
            System.out.println("\n=== Categorias cadastradas ===");
            List<Categoria> categorias = categoriaDAO.getAll();
            for (Categoria c : categorias) {
                System.out.println("ID: " + c.getIdCategoria() + " | Nome: " + c.getNome() + " | Descrição: " + c.getDescricao());
            }
            categoriaDAO.fecharConexao();

            // ===== TESTE USUARIO =====
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            usuarioDAO.cadastrar(new Usuario(0, "Felipe", "felipe@email.com", "123456"));
            usuarioDAO.cadastrar(new Usuario(0, "Ana", "ana@email.com", "654321"));
            usuarioDAO.cadastrar(new Usuario(0, "Carlos", "carlos@email.com", "111222"));
            usuarioDAO.cadastrar(new Usuario(0, "Maria", "maria@email.com", "333444"));
            usuarioDAO.cadastrar(new Usuario(0, "João", "joao@email.com", "555666"));
            System.out.println("\n=== Usuários cadastrados ===");
            List<Usuario> usuarios = usuarioDAO.getAll();
            for (Usuario u : usuarios) {
                System.out.println("ID: " + u.getIdUsuario() + " | Nome: " + u.getNome() + " | Email: " + u.getEmail());
            }
            usuarioDAO.fecharConexao();

        } catch (SQLException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}