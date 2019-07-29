<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit task</title>
</head>
<body>

<form:form method="post" action="/task/edit" modelAttribute="task">
    <form:hidden path="id"/>

    <p>User: <form:radiobutton path="user" items="${users}" itemValue="id"/></p>

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
