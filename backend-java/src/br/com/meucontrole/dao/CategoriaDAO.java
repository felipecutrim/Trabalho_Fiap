package br.com.meucontrole.dao;

import br.com.meucontrole.Categoria;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDAO {

    private Connection conexao;

    public CategoriaDAO() throws SQLException {
        this.conexao = ConnectionFactory.getConnection();
    }

    // Insere uma categoria no banco
    public void cadastrar(Categoria categoria) throws SQLException {
        PreparedStatement stm = conexao.prepareStatement(
                "INSERT INTO tb_categoria (id_categoria, nome, descricao) " +
                        "VALUES (seq_categoria.nextval, ?, ?)"
        );
        stm.setString(1, categoria.getNome());
        stm.setString(2, categoria.getDescricao());
        stm.executeUpdate();
        stm.close();
    }

    // Busca todas as categorias do banco
    public List<Categoria> getAll() throws SQLException {
        PreparedStatement stm = conexao.prepareStatement(
                "SELECT * FROM tb_categoria"
        );
        ResultSet rs = stm.executeQuery();
        List<Categoria> lista = new ArrayList<>();
        while (rs.next()) {
            Categoria c = new Categoria(
                    rs.getInt("id_categoria"),
                    rs.getString("nome"),
                    rs.getString("descricao")
            );
            lista.add(c);
        }
        stm.close();
        return lista;
    }

    public void fecharConexao() throws SQLException {
        conexao.close();
    }
}