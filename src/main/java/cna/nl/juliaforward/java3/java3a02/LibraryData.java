package cna.nl.juliaforward.java3.java3a02;

import java.io.*;
import java.util.Objects;

import cna.nl.juliaforward.java3.java3a02.A01.Book;
import cna.nl.juliaforward.java3.java3a02.A01.BookDatabaseManager;
import cna.nl.juliaforward.java3.java3a02.A01.Library;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "libraryData", value = "/library-data")
public class LibraryData extends HttpServlet {
    private String message;
    Library lib = new Library();

    public void init() {
        message = "Library List!";
        BookDatabaseManager.loadLibrary(lib);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Library Data</title>");
        out.println("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\">");
        out.println("</head>");
        out.println("<h1>\uD83D\uDC0D" + request.getParameter("type") + " List" + "\uD83D\uDC0D</h1>");

        if (Objects.equals(request.getParameter("type"), "Book")) {
            Library.showAllBooks(lib, out);
        } else {
            Library.showAllAuthors(lib, out);
        }

        out.println("<h3><button><a href=\"index.jsp\">Home</a></button></h3>");
        out.println("</body></html>");

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>\uD83D\uDC0D" + "Adding new " + request.getParameter("type") + "\uD83D\uDC0D</h1>");
        if (Objects.equals(request.getParameter("type"), "Book")) {

        } else {

        }
        out.println("<h3><button><a href=\"index.jsp\">Home</a></button></h3>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
