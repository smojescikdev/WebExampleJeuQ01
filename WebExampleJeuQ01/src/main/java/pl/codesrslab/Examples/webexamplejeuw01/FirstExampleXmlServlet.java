package pl.codesrslab.Examples.webexamplejeuw01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FirstExampleXmlServlet extends HttpServlet {
//http://localhost:8080/WebExample//superservlet
    // in web.xml defined
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            //    req.xxx   is to take data from client to app/server
            resp.getWriter().println("superServlet"); // will be displayed on Web to Client
            System.out.println("superServlet");
        }
    }

