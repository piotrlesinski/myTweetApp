<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<body>

<div>
    <table width="100%">
        <thead>
        <tr>
            <th>ID</th>
            <th>Nazwa</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${roles}" var="role">
            <tr >
                <td>${role.id}</td>
                <td>${role.name}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>