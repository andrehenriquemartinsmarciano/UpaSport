/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;



import ClasseConexao.fabricaConexao;
import modelo.modeloClientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class daoClientes {
private PreparedStatement stmt;    
private final Connection conexao; 
private ResultSet rs;
    
    
public daoClientes()
{
  conexao = new fabricaConexao().conecta();
}     

public void inserir(modeloClientes cli)
    {
    
        try 
        {
        String sql = "INSERT INTO clientes(nome,cpf,email,id_endereco) VALUES (?,?,?,?) ";
        stmt = conexao.prepareStatement(sql);
        stmt.setString(1,cli.getNome());
        stmt.setString(2,cli.getCpf());
        stmt.setString(3,cli.getEmail());
        stmt.setInt(4,cli.getId_endereco());
        stmt.execute();
        stmt.close();
        } catch (SQLException e) {
            e.getMessage();
        }
    
    }

   public List<modeloClientes> getAllusers()
   {
       List<modeloClientes> listaAll = new ArrayList<modeloClientes>();
       
       try
       {
       String sql = "SELECT * FROM clientes";    
      stmt = conexao.prepareStatement(sql);
      rs = stmt.executeQuery();
       while(rs.next()) // sair
       {
       modeloClientes mcli = new modeloClientes();
       mcli.setId_cliente(rs.getInt("id_cliente"));
       mcli.setNome(rs.getString("nome"));
       mcli.setCpf(rs.getString("cpf"));
       mcli.setEmail(rs.getString("email"));
       mcli.setId_endereco(rs.getInt("id_endereco"));
       listaAll.add(mcli);
      
       }
       stmt.close();
       conexao.close();
       }catch(SQLException e)
       {
           System.out.println("ERRO " +e);
       
       }
       
       
       
    return listaAll;
   }
    
  public void Update(modelo.modeloClientes cli) {
        try {
            String sql = "UPDATE clientes SET   nome=?, cpf=? , email = ?, id_endereco = ? WHERE id_cliente=?";

            stmt = conexao.prepareStatement(sql);
            stmt.setString(1,cli.getNome());
            stmt.setString(2,cli.getCpf());
            stmt.setString(3,cli.getEmail());
            stmt.setInt(4,cli.getId_endereco() );
            stmt.setInt(5,cli.getId_cliente() );
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }  
    
}
