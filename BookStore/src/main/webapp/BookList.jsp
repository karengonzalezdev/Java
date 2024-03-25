<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "C" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>

<div class="container">
<div class="links">
<h1><a href="list">Book Store</a></h1>
<h2><a href="new">Add New Book</a></h2>
</div>
<div class="booktable">
<table>
<caption><h3>List Of Books</h3></caption>
<tr>
	<th>Title</th>
	<th>Author</th>
	<th>Price</th>
</tr>

<C:forEach items ="${book_list}" var="item">
<tr>
	<td>${ item.getTitle() }</td>
	<td>${ item.getAuthor() }</td>
	<td>${ item.getPrice() }</td>
</tr>	
</C:forEach>

</table>
</div>
</div>

</body>
</html>