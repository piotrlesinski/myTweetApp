<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags"%>
<html>
<head>
    <title>home</title>
</head>

<header>
    <jsp:include page="menu.jsp"/>
</header>

<body>
<h3><spring:message code="hello.message" arguments="${person.nick}"/></h3>


<a href="/api/user/add">Add user</a><br>
<a href="/api/user/all">All users</a><br>
<a href="/api/user/edit/{id}">Edit user</a><br>
<a href="/api/user/delete">Delete user</a><br>
<a href="/api/task/add">Add task</a><br>
<a href="/api/task/all">All tasks</a><br>
<a href="/api/task/edit/{id}">Edit task</a><br>
<a href="/api/task/delete">Delete task</a><br>

</body>
</html>
