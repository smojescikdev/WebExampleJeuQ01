package pl.codesrslab.Examples.webexamplejeuw01.post;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "post1", value = "/post1")
public class post1 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //  System.out.println("odebrano dane"); // wypisuje w konsoli

        //pobieramy parametry z form1.html
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");


//wyswietla na stronie wpisane paramtery
        resp.getWriter().println("Witaj, " + firstName + " " + lastName);
    }
}