package serv;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import clasesUsuarios.Usuarios;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
/**
 *
 * @author Belian
 */
public class ServLogin extends HttpServlet {
    @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response)
  throws IOException, ServletException
  {
       String usname = request.getParameter("user");
       String pass = request.getParameter("password");
       String s = "";
       HttpSession objSesion = request.getSession(true);
       Usuarios u = new Usuarios();
        try {
            if (u.Login(usname, pass) == true) {
                        objSesion.setAttribute("usuario", usname);
                        objSesion.setAttribute("perfil", u.getPerfil());
                        objSesion.setAttribute("log", "false");
                        //Redireciona en caso de que el usuario este registrado.
                        String redireccion = "systemIndex.jsp";
                        RequestDispatcher view = request.getRequestDispatcher(redireccion);
                        view.forward(request, response);
            } else {
                request.setAttribute("message", "<div id='login_error'><strong>Error:</strong> Nombre de Usuario o Contraseña Incorrectos, porfavor intente de nuevo.</div>");
                RequestDispatcher view = request.getRequestDispatcher("index.jsp");
                view.forward(request, response);
            }
        } catch (SQLException ex) {
            s = ex.toString();
            Logger.getLogger(ServLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
       PrintWriter out = response.getWriter();
       out.println(u.getSt() + s);
  }
     
}
