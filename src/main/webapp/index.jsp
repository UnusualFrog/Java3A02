<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
  <head>
    <title>📚🐍✋🐍📚</title>
    <link href="style.css" rel="stylesheet" type="text/css">
  </head>
  <body>
    <h1><%= "\uD83D\uDC0D Welcome to the Wanderer's Library \uD83D\uDC0D" %></h1>
    <br/>
    <table>
      <tr>
        <td><button><a href="addbook.jsp">Add New Book</a></button></td>

        <td><button><a href="addauthor.jsp">Add New Author</a></button></td>

        <form action="library-data" method="get">
          <input type="hidden" name="type" value="Book">
          <td><button type="submit">View Books</button></td>
        </form>

        <form action="library-data" method="get">
          <input type="hidden" name="type" value="Author">
          <td><button type="submit">View Authors</button></td>
        </form>

      </tr>
    </table>

  </body>
</html>