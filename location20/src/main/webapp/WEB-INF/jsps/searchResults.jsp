<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>results</title>
</head>
<body>
	<table>
		<tr>
			<th>ID</th>
			<th>Code</th>
			<th>Name</th>
			<th>Type</th>
			<th>delete</th>
			<th>update</th>
		</tr>
		<c:forEach items="${loca}" var="location">
			<tr>
				<td>${location.id}</td>
				<td>${location.code}</td>
				<td>${location.name}</td>
				<td>${location.type}</td>
				<td><a href="delete?id=${location.id}">delete</a></td>
				<td><a href="update?id=${location.id}">update</a></td>
			</tr>

		</c:forEach>
	</table>
	
	<a href="showLocation">Click to add new locations</a>
</body>
</html>