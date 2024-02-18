<%--Zadanie 2 - rozwiązywane z wykładowcą--%>
<%--W projekcie stwórz servlet Mvc12 dostępny pod adresem /mvc12 , który wczyta dwie zmienne GET : start i end . Następnie:--%>

<%--W servlecie zwiększ obie wartości o wartość 10, przekaż zwiększone zmienne do widoku jsp2.jsp.--%>
<%--W widoku wyświetl wszystkie liczby od start do end.--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--za pomoca ponizszej linijki mozemy uzywac biblioteki znacnzikow jsptl--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>mvc zad3</title>
    <style>
        .dark {
            background-color: darkseagreen;
        }
    </style>
</head>
<body>

<form method="post" action="Mvc13">
    <label for="title">
        Title:
        <input name="title" id="title">
    </label>

    <label for="author">
        Author:
        <input name="author" id="author">
    </label>

    <label for="isbn">
        ISBN:
        <input name="isbn" id="isbn">
    </label>


    <div>
        <input type="submit" id="submit">
    </div>


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
