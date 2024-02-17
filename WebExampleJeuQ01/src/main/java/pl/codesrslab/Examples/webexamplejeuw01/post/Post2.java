package pl.codesrslab.Examples.webexamplejeuw01.post;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Post2", value = "/Post2")
public class Post2 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //  System.out.println("odebrano dane"); // wypisuje w konsoli

        //pobieramy parametry z form1.html
        String text = req.getParameter("text");
        String acknowledge = req.getParameter("acknowledge");

        if (acknowledge == null) {
            resp.getWriter().println(Censor.doCensor(text));
            return;
        }

//wyswietla na stronie wpisane paramtery
        resp.getWriter().println(acknowledge + " " + text);
    }
}