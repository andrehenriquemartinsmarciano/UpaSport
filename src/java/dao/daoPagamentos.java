/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class daoPagamentos {
   public Connection conexao;
    private PreparedStatement stmt;  
    public daoPagamentos(){
     conexao = new ClasseConexao.fabricaConexao().conecta();
}
    
    public void inserir(modelo.modeloPagamentos pag) throws SQLException
    {
    String sql = "INSERT INTO pagamentos (forma) VALUES (?)";
    stmt = conexao.prepareStatement(sql);
    stmt.setString(1, pag.getForma());
    stmt.execute();
    stmt.close();
    }
}