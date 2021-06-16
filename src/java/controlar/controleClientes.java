/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlar;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "clientes", urlPatterns = {"/clientes"})
public class controleClientes extends HttpServlet {

   

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        modelo.modeloClientes cli = new modelo.modeloClientes();
        
        dao.daoClientes dao =  new dao.daoClientes();
        
       String ins = request.getParameter("cadastro");
        if(ins != null) {
        
        String nome = request.getParameter("nome");
        String cpf =  request.getParameter("cpf");
        String email = request.getParameter("email");
        int id_endereco = Integer.parseInt(request.getParameter("id_endereco"));
       cli.setNome(nome);
       cli.setCpf(cpf);
       cli.setEmail(email);
       cli.setId_endereco(id_endereco);
       dao.inserir(cli);
      response.sendRedirect("views/listaClientes.jsp");
        }
      
       String edit = request.getParameter("altera");
        if(edit != null) {
        int id = Integer.parseInt(request.getParameter("id_cliente"));
        String nome = request.getParameter("nome");
        String cpf =  request.getParameter("cpf");
        String email = request.getParameter("email");
        int id_endereco = Integer.parseInt(request.getParameter("id_endereco"));
       cli.setId_cliente(id);
       cli.setNome(nome);
       cli.setCpf(cpf);
       cli.setEmail(email);
       cli.setId_endereco(id_endereco);
       dao.Update(cli);
      response.sendRedirect("views/listaClientes.jsp");
        }
      
      
      
      
      
    }

   

}
