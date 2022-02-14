
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>All Users</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>

</body>
<div class="container justify-content-center w-50">
    <tbody>
    <div class="container  justify-content-center"><H1>All users</H1></div>
    <table class="table">
        <thread>
            <tr>
                <th>ID</th>
                <th>Имя</th>
                <th>Фамилия</th>
                <th>Возраст</th>
            </tr>
        </thread>
        <form:forEach var="user" items="${users}">
            <c:url var="updateButton" value="/update">
                <c:param name="userId" value="${user.pid}"/>
            </c:url>
            <c:url var="deleteButton" value="/delete">
                <c:param name="userId" value="${user.pid}"/>
            </c:url>
            <tr>
                <td><c:out value="${user.pid}" /></td>
                <td><c:out value="${user.name}" /></td>
                <td><c:out value="${user.surname}" /></td>
                <td><c:out value="${user.age}" /></td>
                <td>
                    <input type="button" value="UPDATE"
                    onclick="window.location.href='${updateButton}'">
                    <input type="button" value="DELETE"
                    onclick="window.location.href='${deleteButton}'">
                </td>
            </tr>
        </form:forEach>

        </tbody>

    </table>
</div>
<div class="container justify-content-center w-50">
    <H1>Add user</H1>
    <form action="FirstServlet" method="POST">
        <div class="mb-3">
            <label for="name" class="form-label">Name</label>
            <input type="text" name="name" class="form-control" id="name">

        </div>
        <div class="mb-3">
            <label for="surname" class="form-label">Surname</label>
            <input type="text" name="surname" class="form-control" id="surname">
        </div>
        <div class="mb-3">
            <label for="age" class="form-label">Age</label>
            <input type="text" name="age" class="form-control" id="age">
        </div>

        <button type="submit" value="Submit" class="btn btn-primary">Add</button>
    </form>
</div>





</html>
