<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Submeted data are</title>
</head>
<body>
	${Header}<hr>
	<h1>
		User Name:- ${user.username}<br>
		User Email:-${user.email}<br>	
		User Password:-${user.password}<br>
	</h1>
</body>
</html>