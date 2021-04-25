<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Theater Registration</title>
</head>
<body>
<form method = "post" action = "AddTheater">
<h3>Theater Details</h3>
<table>
<tr><td>Movie ID</td><td><input type = "text" name = "movieId"></td></tr>
<tr><td>Theater Name</td><td><input type = "text" name = "theaterName"></td></tr>
<tr><td>Address</td><td><textarea name = "address"></textarea></td></tr>
<tr><td>Ticket Fare</td><td><input type = "text" name = "fare"></td></tr>
</table>
<br/>
<input type = "submit" value = "Save"/>
</form>
</body>
</html>