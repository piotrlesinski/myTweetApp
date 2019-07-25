<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add User</title>A
</head>
<body>
<form:form method="post" action="api/user/adduser" modelAttribute="user">
    First Name <form:input path="firstName"/><br>
    Last Name <form:input path="lastName"/><br>
    Email <form:input path="email"/><br>
    Password <form:input path="password"/><br>
    <input type="submit" value="Save">

</form:form>

</body>
</html>
