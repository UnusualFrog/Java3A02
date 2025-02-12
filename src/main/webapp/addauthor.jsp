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
        <title>🐍Add New Author🐍</title>
    </head>
    <body>
    <h1>🐍Create a New Author🐍</h1>
        <form action="library-data" method="post">
            <label for="id">ID:</label>
            <input type="text" id="id" name="id" required><br><br>

            <label for="firstName">First Name:</label>
            <input type="text" id="firstName" name="firstName" required><br><br>

            <label for="lastName">Last Name:</label>
            <input type="text" id="lastName" name="lastName" required><br><br>

            <input type="hidden" name="type" value="author">

            <button type="submit">Submit</button>
        </form>

        <h3><button><a href="index.jsp">Home</a></button></h3>
    </body>
</html>
