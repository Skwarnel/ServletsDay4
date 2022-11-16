<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%--
  Created by IntelliJ IDEA.
  User: griegoriens
  Date: 16.11.2022
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>I am really software developer :)</title>
</head>
<body>
<form action="/login" method="post">
  <input type="text"  name="username"/>
  <input name="password" type="password"/>
  <button type="submit">Zaloguj</button>
</form>
</body>
</html>
