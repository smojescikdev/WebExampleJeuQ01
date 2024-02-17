package pl.codesrslab.Examples.webexamplejeuw01.post;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/getForm3")
public class Form3 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int num = Integer.parseInt(req.getParameter("page"));

        // That's should be a separate class!!
        if (num == 0) {
            resp.getWriter().println("Cannot calculate divisors for 0.");
            return;
        }
        resp.getWriter().println("Dividers of: " + num + " are: ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                resp.getWriter().println(i);
            }
        }
    }
}
