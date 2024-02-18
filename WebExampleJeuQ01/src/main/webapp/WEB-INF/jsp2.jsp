<%--
  Created by IntelliJ IDEA.
  User: Mojescik
  Date: 18.02.2024
  Time: 12:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--za pomoca ponizszej linijki mozemy uzywac biblioteki znacnzikow jsptl--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>mvc zad1</title>
    <style>
        .dark {
            background-color: darkseagreen;
        }
    </style>
</head>
<body>
<%--  TO TEST!!     http://localhost:8080/WebExample/Mvc12?start=2&end=26--%>
<c:if test="${not empty start}">
    <table>
        <tr>
            <th>number</th>
        </tr>
        <c:forEach var="number" begin="${start}" end="${end}" varStatus="stat">
            <tr ${stat.count % 2 == 0 ? "class='dark'" : ""}>
                <td>${number}</td>
            </tr>


        </c:forEach>
    </table>
</c:if>
</body>
</html>
