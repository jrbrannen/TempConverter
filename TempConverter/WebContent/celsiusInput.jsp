<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	
		<meta charset="ISO-8859-1">
		
		<title>Celsius Conversion Input</title>
		
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
	
		<h1>Convert Degrees to Celsius</h1>
		
		<form action = "getCelConversionServlet" method = "post">
		
			<div>
				Enter degrees in Fahrenheit here:
				<input type = "text" name = "celsiusConvert" size = "8">
			</div>
			
			<div>
				<input type = "submit" value = "Convert It Already!" />
			</div>
			
		
		</form>
	
	
	
	</body>
</html>