package br.com.meucontrole;

import br.com.meucontrole.dao.UsuarioDAO;
import java.sql.SQLException;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        try {
            UsuarioDAO dao = new UsuarioDAO();

            // Cadastrando 5 usuários
            dao.cadastrar(new Usuario(0, "Felipe", "felipe@email.com", "123456"));
            dao.cadastrar(new Usuario(0, "Ana", "ana@email.com", "654321"));
            dao.cadastrar(new Usuario(0, "Carlos", "carlos@email.com", "111222"));
            dao.cadastrar(new Usuario(0, "Maria", "maria@email.com", "333444"));
            dao.cadastrar(new Usuario(0, "João", "joao@email.com", "555666"));
            System.out.println("5 usuários cadastrados com sucesso!");

            // Buscando todos os usuários
            List<Usuario> usuarios = dao.getAll();
            System.out.println("\n--- Lista de Usuários ---");
            for (Usuario u : usuarios) {
                System.out.println("ID: " + u.getIdUsuario() +
                        " | Nome: " + u.getNome() +
                        " | Email: " + u.getEmail());
            }

            dao.fecharConexao();

        } catch (SQLException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}