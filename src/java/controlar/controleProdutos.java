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
@WebServlet(name = "controleProdutos", urlPatterns = {"/controleProdutos"})
public class controleProdutos extends HttpServlet {

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     String descricao = request.getParameter("descricao");
     float  precoUnitario = Float.parseFloat(request.getParameter("precoUnitario"));
     float  precoVenda = Float.parseFloat(request.getParameter("precoVenda"));
      int   estoque =   Integer.parseInt(request.getParameter("estoque")); 
      int   id_fornecedor = Integer.parseInt(request.getParameter("id_fornecedor"));
    }

   

}
