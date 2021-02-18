<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	
		<meta charset="ISO-8859-1">
		
		<title>Color Wheel Input</title>
		
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
	
		<h1>Color Wheel Input</h1>
		
		<form action = "getColorConversionServlet" method = "post">
		
			<div>
				Enter your first color (red, blue, or yellow) here:
				<input type = "text" name = "firstColor" size = "10">
			</div>
			<div>
				Enter your second color (red, blue, or yellow) here:
				<input type = "text" name = "secondColor" size = "10">
			</div>
			
			<div>
				<input type = "submit" value = "Show me what color I'm Making!" />
			</div>
			
		
		</form>
	
	</body>
</html>