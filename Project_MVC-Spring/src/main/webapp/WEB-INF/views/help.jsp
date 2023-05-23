<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.time.LocalDateTime"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>help</title>
</head>
<body>
<h1>this is help page</h1>
<%
	String name= (String) request.getAttribute("name");
	Integer roll=(Integer) request.getAttribute("Roll");
	LocalDateTime dt=(LocalDateTime) request.getAttribute("dateTime");
%>
<h1>
		My name is:-  <%=name %><br>
		My Roll is:-  <%=roll %><br>
		Today Date time is:- <%=dt %> 
</h1>
</body>
</html>