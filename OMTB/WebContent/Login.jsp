<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
.page-container
{
text-align:center;
postion:relative;
margin-top:130px;
}
.title
{
text-align:center;
postion:relative;
}
header
{
width: 100%;
height: 100%;
background:url(https://upload.wikimedia.org/wikipedia/commons/e/e7/Elgin_Theatre_Toronto_18078451842.jpg);
background-size: cover;
background-repeat:no repeat;
}
</style>
<body>
<div class="page-container">
            <form action="Login" method="POST">
			<h1>Sign In</h1>
				<input type="text" name="emailId" class="Email" placeholder="Email"><br><br>
				<input type="password" name="password" class="Address" placeholder="password">
            <%if(session.getAttribute("status")!=null)
            { 
 			out.print(session.getAttribute("status"));
            }
            session.removeAttribute("status");%>
            <br><br>
             <button type="submit" value="Add" name="submit">Submit</button>
            </form>   
        </div>
</body>
</html>