<%-- 
    Document   : listarProdutos
    Created on : 07/05/2021, 10:13:30
    Author     : marcelo
--%>

<%@page import="java.util.List"%>
<%@page import="dao.daoProdutos"%>
<%@page import="modelo.modeloProdutos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <table border="1">
            
            <thead>
                <tr>
                    <td>Id Produto: </td>
                    <td>Descricao: </td>
                    <td>Preco Unitario: </td>
                    <td>Preco Venda: </td>
                    <td>Estoque: </td>
                    <td>Id Fornecedor: </td>
                </tr>    
            </thead>
            
            <tbody>
                 <% for(modeloProdutos produto : listap){ %>
                <tr>
                   
                    <td><%= produto.getIdProduto() %>   </td>
                    <td><%= produto.getDescricao() %></td>
                    <td><%= produto.getPrecoUnitario() %></td>
                    <td><%= produto.getPrecoVenda() %></td>
                    <td><%= produto.getEstoque() %></td>
                    <td><%= produto.getId_fornecedor() %></td>
                    <td> <a href='editaProdutos.jsp?id= <%= produto.getIdProduto() %> '><button>Editar</button> </a></td>
                </tr>
                 <%} %>
            </tbody>
            
            
            
            
        </table>
        
        
    </body>
</html>
