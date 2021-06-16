/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class daoFornecedores {
     public Connection conexao;
    private PreparedStatement stmt;
    
    public daoFornecedores()
    {
    conexao = new ClasseConexao.fabricaConexao().conecta();
    
    } 
    
    public void inserir(modelo.modeloFornecedores forn) throws SQLException
    {
    String sql = "INSERT INTO fornecedores (nome,cnpj,insc_estadual,email,id_endereco) VALUES (?,?,?,?,?)";
    stmt = conexao.prepareStatement(sql);
    stmt.setString(1, forn.getNome());
    stmt.setInt(2,forn.getCnpj());
    stmt.setInt(3,forn.getCnpj());
    stmt.setInt(4,forn.getInsc_estadual());
    stmt.setInt(5, forn.getId_endereco());
    stmt.execute();
    stmt.close();
    }
}
