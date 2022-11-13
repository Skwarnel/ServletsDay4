<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%--
  Created by IntelliJ IDEA.
  User: griegoriens
  Date: 12.11.2022
  Time: 00:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>My JSP 2 - I can :) </title>
</head>
<body>
<table>
    <c:forEach items="${books}" var="book">
        <tr>
            <td>${book}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
