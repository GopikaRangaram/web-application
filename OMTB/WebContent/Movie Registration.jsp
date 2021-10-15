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
<tr><td>Poster Link</td><td><input type = "text" name = "posterLink"></td></tr>
<tr><td>Cast1 Name</td><td><input type = "text" name = "cast1"></td></tr>
<tr><td>Cast1 Link</td><td><input type = "text" name = "cast1Image"></td></tr>
<tr><td>Cast2 Name</td><td><input type = "text" name = "cast2"></td></tr>
<tr><td>Cast2 Link</td><td><input type = "text" name = "cast2Image"></td></tr>
<tr><td>Cast3 Name</td><td><input type = "text" name = "cast3"></td></tr>
<tr><td>Cast3 Link</td><td><input type = "text" name = "cast3Image"></td></tr>
<tr><td>Cast4 Name</td><td><input type = "text" name = "cast4"></td></tr>
<tr><td>Cast4 Link</td><td><input type = "text" name = "cast4Image"></td></tr>
<tr><td>Cast5 Name</td><td><input type = "text" name = "cast5"></td></tr>
<tr><td>Cast5 Link</td><td><input type = "text" name = "cast5Image"></td></tr>
</table>
<br/>
<input type = "submit" value = "Save"/>
</form>
<br/><br/>
<a style="text-decoration:none" href = "Theater Registration.jsp">Add theater</a>
</body>
</html>