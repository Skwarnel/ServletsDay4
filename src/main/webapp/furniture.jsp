<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%--
  Created by IntelliJ IDEA.
  User: griegoriens
  Date: 12.11.2022
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>My JSP - furniture</title>
</head>
<body>
<table>
    <c:forEach var="item" items="${furnitures}">
    <tr>
        <td>${item}</td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
