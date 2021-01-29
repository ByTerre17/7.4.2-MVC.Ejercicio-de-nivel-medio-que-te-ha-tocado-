<%-- 
    Document   : muestraDatos
    Created on : 29 ene. 2021, 13:03:55
    Author     : manue
--%>

<%@page import="modelo.nomina"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <% nomina nom = (nomina)request.getAttribute("nomina");%>
        <h1>Bienvenido: <%=nom.getNombre()%> <%=nom.getApellidos()%></h1>
        <h2>El salario de su nomina con retencion es  <%=nom.getSalario() %></h2>
    </body>
</html>
