<%--
  Created by IntelliJ IDEA.
  User: siarhei
  Date: 12.02.2022
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<section>
    <jsp:useBean id="user" scope="request" type="servlets.ServletAddUser"/>
    <form method="post" action="bot?action=submit">
        <dl>
            <dt>ID: </dt>
            <dd><input type="number" name="id" value="${bot.id}" placeholder="${bot.id}" /></dd>
        </dl>
        <dl>
            <dt>Name: </dt>
            <dd><input type="text" name="name" value="${bot.name}" placeholder="${bot.name}" /></dd>
        </dl>
        <dl>
            <dt>Serial number: </dt>
            <dd><input type="number" name="serial" value="${bot.serial}" placeholder="${bot.serial}" /></dd>
        </dl>
        <button type="submit">Save</button>
    </form>
</section>
</body>
</html>
