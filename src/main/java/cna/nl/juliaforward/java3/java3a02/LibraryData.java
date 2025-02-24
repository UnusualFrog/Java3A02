package cna.nl.juliaforward.java3.java3a02;

import java.io.*;
import java.util.Objects;

import cna.nl.juliaforward.java3.java3a02.A01.Author;
import cna.nl.juliaforward.java3.java3a02.A01.Book;
import cna.nl.juliaforward.java3.java3a02.A01.BookDatabaseManager;
import cna.nl.juliaforward.java3.java3a02.A01.Library;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "libraryData", value = "/library-data")
public class LibraryData extends HttpServlet {
    Library lib = new Library();

    public void init() {
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

        if (Objects.equals(request.getParameter("type"), "book")) {
            Library.showAllBooks(lib, out);
        } else {
            Library.showAllAuthors(lib, out);
        }

        out.println("<h3><button class=\"button-3\"><a href=\"index.jsp\">Home</a></button></h3>");
        out.println("</body></html>");

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        boolean result = false;

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Library Data</title>");
        out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"" + request.getContextPath() + "/style.css\">");
        out.println("</head>");

        out.println("<body>");
        out.println("<h1>\uD83D\uDC0D" + "Adding new " + request.getParameter("type") + "\uD83D\uDC0D</h1>");
        if (Objects.equals(request.getParameter("type"), "book")) {
            // Add new book & author to library/DB
            Book newBook = new Book(request.getParameter("isbn"), request.getParameter("title"), Integer.parseInt(request.getParameter("editionNumber")), request.getParameter("copyright"));
            Author newAuthor = new Author(Integer.parseInt(request.getParameter("id")), request.getParameter("firstName"), request.getParameter("lastName"));
            newBook.addAuthor(newAuthor);

            // Page Output
            result = lib.addBook(newBook);
            if (result) {
                out.println("<h2>Successfully added " + request.getParameter("title") + "</h2>");
            } else {
                out.println("<h2><span>Error adding " + request.getParameter("title") + "</span></h2>");
            }
            result = lib.addAuthor(newAuthor);
            if (result) {
                out.println("<h2>Successfully added " + request.getParameter("firstName") + "</h2>");
            } else {
                out.println("<h2><span>Error adding " + request.getParameter("firstName") + "</span></h2>");
            }

        } else {
            Author newAuthor = new Author(Integer.parseInt(request.getParameter("id")), request.getParameter("firstName"), request.getParameter("lastName"));
            result = lib.addAuthor(newAuthor);
            if (result) {
                out.println("<h2>Successfully added " + request.getParameter("firstName") + "</h2>");
            } else {
                out.println("<h2><span>Error adding " + request.getParameter("firstName") + "</span></h2>");
            }
        }
        out.println("<h3><button class=\"button-3\"><a href=\"index.jsp\">Home</a></button></h3>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
