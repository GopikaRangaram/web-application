<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Movie Registration</title>
</head>
<body>
<form method = "post" action = "AddMovie">
<h3>Movie Details</h3>
<table>
<tr><td>City ID</td><td><input type = "text" name = "cityId"></td></tr>
<tr><td>Movie Name</td><td><input type = "text" name = "movieName"></td></tr>
</table>
<br/>
<input type = "submit" value = "Save"/>
</form>
<br/><br/>
<a href = "Theater Registration.jsp">Add theater</a>
</body>
</html>