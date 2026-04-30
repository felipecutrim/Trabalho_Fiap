package br.com.meucontrole.dao;

import br.com.meucontrole.Conta;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContaDAO {

    private Connection conexao;

    public ContaDAO() throws SQLException {
        this.conexao = ConnectionFactory.getConnection();
    }

    // Insere uma conta no banco
    public void cadastrar(Conta conta) throws SQLException {
        PreparedStatement stm = conexao.prepareStatement(
                "INSERT INTO tb_conta (id_conta, saldo, tipo_conta) " +
                        "VALUES (seq_conta.nextval, ?, ?)"
        );
        stm.setDouble(1, conta.getSaldo());
        stm.setString(2, conta.getTipoConta());
        stm.executeUpdate();
        stm.close();
    }

    // Busca todas as contas do banco
    public List<Conta> getAll() throws SQLException {
        PreparedStatement stm = conexao.prepareStatement(
                "SELECT * FROM tb_conta"
        );
        ResultSet rs = stm.executeQuery();
        List<Conta> lista = new ArrayList<>();
        while (rs.next()) {
            Conta c = new Conta(
                    rs.getInt("id_conta"),
                    rs.getDouble("saldo"),
                    rs.getString("tipo_conta")
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