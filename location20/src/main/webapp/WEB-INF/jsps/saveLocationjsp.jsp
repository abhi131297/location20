<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>save</title>
</head>
<body>
	<h2>New Address...</h2>
	
	<form action="saveLocation" method="post">
		<pre>
		first name<input type="text" name="firstname">
		last name<input type="text" name="lastname">
			
		<input type="submit" value="save address">
</pre>
	</form>
	${msg}

<a href="http://localhost:9090/searchlocation">search location by first name</a>
<a href="getLocations">search all location</a>

	
	
</body>
</html>