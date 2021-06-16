
package modelo;




public class modelo_itens_pedidos {
  
    private int id_itens_pedido;
    private int id_pedido;
    private int id_produto;
    private int quantidade;
    private float valor_unitario;

    public int getId_itens_pedido() {
        return id_itens_pedido;
    }

    public void setId_itens_pedido(int id_itens_pedido) {
        this.id_itens_pedido = id_itens_pedido;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(float valor_unitario) {
        this.valor_unitario = valor_unitario;
    }
    
    
    
}
