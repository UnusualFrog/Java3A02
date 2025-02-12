<%--
  Created by IntelliJ IDEA.
  User: Julia.forward
  Date: 2/12/2025
  Time: 10:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <title>Create New Book</title>
  </head>
  <body>
    <h1>🐍Create a New Book🐍</h1>
    <form action="library-data" method="post">
      <label for="isbn">ISBN:</label>
      <input type="text" id="isbn" name="isbn" required><br><br>

      <label for="title">Title:</label>
      <input type="text" id="title" name="title" required><br><br>

      <label for="editionNumber">Edition Number:</label>
      <input type="number" id="editionNumber" name="editionNumber" required><br><br>

      <label for="copyright">Copyright:</label>
      <input type="text" id="copyright" name="copyright" required><br><br>

      <input type="hidden" name="type" value="book">

      <button type="submit">Submit</button>
    </form>
    <h3><button><a href="index.jsp">Home</a></button></h3>
  </body>
</html>
