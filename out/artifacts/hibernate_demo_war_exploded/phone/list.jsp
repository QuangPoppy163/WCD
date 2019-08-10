<%@ page import="entity.Phone" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: VuPhuc
  Date: 8/10/2019
  Time: 7:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    ArrayList<Phone> listPhone = (ArrayList<Phone>) request.getAttribute("listPhone");
%>
<html lang="en">
<head>
    <title>List Phone</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <h2>List Phone</h2>
    <table class="table">
        <thead>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Brand</th>
            <th>Price</th>
            <th>Description</th>
        </tr>
        </thead>
        <tbody>
        <%
            for(int i = 0; i < listPhone.size(); i++)
            {
        %>
        <tr>
            <td><%=listPhone.get(i).getId()%></td>
            <td><%=listPhone.get(i).getName()%></td>
            <td><%=listPhone.get(i).getBrand()%></td>
            <td><%=listPhone.get(i).getPrice()%></td>
            <td><%=listPhone.get(i).getDescription()%></td>
        </tr>
        <%
            }
        %>
        </tbody>
    </table>
</div>

</body>
</html>
