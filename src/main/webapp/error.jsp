<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%--
  Created by IntelliJ IDEA.
  User: griegoriens
  Date: 16.11.2022
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>I am really the best</title>
</head>
<body>
    <h2>Wprowadziłeś błędne dane</h2>
    <c:out value="${param.user}" default="guest"/>
    <c:out value="${param.pass}" default="guest"/>
</body>
</html>
