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
        <td>User</td>
        <td>Title</td>
        <td>Description</td>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.user}</td>
            <td>${task.title}</td>
            <td>${task.description}</td>
            <td><a href="/api/task/edit?id=${task.id}" name="EDIT">EDIT</a>
                <a href="/api/task/delete?id=${task.id}" name="DELETE">DELETE</a>
                </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
