/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class daoEnderecos {
    public Connection conexao;
    private PreparedStatement stmt;
    
    public daoEnderecos()
    {
    conexao = new ClasseConexao.fabricaConexao().conecta();
    
    } 
    
    public void inserir(modelo.modeloEndereco end) throws SQLException
    {
    String sql = "INSERT INTO enderecos(logradouro,numero,bairro,complemento,cep,cidade,estado) VALUES (?,?,?,?,?,?,?)";
    stmt = conexao.prepareStatement(sql);
    stmt.setString(1, end.getLogradouro());
    stmt.setInt(2, end.getNumero());
    stmt.setString(3, end.getBairro());
    stmt.setString(4, end.getComplemento());
    stmt.setInt(5, end.getCep());
    stmt.setString(6, end.getCidade());
    stmt.setString(7, end.getEstado());
    stmt.execute();
    stmt.close();
    }
    
    
    
}
