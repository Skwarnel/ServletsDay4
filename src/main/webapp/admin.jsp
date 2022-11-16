<%--
  Created by IntelliJ IDEA.
  User: griegoriens
  Date: 16.11.2022
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>I am learnign so fast</title>
</head>
<body>
    <p>Very top secret content</p>
    <h2>Logout</h2>
    <form action="/admin/veryTopSecret" method="POST">
        <button type="submit">Come in</button>
    </form>
    <form action="/logout" method="POST">
        <button type="submit">Logout</button>
    </form>
</body>
</html>
