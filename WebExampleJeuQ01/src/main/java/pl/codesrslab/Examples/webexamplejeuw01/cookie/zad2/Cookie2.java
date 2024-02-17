package pl.codesrslab.Examples.webexamplejeuw01.cookie.zad2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/addToCookies")
public class Cookie2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Pobierz wartości z formularza
        String key = request.getParameter("key");
        String value = request.getParameter("value");

        // Sprawdź, czy klucz i wartość nie są puste
        if (key != null && !key.isEmpty() && value != null && !value.isEmpty()) {
            // Utwórz nowe ciasteczko
            Cookie newCookie = new Cookie(key, value);

            // Dodaj ciasteczko do odpowiedzi
            response.addCookie(newCookie);

            response.getWriter().println("Ciasteczko dodane pomyślnie.");
        } else {
            response.getWriter().println("Błąd: Klucz i wartość nie mogą być puste.");
        }
    }
}