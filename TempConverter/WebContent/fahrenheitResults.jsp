<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
	
		<meta charset="ISO-8859-1">
		<title>Celsius To Fahrenheit Results</title>
		
		<style>
			
			body{
				background-color: lightblue;
			}
			input{
				margin: 10px;
			}
				
		</style>
		
	</head>
	<body>
	
		<p>
			${usersFahrenheitConversion.getDegreesCel()} degrees Celsius converts to: <br />
			${usersFahrenheitConversion.getDegreesFah()} degrees Fahrenheit. <br />
		</p>
		<a href="index.jsp">Return to Home Page</a>
	</body>
</html>