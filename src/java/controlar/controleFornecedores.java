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

/**
 *
 * @author marcelo
 */
@WebServlet(name = "controleFornecedores", urlPatterns = {"/controleFornecedores"})
public class controleFornecedores extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String nome = request.getParameter("nome");
       int cnpj = Integer.parseInt(request.getParameter("cnpj"));
       int insc_estadual = Integer.parseInt(request.getParameter("insc_estadual"));
       String email = request.getParameter("email");
       int id_endereco = Integer.parseInt(request.getParameter("id_endereco"));
               
    }

  

}
