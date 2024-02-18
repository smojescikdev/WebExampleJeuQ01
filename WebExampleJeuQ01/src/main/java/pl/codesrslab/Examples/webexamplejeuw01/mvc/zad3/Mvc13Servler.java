package pl.codesrslab.Examples.webexamplejeuw01.mvc.zad3;

import pl.codesrslab.Examples.webexamplejeuw01.mvc.zad3.controler.Book;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Mvc13", value = "/Mvc13")
public class Mvc13Servler extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //przekierwoanie do warstwy widoku jsp3.jsp
        getServletContext().getRequestDispatcher("/WEB-INF/jsp3.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // pobieramy parametry z form1.html
        String titleStr = request.getParameter("title");
        String authorStr = request.getParameter("author");
        String isbnStr = request.getParameter("isbn");

        Book book = new Book(titleStr, authorStr, isbnStr);
        request.setAttribute("book", book);

        // przekierowanie do warstwy widoku jsp3.jsp
        getServletContext().getRequestDispatcher("/WEB-INF/result3.jsp").forward(request, response);
        System.out.println("/WEB-INF/result.jsp");
    }

}
