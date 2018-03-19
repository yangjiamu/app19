<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/19
  Time: 16:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Book List</title>
</head>
<body>
    <div id="global">
        <h1>Book List</h1>
        <a href="c:url value=book_input">Add book</a>
        <table>
            <tr>
                <th>Category</th>
                <th>Title</th>
                <th>ISBN</th>
                <th>Author</th>
                <th>&nbsp;</th>
            </tr>
            <c:forEach items="${books}" var="book">
                <tr>
                    <td>${book.category.name}</td>
                    <td>${book.title}</td>
                    <td>${book.isbn}</td>
                    <td>${book.author}</td>
                    <td><a href="book_edit{$book.id}">Edit</a></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>
