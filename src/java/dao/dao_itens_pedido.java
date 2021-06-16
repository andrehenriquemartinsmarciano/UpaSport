
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class dao_itens_pedido {
     public Connection conexao;
    private PreparedStatement stmt;
    
    public dao_itens_pedido(){
     conexao = new ClasseConexao.fabricaConexao().conecta();
}
    
    public void inserir(modelo.modelo_itens_pedidos itens) throws SQLException
    {
    String sql = "INSERT INTO itens_pedidos(id_pedido,id_produto,quantidade,valor_unitario) VALUES (?,?,?,?)";
    stmt = conexao.prepareStatement(sql);
    stmt.setInt(1,itens.getId_pedido());
    stmt.setInt(2,itens.getId_produto());
    stmt.setInt(3,itens.getQuantidade());
    stmt.setFloat(4,itens.getValor_unitario());
    stmt.execute();
    stmt.close();
    }
    
}
