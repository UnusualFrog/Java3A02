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

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<p>test</p>");
        out.println("<h3><a href=\"index.jsp\">Home</a></h3>");
        out.println("</body></html>");

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + "Whats up posting new book" + "</h1>");
        out.println("<h3><a href=\"index.jsp\">Home</a></h3>");
        out.println("<p>test</p>");
    }

    public void destroy() {
    }
}
