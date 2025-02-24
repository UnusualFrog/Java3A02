<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
  <head>
    <title>📚🐍✋🐍📚</title>
    <link href="style.css" rel="stylesheet" type="text/css">
  </head>
  <body>
    <h1><%= "\uD83D\uDC0D Welcome to the Wanderer's Library \uD83D\uDC0D" %></h1>
    <div id="wrapper">
      <button class="button-3"><a href="addbook.jsp">Add New Book</a></button>
      <button class="button-3"><a href="addauthor.jsp">Add New Author</a></button>
      <form action="library-data" method="get">
        <input type="hidden" name="type" value="book">
        <td><button type="submit" class="button-3">View Books</button></td>
      </form>

      <form action="library-data" method="get">
        <input type="hidden" name="type" value="author">
        <td><button type="submit" class="button-3">View Authors</button></td>
      </form>
    </div>

  </body>
</html>