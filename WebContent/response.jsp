<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Response Page</title>
</head>
<body>
	<jsp:useBean id="user" scope="session" class="UserBean"/>
	<jsp:setProperty name="user" property="*" />
	<h1> Hello, <jsp:getProperty name="user" property="username"/></h1>
</body>
</html>