
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Store API Home Page</title>
</head>
<body>
<body style='background-color: #fcba03;'>
<h1>Welcome to the VKR Store</h1>
<ul>
	<c:forEach items="${services}" var="service">
		<li><a href="${service.url }">${service.service }</a></li>
	</c:forEach>

</ul>





</body>
</html>