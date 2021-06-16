/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class daoPedidos {
     public Connection conexao;
    private PreparedStatement stmt;
    
     public daoPedidos(){
     conexao = new ClasseConexao.fabricaConexao().conecta();
}
     
     public void inserir(modelo.modeloPedidos ped) throws SQLException
    {
    String sql = "INSERT INTO pedidos (id_cliente,id_produto,id_pagamento,valor_total,data_pedido) VALUES (?,?,?,?,?)";
    stmt = conexao.prepareStatement(sql);
    stmt.setInt(1,ped.getId_cliente());
    stmt.setInt(2,ped.getId_produto());
    stmt.setInt(3,ped.getId_pagamento());
    stmt.setFloat(4,ped.getValor_total());
    stmt.setDate(5,ped.getData_pedido());
    stmt.execute();
    stmt.close();
    }
}
