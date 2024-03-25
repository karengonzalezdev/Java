<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>

<div class="container">
<div id="links">
	<h1><a href="list">Book Store</a></h1>
	<h2><a href="new">Add New Book</a></h2>
</div>

<form name = "book_form" method="post" action="insert">
<caption><h2>New Book Form</h2></caption>
<p><label>Title: </label>
<input type="text" name="booktitle" /></p>
<p><label>Author: </label>
<input type="text" name="bookauthor" /></p>
<p><label>Price: </label>
<input type="text" name="bookprice" /></p>
<p><input type="submit" value="Submit" /></p>
</form>

</div>
</body>
</html>