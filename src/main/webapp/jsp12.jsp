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
    <title>My JSP 2</title>
</head>
<body>
    Start od użytkownika: ${param.start}
    End od użytkownika: ${param.end}

    Start: ${intStart}
    End: ${intEnd}

    <c:forEach begin="${start}" end="${end}" var="iteracja">
      <h3>Kolejny index: ${iteracja}</h3>
    </c:forEach>
</body>
</html>
