
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<html>
<head>
    <title>All Users</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>

</body>


<form action="ServletPostUpdate" method="post">
    <dl>
        <dt>ID</dt>
        <dd><input hidden type="text " name="id" value="${user.pid}"/></dd>
    </dl>
    <dl>
        <dt>Name</dt>
        <dd><input type="text" name="name" value="${user.name}"/></dd>
    </dl>
    <dl>
        <dt>Surname</dt>
        <dd><input type="text" name="surname" value="${user.surname}"/></dd>
    </dl>
    <dl>
        <dt>Age</dt>
        <dd><input type="text" name="age" value="${user.age}"/></dd>
    </dl>
    <button type="submit">Save</button>
</form>
</div>
</html>
