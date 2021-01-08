<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% // This is JSP directive. %>
<%@ page import="java.util.Random" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Numbers Page</title>
</head>
<body>

	<%! 
		// This is JSP declarative. 
		Random random = new Random(); %>

	<%
		// This is JSP scriptlet.
		// We can access implicit object such as request, response, out, etc here 
		// without declaring it. These object are provided after jsp is converted into Servlet.
		String name = request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		out.println("Hello " + name);
	%>
	
	<p> This is JSP expression tag. Hello <%=name %></p>
</body>
</html>