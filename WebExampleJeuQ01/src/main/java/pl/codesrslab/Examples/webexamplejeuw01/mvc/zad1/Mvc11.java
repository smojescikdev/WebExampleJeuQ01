package pl.codesrslab.Examples.webexamplejeuw01.mvc.zad1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Mvc11", value = "/Mvc11")
public class Mvc11 extends HttpServlet {

    public static final String PREFIX = "ROLE";
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        final String role = request.getParameter("role");
        if (role != null) {
            final String roleTransformed = PREFIX + role.toUpperCase();
            request.setAttribute("userRole", roleTransformed);
        }
        //przekierwoanie do warstwy widoku jsp1.jsp
        getServletContext().getRequestDispatcher("/WEB-INF/jsp1.jsp").forward(request, response);
    }


}