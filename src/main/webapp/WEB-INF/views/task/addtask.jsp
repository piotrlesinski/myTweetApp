<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>addtask</title>
</head>
<body>

<form:form method="post" action="/api/task/add" modelAttribute="task">
    <p>User: <form:radiobutton path="user" items="${users}" itemValue="id" itemLabel="User"/></p>

    <p>Type: <form:radiobutton path="tasktype" value="low"/></p>
    <p>Type: <form:radiobutton path="tasktype" value="medium"/></p>
    <p>Type: <form:radiobutton path="tasktype" value="high"/></p>

    <p>Title: <form:textarea path="title" rows="3"
                             cols="20"/></p>
    <p>Description: <form:textarea path="description" rows="10"
                             cols="100"/></p>

    <p><input type="submit" value="Save"></p>
</form:form>
</body>
</html>
