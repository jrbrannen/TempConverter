<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		
		<title>Temperature Conversion and Color Wheel| Index</title>
		
		<style>
		
			body{
				background-color: lightgreen;
			}
			
			input{
				margin: 10px;
			}
		</style>
	</head>

	<body>
	
		<h1>Welcome to the Temperature Conversion and Color Wheel Page</h1>
		
		<h3>Click on one of the conversion buttons to start your temperature conversion</h3>
		
		<form action = "getFahrenheitServlet" method = "post">
		
			<input type = "submit" value = "Convert to Fahrenheit" />
			
		</form>
			
		<form action = "getCelsiusServlet" method = "post">
			
			<input type = "submit" value = "Convert to Celsius" />
		
		</form>
		
		<h3>Or Check out the Color Wheel Page</h3>
		
		<form action = "getColorInputServlet" method = "post">
		
			<input type = "submit" value = "Color Wheel"/>
			
		</form>
		
	</body>
</html>