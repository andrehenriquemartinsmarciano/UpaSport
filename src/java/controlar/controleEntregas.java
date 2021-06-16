/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlar;

import java.io.IOException;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author marcelo
 */
@WebServlet(name = "controleEntregas", urlPatterns = {"/controleEntregas"})
public class controleEntregas extends HttpServlet {

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      Date previsao = Date.valueOf(request.getParameter("previsao")) ;
      String status = request.getParameter("status");
      int id_pedido = Integer.parseInt(request.getParameter("id_pedido"));
    }

   
}
