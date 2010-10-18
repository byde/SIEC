<%-- 
    Document   : systemIndex
    Created on : 25/09/2010, 05:13:48 PM
    Author     : lugubrenator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
      HttpSession objSesion = request.getSession(true);
       String s = (String)objSesion.getAttribute("log");
       if((String)objSesion.getAttribute("log") == null || s.equals("false"))
       {}else
       {
            objSesion.setAttribute("usuario", null);
            objSesion.setAttribute("perfil", null);
       }
        //Redireciona en caso de que el usuario no este registrado.
       String redireccion = "index.jsp";
       if(objSesion.getAttribute("usuario") == null)
       {
            RequestDispatcher view = request.getRequestDispatcher(redireccion);
            view.forward(request, response);
       }
%>
<jsp:useBean id="usuariox" class="clasesUsuarios.Dpa" />

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>S I E C</title>
<link href="Librerias/Css/style.css" media="screen" rel="stylesheet" type="text/css" />
</head>

<body>
<div id="todo">
<div id="header">
    <div class="logo"><img alt="S I E C"  src="Librerias/Imagenes/logo.gif" /></div>
</div>
    <ul id="menuTop">
        <%
            String [][] menu = usuariox.getMenu();
            int i= 0;
            for( i = 0; i< menu.length; i++) { %>
    	<li><a href="<%=menu[i][1]%>"><%=menu[i][0]%></a></li>
        <% } %>
    </ul>
<div id="contenido"> &nbsp;
</div>
</div>
</body>
</html>