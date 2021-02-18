<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
	
		<meta charset="ISO-8859-1">
		<title>Fahrenheit To Celsius Results</title>
		
		<style>
			
			body{
				background-color: lightgrey;
			}
			input{
				margin: 10px;
			}	
			
		</style>
		
	</head>
	<body>
	
		<p>
			${usersCelsiusConversion.getDegreesFah()} degrees Fahrenheit converts to: <br />
			${usersCelsiusConversion.getDegreesCel()} degrees Celsius. <br />
		</p>
		<a href="index.jsp">Return to Home Page</a>
		
	</body>
</html>