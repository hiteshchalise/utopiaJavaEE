<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP bean example</title>
</head>
<body>

<%@ include file="index.html" %>
<h1> Hello </h1>
<form action="response.jsp">
	Enter your name: <input type="text" name="username"/>
	<input type="submit"/>
</form>

</body>
</html>