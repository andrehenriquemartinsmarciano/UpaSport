

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "modelo.modeloClientes" %>
<%@page import = "dao.daoClientes" %>
<%
                   
        daoClientes dao = new daoClientes();
       List<modeloClientes> listar = dao.getAllusers();
       
%>
                   
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
            <td>Id_Cliente : </td>
            <td>Nome : </td>
            <td>Cpf : </td> 
            <td>E-mail : </td> 
            <td>id_Endereco : </td> 
            <td>Botao </td>
            </tr>
            </thead>  
            <tbody>
               
                <% for (modelo.modeloClientes registro : listar) { %>
                 <tr>
                    <td><%= registro.getId_cliente() %></td>        
                    <td><%= registro.getNome() %></td> 
                    <td><%= registro.getCpf() %></td> 
                    <td><%= registro.getEmail() %></td> 
                    <td><%= registro.getId_endereco() %></td>
                    <td><a href='editaClientes.jsp?id=<%= registro.getId_cliente()%>'><button type='button'>Editar</button></a></td>
                  </tr>  
                <%  }   %>  
                
            </tbody>     
        </table>
    </body>
</html>
