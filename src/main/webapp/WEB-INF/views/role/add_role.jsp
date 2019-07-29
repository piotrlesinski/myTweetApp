<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<body>

<form:form method="post" modelAttribute="roleDto" action="/role/add" >
    Role name: <form:input path="name"/>
    
</form:form>

</body>