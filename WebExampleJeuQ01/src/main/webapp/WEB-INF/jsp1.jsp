<%--
  Created by IntelliJ IDEA.
  User: Mojescik
  Date: 18.02.2024
  Time: 12:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--za pomoca ponizszej linijki mozemy uzywac biblioteki znacnzikow jsptl--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>mvc zad1</title>
</head>
<body>
<%--Zadanie 1 - rozwiązywane z wykładowcą--%>
<%--W projekcie stwórz jsp1.jsp.--%>

<%--Dołącz do projektu bibliotekę jstl.--%>
<%--W projekcie stwórz servlet Mvc11 dostępny pod adresem /mvc11.--%>
<%--W servlecie w metodzie GET pobierz parametr o nazwie role a następnie zamień zawartość na wielkie litery
oraz dodaj prefix ROLE_ (dla wartości manager otrzymamy ROLE_MANAGER).--%>
<%--Ustaw atrybut o nazwie userRole ze zmienioną wartością.--%>
<%--Ustaw plik jsp jako plik widoku dla tego servletu.--%>
<%--W przypadku braku wartości ma się wyświetlić napis guest.--%>

<p><c:out value="${userRole}" default="guest"/></p>


</body>
</html>
