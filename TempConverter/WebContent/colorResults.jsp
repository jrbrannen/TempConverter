<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	
		<meta charset="ISO-8859-1">
		
		<title>Color Wheel Results</title>
		
		<style>
			body{
				background-color: tan;
			}
			input{
				margin: 10px;
			}
		</style>
	</head>
	
	<body>
	
		<h1>Color Wheel Results</h1>
		
		
			<h3>${newColor.getFirstColor()} and ${newColor.getSecondColor()} make: </h3><br />
			
			<h2>${newColor.getColorResults()} </h2> <br />
		
			<a href="index.jsp">Return to Home Page</a>
	
	</body>
</html>