package cna.nl.juliaforward.java3.java3a02;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "libraryData", value = "/library-data")
public class LibraryData extends HttpServlet {
    private String message;

    public void init() {
        message = "Library List!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>\uD83D\uDC0D" + message + "\uD83D\uDC0D</h1>");
        out.println("<h3><button><a href=\"index.jsp\">Home</a></button></h3>");
        out.println("</body></html>");

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>\uD83D\uDC0D" + "Adding new " + request.getParameter("type") + "\uD83D\uDC0D</h1>");
        out.println("<h3><button><a href=\"index.jsp\">Home</a></button></h3>");
        out.println("</body></html>");

        if (request.getParameter("type") == "book") {

        } else {

        }
    }

    public void destroy() {
    }
}
