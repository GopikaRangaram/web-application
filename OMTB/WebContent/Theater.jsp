<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="model.OMTBDao,
			    model.OMTBBean,
			    java.util.List"%>
<%List<OMTBBean> theaters = (List<OMTBBean>)(request.getAttribute("theaters"));%>
<%System.out.print(theaters.get(0).getTheaterName());%>
 <% 
 OMTBBean omtbBean = (OMTBBean)(request.getAttribute("Object"));
%>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<style>
body {
height: 650px;
overflow-y: hidden;
overflow-x: hidden;
}
.theatremaster {
position: relative;
left: 400px;
bottom: 940px;
width: 40%;
}

.bar {
position: relative;
background-color: #333;
width: 50%;
height: 45px;
bottom: 450px;
right: -15px;
}

.theatremaster button {
  position: relative;
  width: 20%;
  height: 40px;
  top: 10px;
  padding: 10px;
  background-color: #e03b12;
  color: white;
  font-size: 15px;
  border: 1px solid grey;
}

.theatremaster button:hover {
	background-color: #333;
}

.bar {
	position: relative;
	left: 400px;
	width: 600px;
	background-color: black;
	color: white;
}

ul {
  position: relative;
  list-style-type: none;
  padding: 0px;
  padding-right: 0px;
  overflow: hidden;
  background-color: #333;
  width: 358px;
  left: 400px;
  bottom: 400px;
}

li {
  float: left;
}

li a {
  display: block;
  color: white;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover {
  background-color: #2196F3;
  text-decoration: none;
  color: white;
}

.cast {
 border-radius: 50%;
 width: 80px;
 height: 80px;
 bottom: 10px;
}
.align {
	position: relative;
	left: 1050px;
	bottom: 430px;
	width: 10px;
	height: 10px;
}
.ralign {
	position: relative;
	left: 1150px;
	bottom: 440px;
	width: 10px;
	height: 10px;
}
.crew {
	position: relative;
	left: 1050px;
	bottom: 450px;
}
</style>
<body>
<img src="<%=omtbBean.getPosterLink()%>" style="position:relative;width:300px;height:400px;top:9px;">
<ul>
  <li ><a href="master.html">06</a></li>
  <li ><a href="#news">07</a></li>
  <li ><a href="#contact">08</a></li>
  <li ><a href="#home">09</a></li>
  <li ><a href="#news">10</a></li>
  <li ><a href="#contact">11</a></li>
  <li ><a href="#contact">12</a></li>
</ul>
<br>
<div class="crew">
<b>Cast and Crew</b>
</div>

<div class="align">
<img src="<%=omtbBean.getCast1()%>" class="cast" alt="vijay">
</div>

<div class="ralign">
<p><%=omtbBean.getCastImage1()%></p>
</div>
<br><br><br>

<div class="align">
<img src="<%=omtbBean.getCast2()%>" class="cast" alt="vjs">
</div>

<div class="ralign">
<p><%=omtbBean.getCastImage2()%></p>
</div>
<br><br><br>
<div class="align">
<img src="<%=omtbBean.getCast3()%>" class="cast" alt="lokesh">
</div>
<div class="ralign">
<p><%=omtbBean.getCastImage3()%></p>
</div>
<br><br><br>
<div class="align">
<img src="<%=omtbBean.getCast4()%>" class="cast" alt="lokesh">
</div>
<div class="ralign">
<p><%=omtbBean.getCastImage4()%></p>
</div>
<br><br><br>
<div class="align">
<img src="<%=omtbBean.getCast5()%>" class="cast" alt="lokesh">
</div>
<div class="ralign">
<p><%=omtbBean.getCastImage5()%></p>
</div>
<br><br><br>
<div class="theatremaster">
<%
for(int index=0;index<theaters.size();index++)
		{
		//System.out.print(index+" "+theaters.get(index).getTheaterName()+"\n");
		out.println(theaters.get(index).getTheaterName());
		%>
<div>
<%
String[] dateArray = theaters.get(index).getShowTime().split(",");
for(int iter=0;iter<dateArray.length;iter++)
{
%>
<a href="seatLayout.jsp"><button type=submit> <%out.print(dateArray[iter]);%></button></a>&nbsp &nbsp
<%} %>
</div>
<br>
<%
} 
%>
<br><br>
</div>
</body>
</html>