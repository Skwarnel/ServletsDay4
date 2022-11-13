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
  <title>My JSP 2 - I can :)</title>
</head>
<body>
<form action="/mvc13" method="POST">
  <label>
    Autor:
    <input type="text" name="author">
  </label>
  <label>
    title:
    <input type="text" name="title">
  </label>
  <label>
    ISBN:
    <input type="text" name="isbn">
  </label>
  <button type="submit">Send</button>
</form>
  <h3>Book: ${title}</h3>
  <h2>Author ${author}</h2>
  <h2>ISBN ${isbn}</h2>
</body>
</html>
