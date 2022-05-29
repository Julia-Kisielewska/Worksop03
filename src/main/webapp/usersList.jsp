<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>usersList</title>
</head>
<body>
<table class="table">
    <tr>
        <th>Id</th>
        <th>Nazwa użytkownika</th>
        <th>Email</th>
        <th>Akcja</th>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.userName}</td>
            <td>${user.email}</td>
            <td>
<%--                <a href='<c:url value="/user/delete?id=${user.id}"/>'>Usuń</a>--%>
<%--                <a href='<c:url value="/user/edit?id=${user.id}"/>'>Edit</a>--%>
<%--                <a href='<c:url value="/user/show?id=${user.id}"/>'>Pokaż</a>--%>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
