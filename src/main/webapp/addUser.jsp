<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>addUser</title>
</head>
<body>

Dodaj użytkownika

<form action = "/post1" method ="post">
    <input type = "text" name = "Nazwa" value="Nazwa"/>
    <input type = "text" name = "Email" value="Email"/>
    <input type = "text" name = "Hasło" value="Hasło"/>

    <button type="submit">Zapisz</button>

</form>

</body>
</html>
