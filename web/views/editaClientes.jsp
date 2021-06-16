<%-- 
    Document   : editaClientes
    Created on : 02/05/2021, 10:44:53
    Author     : marcelo
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="ClasseConexao.fabricaConexao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "modelo.modeloClientes" %>
<%@page import = "dao.daoClientes" %>
<!DOCTYPE html>

 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <div id="divCenter">
             
             <% 
     fabricaConexao conectar = new fabricaConexao();
            Connection con;
            int id = Integer.parseInt(request.getParameter("id"));
            out.print(id);
            PreparedStatement stmt;
            con = conectar.conecta();
            ResultSet rs;
            String sql = "select * from clientes where id_cliente='" + id + "'";
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
        %>
            <form  method="post"  action="../clientes">
            <label>Id</label><br>
            <input type="text" name="id_cliente" value="<%= rs.getString("id_cliente")%>"/><br>
            <label>Nome</label><br>
            <input type="text" name="nome" value="<%= rs.getString("nome")%>"/><br>
            <label>Cpf</label><br>
            <input type="text" name="cpf"  value="<%= rs.getString("cpf")%>" /><br>
            <label>E-mail</label><br>
            <input type="text" name="email"  value="<%= rs.getString("email")%>" /><br>
            <label>Endereco</label><br>
            <input type="text" name="id_endereco" value="<%= rs.getString("id_endereco")%>"/><br>
            <input type="submit" name="altera" value="Alterar"/>     
        </form>
            
            <%
            }
            con.close();


        %>
        </div>
    </body>
</html>