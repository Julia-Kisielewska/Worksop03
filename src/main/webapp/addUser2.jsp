<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>addUser</title>
</head>
<body>

Dodaj użytkownika

<form action = "/servletTest" method ="post">
    <input type="hidden" name="id" value="${user.id}"/>
    <input type = "text" name = "Nazwa" value="${user.userName}"/>
    <input type = "text" name = "Email" value="${user.email}"/>
    <input type = "text" name = "Hasło" value="Hasło"/>

    <button type="submit">Zapisz</button>

</form>

</body>
</html>
