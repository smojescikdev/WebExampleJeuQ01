<%--
  Created by IntelliJ IDEA.
  User: Mojescik
  Date: 18.02.2024
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--Zadanie 3--%>
<%--W projekcie stwórz stronę third.jsp. --%>
<%--Następnie pobierz z GET wartości a i b, następnie je wyświetl, --%>
<%--w przypadku braku parametrów wyświetl napis brak.--%>
<div>
    <p>Parametr a = <%= request.getParameter("a") != null ? request.getParameter("a") : "brak" %>
    </p>
</div>
<div>
    <p>Parametr b = <%= request.getParameter("b") != null ? request.getParameter("b") : "brak" %>
    </p>

    <%--    http://localhost:8080/WebExample/third.jsp?a=5&b=10--%>
</div>
</body>
</html>
