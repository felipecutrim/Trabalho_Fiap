package br.com.meucontrole.dao;

import br.com.meucontrole.Usuario;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    private Connection conexao;

    public UsuarioDAO() throws SQLException {
        this.conexao = ConnectionFactory.getConnection();
    }

    // Insere um usuario no banco
    public void cadastrar(Usuario usuario) throws SQLException {
        PreparedStatement stm = conexao.prepareStatement(
                "INSERT INTO tb_usuario (id_usuario, nome, email, senha) " +
                        "VALUES (seq_usuario.nextval, ?, ?, ?)"
        );
        stm.setString(1, usuario.getNome());
        stm.setString(2, usuario.getEmail());
        stm.setString(3, usuario.getSenha());
        stm.executeUpdate();
        stm.close();
    }

    // Busca todos os usuarios do banco
    public List<Usuario> getAll() throws SQLException {
        PreparedStatement stm = conexao.prepareStatement(
                "SELECT * FROM tb_usuario"
        );
        ResultSet rs = stm.executeQuery();
        List<Usuario> lista = new ArrayList<>();
        while (rs.next()) {
            Usuario u = new Usuario(
                    rs.getInt("id_usuario"),
                    rs.getString("nome"),
                    rs.getString("email"),
                    rs.getString("senha")
            );
            lista.add(u);
        }
        stm.close();
        return lista;
    }

    public void fecharConexao() throws SQLException {
        conexao.close();
    }
}