/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlar;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author marcelo
 */
@WebServlet(name = "controleItensPedidos", urlPatterns = {"/controleItensPedidos"})
public class controleItensPedidos extends HttpServlet {

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       int  id_pedido = Integer.parseInt(request.getParameter("id_pedido"));
       int  id_produto = Integer.parseInt(request.getParameter("id_produto"));
       int quantidade  = Integer.parseInt(request.getParameter("quantidade"));
       float valor_unitario  = Float.parseFloat(request.getParameter("id_pedido"));
    }


}
