<%@page import="java.util.*, Models.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Liste des étudiants</title>
    <style>
        h1 {
            text-align: center;
            color: #333;
        }
    </style>
</head>
<body>
<%! String fili; %>
<%
    fili = request.getParameter("fi");
    List<Etudiant> list_etd = (ArrayList<Etudiant>) request.getAttribute("filier");
%>

<h1>Liste des étudiants de la filière: <%= fili %></h1>

<table border="1" align="center">
    <tr>
        <th>CNE</th>
        <th>Nom</th>
        <th>Prénom</th>
        <th>Filière</th>
    </tr>

    <%
        Iterator<Etudiant> it = list_etd.iterator();
        while(it.hasNext()) {
            Etudiant et = it.next();
    %>

    <tr>
        <td><%= et.getCne() %></td>
        <td><%= et.getNom() %></td>
        <td><%= et.getPrenom() %></td>
        <td><%= et.getFiliere() %></td>
    </tr>

    <%
        }
    %>
</table>

<a href="index.jsp">Retour</a>
</body>
</html>