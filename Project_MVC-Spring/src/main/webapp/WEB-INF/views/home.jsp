<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
    <%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>This is home page of controller class</h1>
	<h1>Home</h1>
	<%
		String name = (String) request.getAttribute("name");
		Integer id =(Integer) request.getAttribute("id");
		List<String> frnd=(List<String>) request.getAttribute("f") ;
	%>
	<h1> Name :- <%=name%></h1><br>
	<h1>Mobile :- <%=id %></h1>
	<h1>Freands are <br>
	<%
		for(String s: frnd){
	%>
	
		<br><%=s%>
	<%		
		}
	%>
	</h1>
</body>
</html>