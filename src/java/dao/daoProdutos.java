package dao;


import ClasseConexao.fabricaConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.modeloProdutos;

public class daoProdutos {
    private final Connection conectar;
    private PreparedStatement stmt;
    private ResultSet rs;
     
    public daoProdutos()
    {
    conectar = new fabricaConexao().conecta();
    }
    
    public void Inserir(modeloProdutos prod)
    {
        try {
            String sql = "INSERT INTO produtos (descricao,precoUnitario,precoVenda,estoque,id_fornecedor) VALUES (?,?,?,?,?)";
            stmt = conectar.prepareStatement(sql);
            stmt.setString(1,prod.getDescricao());
            stmt.setFloat(2,prod.getPrecoUnitario());
            stmt.setFloat(3,prod.getPrecoVenda());
            stmt.setInt(4,prod.getEstoque());
            stmt.setInt(5,prod.getId_fornecedor());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<modeloProdutos> getAllProdutos()
    {
    List<modeloProdutos> listaProdutos = new ArrayList<modeloProdutos>();
    
        try {
            
            String sql = "SELECT * FROM produtos";
            stmt = conectar.prepareStatement(sql);
            rs =  stmt.executeQuery();
            
            while(rs.next())
            {
               modeloProdutos prod = new  modeloProdutos();
               prod.setIdProduto(rs.getInt("id_produto"));
               prod.setDescricao(rs.getString("descricao"));
               prod.setPrecoUnitario(rs.getFloat("preco_unitario"));
               prod.setPrecoVenda(rs.getFloat("preco_venda"));
               prod.setEstoque(rs.getInt("estoque"));
               prod.setId_fornecedor(rs.getInt("id_fornecedor"));
               listaProdutos.add(prod);
            }
            stmt.close();
            conectar.close();
            
            
            
        } catch (Exception e) {
            System.out.println("ERRO"+e);
        }
    
    
    
    
    return listaProdutos;
    }
    
    
    
    
}
