<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All tasks</title>
</head>
<body>

<table>

    <tbody>
    <tr>
        <td>First name</td>
        <td>Last name</td>
        <td>Email</td>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.firstname}</td>
            <td>${user.lastname}</td>
            <td>${user.email}</td>
            <td><a href="/api/user/edit?id=${user.id}" name="EDIT">EDIT</a>
                <a href="/api/user/delete?id=${user.id}" name="DELETE">DELETE</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
