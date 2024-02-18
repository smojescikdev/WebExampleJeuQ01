package pl.codesrslab.Examples.webexamplejeuw01.mvc.zad2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//  TO TEST!!     http://localhost:8080/WebExample/Mvc12?start=2&end=26--%>


@WebServlet(name = "Mvc12", value = "/Mvc12")
public class Mvc12Servlet extends HttpServlet {

    public static final String PREFIX = "ROLE";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String startStr = request.getParameter("start");
        String endStr = request.getParameter("end");

        try {
            final int start = Integer.valueOf(startStr) + 10;
            final int end = Integer.valueOf(endStr) + 10;
            request.setAttribute("start", start);
            request.setAttribute("end", end);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        //przekierwoanie do warstwy widoku jsp1.jsp
        getServletContext().getRequestDispatcher("/WEB-INF/jsp2.jsp").forward(request, response);
    }


}