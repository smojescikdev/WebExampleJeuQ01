package pl.codesrslab.Examples.webexamplejeuw01.session.zad2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Session2Servlet", value = "/Session2Servlet")
public class Session2Servlet extends HttpServlet {
    final static String FORM_TEMPLATE = "<form method='post'>" +
            "Ocena: <input type='number' name='grade' />" +
            "<input type='submit' />" +
            "</form>";


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.getWriter().println(FORM_TEMPLATE);
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().println(FORM_TEMPLATE);


        System.out.println("przyszly dane z formularza");
        String gradeStr = request.getParameter("grade");
        try {

            int grade = Integer.parseInt(gradeStr);
            HttpSession session = request.getSession();
            List<Integer> grades = (List<Integer>) session.getAttribute("grades");
            if (grades == null) {
                grades = new ArrayList<>();
            }
            grades.add(grade);
            session.setAttribute("grades", grades);
            response.getWriter().println("Notes: " + grades.toString());

            double avg = grades.stream().mapToInt(Integer::intValue).average().orElse(Double.NaN);
            response.getWriter().println("AVG:= " + avg);


        } catch (NumberFormatException e) {
            response.getWriter().println("Nieprawidłowe dane" + gradeStr);
        }


    }
}