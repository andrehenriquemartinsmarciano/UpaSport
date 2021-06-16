/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlar;


import dao.daoUsuarios;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author marcelo
 */
@WebServlet(name = "controle_Usuarios", urlPatterns = {"/controle_Usuarios"})
public class controle_Usuarios extends HttpServlet {
int resposta;
modelo.modeloUsuarios usu = new modelo.modeloUsuarios();
dao.daoUsuarios dao =  new daoUsuarios();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            
            throws ServletException, IOException {
        
       String login = request.getParameter("login");
       String senha = request.getParameter("senha");
      usu.setLogin(login);
       usu.setSenha(senha);
     resposta = dao.validar(usu);
       if (resposta == 1) {
           
        HttpSession session =request.getSession(true);
        session.setAttribute("senha", senha);
           response.sendRedirect("views/principal.jsp");

        } else {
            response.sendRedirect("index.html");

       }
   }
    

}
