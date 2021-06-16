/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class daoEntregas {
     public Connection conexao;
    private PreparedStatement stmt;
    
    public daoEntregas()
    {
    conexao = new ClasseConexao.fabricaConexao().conecta();
    
    } 
    
    public void inserir(modelo.modeloEntregas ent) throws SQLException
    {
    String sql = "INSERT INTO entregas(previsao,status,id_pedido) VALUES (?,?,?)";
    stmt = conexao.prepareStatement(sql);
    stmt.setDate(1,ent.getPrevisao());
    stmt.setString(2, ent.getStatus());
    stmt.setInt(3,ent.getId_pedido());
   
    stmt.execute();
    stmt.close();
    }
}
