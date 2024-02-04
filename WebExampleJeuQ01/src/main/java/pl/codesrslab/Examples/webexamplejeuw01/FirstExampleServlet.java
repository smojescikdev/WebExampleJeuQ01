package pl.codesrslab.Examples.webexamplejeuw01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/firstServlet")
public class FirstExampleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    //    req.xxx   is to take data from client to app/server
        resp.getWriter().println("Hello my client."); // will be displayed on Web to Client
        System.out.println("hello wrold");
    }
}
