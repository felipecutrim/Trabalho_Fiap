package br.com.meucontrole.dao;

import br.com.meucontrole.Transacao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TransacaoDAO {

    private Connection conexao;

    public TransacaoDAO() throws SQLException {
        this.conexao = ConnectionFactory.getConnection();
    }

    // Insere uma transacao no banco
    public void cadastrar(Transacao transacao) throws SQLException {
        PreparedStatement stm = conexao.prepareStatement(
                "INSERT INTO tb_transacao (id_transacao, tipo, valor, data) " +
                        "VALUES (seq_transacao.nextval, ?, ?, ?)"
        );
        stm.setString(1, transacao.getTipo());
        stm.setDouble(2, transacao.getValor());
        stm.setString(3, transacao.getData());
        stm.executeUpdate();
        stm.close();
    }

    // Busca todas as transacoes do banco
    public List<Transacao> getAll() throws SQLException {
        PreparedStatement stm = conexao.prepareStatement(
                "SELECT * FROM tb_transacao"
        );
        ResultSet rs = stm.executeQuery();
        List<Transacao> lista = new ArrayList<>();
        while (rs.next()) {
            Transacao t = new Transacao(
                    rs.getInt("id_transacao"),
                    rs.getString("tipo"),
                    rs.getDouble("valor"),
                    rs.getString("data")
            );
            lista.add(t);
        }
        stm.close();
        return lista;
    }

    public void fecharConexao() throws SQLException {
        conexao.close();
    }
}