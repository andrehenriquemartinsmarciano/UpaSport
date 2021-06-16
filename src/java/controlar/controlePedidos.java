/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlar;

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "controlePedidos", urlPatterns = {"/controlePedidos"})
public class controlePedidos extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       int id_cliente = Integer.parseInt(request.getParameter("id_cliente"));
       int  id_produto = Integer.parseInt(request.getParameter("id_produto"));
       int id_pagamento = Integer.parseInt(request.getParameter("id_pagamento"));
       float valor_total = Float.parseFloat(request.getParameter("valor_total"));
       Date data_pedido = Date.valueOf(request.getParameter("data_pedido"));
    }


}
