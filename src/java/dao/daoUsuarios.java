/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;



import ClasseConexao.fabricaConexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.modeloUsuarios;

public class daoUsuarios {
      private final Connection conectar;
    private PreparedStatement stmt;
     private ResultSet rs;
     
   
   // private final ArrayList<usuarios> lista = new ArrayList<>();
    public daoUsuarios()
    {
    conectar = new fabricaConexao().conecta();
    }
   
    public int validar(modeloUsuarios usu)
    {
         int resultado = 0;
    String sql = "SELECT * FROM usuarios WHERE login = ? and senha = ?";
        try {
            
            stmt = conectar.prepareStatement(sql);
            stmt.setString(1,usu.getLogin());
            stmt.setString(2, usu.getSenha());
            rs = stmt.executeQuery();
            
            while (rs.next()) {   //1             
                usu.setLogin(rs.getString("login"));
                usu.setSenha(rs.getString("senha"));
                
                resultado=resultado+1;
            }
            if (resultado==1) {
               return 1;
            } else {
                return 0;
            }
            
        } catch (Exception e) {
             return 0;
        }
    
    }
}
