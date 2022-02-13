<%@ page import="model.User" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: siarhei
  Date: 12.02.2022
  Time: 0:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <title>All Users</title>
</head>
<body>
<% List<User> users = (List<User>) request.getAttribute("users");%>
</body>
<tbody>
<H1>All users</H1>
<table>
    <thread>
        <tr>
            <th>ID</th>
            <th>Имя</th>
            <th>Фамилия</th>
            <th>Возраст</th>
        </tr>
    </thread>
    <%for (User user : users) {%>
    <tr>
        <td><%=user.getPid()%>
        </td>
        <td><%=user.getName()%>
        </td>
        <td><%=user.getSurname()%>
        </td>
        <td><%=user.getAge()%>
        </td>
    </tr>
    <%}%>

    </tbody>
</table>
<br><br><br><br><br><br><br><br>
<H1>Add user</H1>
<form action="FirstSerlet" method="POST">
    Name: <input name="name"/>
    <br><br>
    Surname: <input name="surname"/>
    <br><br>
    Age: <input name="age"/>
    <br><br>


    <br><br>
    <input type="submit" value="Submit"/>
</form>
</html>
