<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	
		<meta charset="ISO-8859-1">
		
		<title>Fahrenheit Conversion Input</title>
		
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
	
		<h1>Convert Degrees to Fahrenheit</h1>
		
		<form action = "getFahConversionServlet" method = "post">
		
			<div>
				Enter degrees in Celsius here:
				<input type = "text" name = "fahrenheitConvert" size = "8">
			</div>
			
			<div>
				<input type = "submit" value = "Convert It Already!" />
			</div>
			
		
		</form>
	
	
	
	</body>
</html>