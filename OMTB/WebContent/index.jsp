<html>
<head>  
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <meta name='viewport' content='width=device-width, initial-scale=1'>
  <script src='https://kit.fontawesome.com/a076d05399.js'></script>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  </head>
  <title>Online movie ticket booking system</title>
<style>
html, body {
      margin: 0;
      padding: 0;
      width: 100%;
	  height:1000px;
}
body {
      font-family: "Helvetica Neue",sans-serif;
      font-weight: lighter;
	  overflow-y:scroll;
	  width:1400px;
      margin:auto;
}
.header {
      width: 100%;
      height: 100vh;
      background: url(https://i2.wp.com/upload.wikimedia.org/wikipedia/commons/8/89/The_Main_House_Theatre%2C_The_Maltings_Theatre_%26_Arts_Centre%2C_Berwick-upon-Tweed%2C_March_2009.jpg?w=1040&ssl=1) no-repeat 50% 50%;
      background-size: cover;
	  }
.form-container {
    position:fixed;
 	width:400px;
    padding: 10px;
    background-color: white;
    left:500px;
    top:120px;
}
.form-popup {
  display: none;
  position: fixed;
  top: 120px;
  left: 50px;
}
.form-container input[type=text]{
  padding: 10px 10px;
  margin: 5px 0 22px 0;
  border: none;
  background: #f1f1f1;
}
.form-container input[type=password]{
  padding: 10px 10px;
  margin: 5px 0 22px 0;
  border: none;
  background: #f1f1f1;
}
.form-container input[type=text]:focus, .form-container input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}
.form-container .button {
  background-color: red;
  color: white;
  padding: 16px 20px;
  border: none;
  cursor: pointer;
  width: 100%;
  margin-bottom:10px;
  opacity: 0.8;
}
.form-container .cancel{
  background-color: red;
  color: white;
  padding: 16px 20px;
  border: none;
  cursor: pointer;
  width: 100%;
  margin-bottom:10px;
  opacity: 0.8;
}

.form-container .button:hover{
  opacity: 1;
}

.leftcard
{	
	position:relative;
	font-size:15px;
	width:30%;	
	top:10px;
}

.rightcard
{
	position:relative;
	width:80%;
	left:110px;
	bottom:30px;
	
}
.register
{
	text-decoration:none;
	color:white;
}
.button{
	color:white;
}
.form-container .button:hover,  {
  opacity: 1;
 
}

.form-container .cancel {
  background-color: blue;
}

.carousel-inner
{
	position:absolute;
	top:100px;}

.carousel-indicators
{
top:450px;
left:295px;
}

.footer {
   position: fixed;
   left: 0;
   bottom: 0;
   width: 100%;
   height:8%;
   background-color: #333;
   color: white;
   text-align: left;
}

.footerelements{
position:relative;
top:8px;
font-size:18px;
color:white;
}

.bookmyshow{
position:relative;
left:535px;
width:250px;
height:80px;
bottom:55px;
}

.fa {
  padding: 10px;
  font-size: 20px;
  width: 50px;
  text-align: center;
  text-decoration: none;
  margin: 2px 0px;  
}
.fa-facebook {
  background: #3B5998;
  color: white;
  bottom:18px;

.fa-twitter {
  background: #55ACEE;
  color: white;
}
.fa-google {
  background: #dd4b39;
  color: white;
}
.fa-linkedin {
  background: #007bb5;
  color: white;
}
.fa-youtube {
  background: #bb0000;
  color: white;
}

.fa-instagram {
  background: #125688;
  color: white;
}

.socialmedia{
position:relative;
left:1070px;
bottom:120px;
background-color: none;
color:white;
text-decoration:none;
}

.social{
text-decoration:none;color:white;}
.actives {
   background-color: #e03b12;
   position:relative;
   left:500px;
   font-size:17px;
 }
.btn {
  background-color: DodgerBlue;
  border: none;
  color: white;
  padding: 12px 16px;
  font-size: 16px;
  cursor: pointer;
}


.btn:hover {
  background-color: RoyalBlue;
}


ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

li {
  float: left;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}


li a:hover {
  background-color: #e03b12;
  text-decoration:none;
  color:white;
}

footerelements a:hover{
text-decoration:none;
color:white;
}

.search-container button:hover {
  background: #ccc;
}

.register
{
text-decoration:none;
color:white;
}

form.example input[type=text] {
  padding: 10px;
  font-size: 15px;
  border: 1px solid grey;
  float: left;
  width: 80%;
  height:35px;
  bottom:100px;
}

form.example button {
  position:relative;
  width: 20%;
  height:35px;
  top:18px;
  padding: 10px;
  background: #2196F3;
  color: white;
  font-size: 20px;
  border: 1px solid grey;
  border-left: none;
  cursor: pointer;
}

form.example button:hover {
  background: #0b7dda;
}

form.example::after {
  content: "";
  clear: both;
 
}

.close{
position:relative;
left:10px;
top:-45px;
}

.form-containerregister {
  
  position:fixed;
  width:400px;
  padding: 10px;
  background-color: white;
  left:500px;
  bottom:130px;
}

.form-popup {
  display: none;
  position: fixed;
  top: 120px;
  right: 470px;
}

.form-containerregister input[type=text]{
  padding: 10px 10px;
  border: none;
  background: #f1f1f1;
}

.form-containerregister input[type=password]{
  padding: 10px 10px;
  border: none;
  background: #f1f1f1;
}

.form-containerregister input[type=text]:focus, .form-container input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}


.form-containerregister .button {
  background-color: red;
  color: white;
  padding: 16px 20px;
  border: none;
  cursor: pointer;
  width: 100%;
  margin-bottom:10px;
  opacity: 0.8;
}

.form-containerregister .button:hover{
  opacity: 1;
}

.leftcardregister
{	
	font-size:15px;
	width:40%;
	float:left;
}

.rightcardregister
{	

	position:relative;
	width:80%;
	bottom:35px;
	left:140px;
}

.register
{
text-decoration:none;
color:white;
}

.closeregister{
position:relative;
left:10px;
top:20px;
}

.form-containerforgot {
  position:fixed;
  width:400px;
  padding: 10px;
  background-color: white;
  left:500px;
  bottom:130px;
}

.form-popup {
  display: none;
  position: fixed;
  top: 120px;
  right: 470px;
}

.form-containerforgot input[type=text]{
  padding: 10px 10px;
  border: none;
  background: #f1f1f1;
}

.form-containerforgot input[type=password]{
  padding: 10px 10px;
  border: none;
  background: #f1f1f1;
}

.form-containerforgot input[type=text]:focus, .form-containerforgot input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}


.form-containerforgot .button {
  background-color: red;
  color: white;
  padding: 16px 20px;
  border: none;
  cursor: pointer;
  width: 100%;
  margin-bottom:10px;
  opacity: 0.8;
}

.form-containerforgot .button:hover{
  opacity: 1;
}

.leftcardforgot
{	
	font-size:15px;
	width:50%;
	float:left;
}

.rightcardforgot
{	
	position:relative;
	width:70%;
	bottom:25px;
	left:175px;
}

.closeforgot{
	position:relative;
	left:330px;
	top:-25px;
}
 
 .activites{
	text-decoration:none;
	color:white;
}

.sub .button:hover{
	background-color:#333;
}

.popup {
  position: relative;
  display: inline-block;
  cursor: pointer;
  -webkit-user-select: none;
  -moz-user-select: none;
  -ms-user-select: none;
  user-select: none;
}

/* The actual popup */
.popup .popuptext {
  visibility: hidden;
  width: 160px;
  background-color: #555;
  color: #fff;
  text-align: center;
  border-radius: 6px;
  padding: 8px 0;
  position: absolute;
  z-index: 1;
  bottom: 125%;
  left: 50%;
  margin-left: -80px;
}

/* Popup arrow */
.popup .popuptext::after {
  content: "";
  position: absolute;
  top: 100%;
  left: 50%;
  margin-left: -5px;
  border-width: 5px;
  border-style: solid;
  border-color: #555 transparent transparent transparent;
}

/* Toggle this class - hide and show the popup */
.popup .show {
  visibility: visible;
  -webkit-animation: fadeIn 1s;
  animation: fadeIn 1s;
}

/* Add animation (fade in the popup) */
@-webkit-keyframes fadeIn {
  from {opacity: 0;} 
  to {opacity: 1;}
}

@keyframes fadeIn {
  from {opacity: 0;}
  to {opacity:1 ;}
}


</style>

<script>

function validateEmail()
{
var num=/^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
var name=document.carddetailsform.email.value;
if( name == null  || name.search(num)== -1)
{
alert("Enter valid emailid");
carddetailsform.email.value="";
carddetailsform.email.focus();
}
}
function changeColor() {
  document.getElementById("ji").style.backgroundColor = "green";
}

function changeColorRegister() {
  document.getElementById("j0").style.backgroundColor = "green";
}

function openForm() {
  document.getElementById("myForm").style.display = "block";
  document.getElementById("reg").style.display = "none";
  document.getElementById("head").style.opacity="0.3";
}

function registerForm() {
  document.getElementById("myForm").style.display = "none";
  document.getElementById("reg").style.display = "block";
}

function openforgotpopup() {
  document.getElementById("forgot").style.display = "block";
  document.getElementById("myForm").style.display = "none";
}

function closeforgotpopup() {
  document.getElementById("forgot").style.display = "none";
   document.getElementById("head").style.opacity="1.0";
}
function myFunction() {
  var popup = document.getElementById("myPopup");
  popup.classList.toggle("show");
}

function closeForm() {
  document.getElementById("myForm").style.display = "none";
  document.getElementById("head").style.opacity="1.0";
}

function closeRegisterForm() {
  document.getElementById("reg").style.display = "none";
  document.getElementById("head").style.opacity="1.0"; 
}

function restrictSpace(event) {
				var keyCode = event.which||event.keycode;
				if (keyCode != 32) {
					return true;
				}
				else {
					return false;
				}
			}
	
function myFunction() {
document.getElementById("field").style.display = "block";
  var input, filter, ul, li, a, i;
  input = document.getElementById("mySearch");
  filter = input.value.toUpperCase();
  ul = document.getElementById("myMenu");
  li = ul.getElementsByTagName("li");
  for (i = 0; i < li.length; i++) {
    a = li[i].getElementsByTagName("a")[0];
    if (a.innerHTML.toUpperCase().indexOf(filter) > -1) {
      li[i].style.display = "";
    } else {
      li[i].style.display = "none";
    }
  }
}		
</script>
<body>
<div class="header" id="head">
 <div class="wrapper">
 <ul style="position:relative;left:0px;height:50px;">
 <img src="https://images-eu.ssl-images-amazon.com/images/I/51Ey37Y5IfL.png" style="position:relative;left:-235px;width:40px;height:30px;top:10px;">
 &nbsp &nbsp
  <li style="position:relative;left:45px;"><a href="#home">Movies</a></li>
  <li style="position:relative;left:45px;"><a href="#news">Events</a></li>
  <li style="position:relative;left:45px;"><a href="#contact">Activities</a></li>
  <form class="example" style="position:relative;left:500px;bottom:40px;max-width:400px;">
  <input type="text" placeholder="Search for Movies,Theatres,Cities" onkeyup="myFunction()" name="searchbox" >
  <button type="submit"><i class="fa fa-search" style="position:relative;bottom:16px;"></i></button> 
  </form>
  <div class="dropdown" style="position:relative;top:-70px;left:640px;">
  <select id="cars" name="cars" style="position:relative;width:150px;height:30px">
  <option value="Ariyalur">Ariyalur</option>
  <option value="	Chengalpattu	">	Chengalpattu</option>
  <option value="	Chennai">	Chennai</option>
  <option value="	Coimbatore">	Coimbatore</option>
  <option value="	Cuddalore">	Cuddalore</option>
  <option value="		Dharmapuri	">		Dharmapuri</option>
  <option value="	Dindigul">	Dindigul</option>
  <option value="	Erode">Erode</option>
</select>
<input  type="submit" value="Submit"style="position:relative;background-color:#2196F3;width:100px;height:30px;  border: 1px solid grey;">
</div>
 <li style="position:relative;bottom:110px;left:775px;"><a class="actives" href="javascript:openForm()">Login</a></li>
</ul>
 </div>
<br><br><br>
<iframe width="360" height="250" src="https://www.youtube.com/embed/gjnrtCKZqYg" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen style="position:relative;bottom:30px;float:left;left:10px;"></iframe>
<iframe width="360" height="250" src="https://www.youtube.com/embed/vHESM8iR1JE" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen style="position:relative;top:230px;right:350px"></iframe>
<iframe width="360" height="250" src="https://www.youtube.com/embed/1JlLi9pDaJE" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen style="position:relative;left:250px;top:-20px;"></iframe>
<iframe width="360" height="250" src="https://www.youtube.com/embed/hPybzXeEWSI" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen style="position:relative;left:975px;top:-23px;"></iframe>
<div class="container" style="position:relative;;bottom:520px;left:-25px;width:40%;height:400px">
 
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
   <!-- <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol> -->

    <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
	<!--<a href="https://www.youtube.com/watch?v=GR-Ui8-V2M0">-->
        <img  src="https://i.ytimg.com/vi/UoTx_77cqic/maxresdefault.jpg" alt="Master" style="height:300px;width:800px;">
      </div>
	   <div class="item">
	  <!-- <a href="https://www.youtube.com/watch?v=68ixlbMQaY0">-->
        <img src="https://poovilangothai.files.wordpress.com/2018/12/mankatha-movie-hd-stills2863913766940336625.jpg?w=1060" alt="Chicago" style="height:300px;width:800px;">
      </div>
      <div class="item">
	 <!-- <a href="https://www.youtube.com/watch?v=w0nyEoXBEiA"> -->
        <img src="https://i.ytimg.com/vi/hPybzXeEWSI/maxresdefault.jpg" alt="Chicago" style="height:300px;width:800px;">
      </div>
    
      <div class="item">
	 <!-- <a href="https://www.youtube.com/watch?v=w0nyEoXBEiA">-->
        <img src="https://s01.sgp1.cdn.digitaloceanspaces.com/article/117068-wswlicfvkv-1554785177.jpg" alt="New york" style="height:300px;width:900px;">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" style="position:relative;top:250px;size:50px;left:40px;" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" style="position:relative;top:250px;size:50px;left:475px;" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
</div>
<div class="container">
<div class="row" >
  <div class="col-md-4">
  
      <a href="Theater.jsp">
        <img src="https://i.pinimg.com/originals/64/78/20/647820a382f88e321c5f935f612e359c.jpg" alt="Lights" style="position:relative;width:300px;height:390px;top:30px;left:50px;">
       
       
      </a>
    
  </div>
  <div class="col-md-4">
    
      <a href="Theater.jsp">
        <img src="https://img.hungamacity.com/upload/moviesbanner/575523-oh-my-kadavule.webp" alt="Nature"  style="position:relative;width:300px;height:390px;top:30px;left:25px;">
      </a>
  </div>
  <div class="col-md-4">

      <a href="Theater.jsp">
        <img src="https://m.media-amazon.com/images/M/MV5BMTVmODRhY2EtZmYyZi00Njk5LWIzNzUtZTllYzU4YzlkNTNhXkEyXkFqcGdeQXVyMjUxMTY3ODM@._V1_.jpg" alt="Fjords" style="position:relative;width:300px;height:390px;top:30px;">
      </a>
  </div>
</div>
</div>
<br>
<br>
<div class="container">
<div class="row" style="position:relative;left:0px;" >
  <div class="col-md-4">
  
      <a href="Theater.jsp">
        <img src="https://d2h7z5r5pp4sed.cloudfront.net/malayalam/gallery/movies/kannumkannumkollai/kannum_kannum_klollyadithaal_12.jpg" alt="Lights" style="position:relative;width:300px;height:390px;top:30px;left:50px;">
      </a>
  </div>
  <div class="col-md-4">
    
      <a href="Theater.jsp">
        <img src="https://fulltoofilmy.files.wordpress.com/2012/02/mankatha-1.jpg" alt="Nature"  style="position:relative;width:300px;height:390px;top:30px;left:25px;"> 
      </a>
  </div>
  <div class="col-md-4">

      <a href="Theater.jsp">
        <img src="https://i2.wp.com/www.socialnews.xyz/wp-content/uploads/2019/09/03/Enai-Noki-Paayum-Thota-Movie-Malayalam-poster-.jpg?quality=90&zoom=1&ssl=1" alt="Fjords" style="position:relative;width:300px;height:390px;top:30px;">
      </a>
  </div>
</div>
</div>
<div class="form-popup" id="myForm" >
 <form class="form-container" method="post" action="Login">
		<button id="ji" type="submit"  style="background-color: #2196F3;color:white;border: 1px #e03b12;width:170px;height:50px;" ><a class="activites"  href="javascript:openForm()" style="position:relative;text-decoration:none;color:white">Login</button>
		<button id="ji" type="submit"  style="background-color: #2196F3;color:white;border: 1px #e03b12;width:170px;height:50px;"><a  class="activites"  href="javascript:registerForm()"  style="position:relative;text-decoration:none;color:white">Register</button>
		<div class="close">
		<a href="javascript:closeForm()"> <i class="fa fa-close"></i></a>
</div>
<br><br><br>	
<div class="leftcard"> 
<i class='fas fa-envelope'></i>
   <b> Email* </b></div>
   
 <div class="rightcard">   
 <input type="text" name="emailId"  required><br></div>
 
 
<div class="leftcard">
<i class='far fa-keyboard'></i>
  <b>Password*</b></div>
  
 <div class="rightcard">  
<input type="password" name="password" maxlength="8" required></div>
  <%
  if(session.getAttribute("status")!=null)
  {
	  %>
	  <center>
	  <% 
  out.print(session.getAttribute("status"));
  session.removeAttribute("status");
  %>
  </center>
  <script>
  document.getElementById("myForm").style.display = "block";
  document.getElementById("head").style.opacity="0.3";
  <%
  }
  %>
 </script>
  <br>
  <button type="submit" class="button">Login</button>
  <a href="javascript:openforgotpopup()" ><p align="center">Forgot Password?</p>
<!--<a class="register" href="register.html"><button type="button" class="cancel">Signup</button></a>-->
     </form>
</div>
<div class="form-popup" id="reg">
<form class="form-containerregister"  method="post" action="Register">   
	<button id="j0" type="submit" style="background-color: #2196F3;color:white;border: 1px #e03b12;width:170px;height:50px;"><a class="activites"  href="javascript:openForm()" style="position:relative;text-decoration:none;color:white">Login</button>
		<button id="j0" type="submit" style="background-color: #2196F3;color:white;border: 1px #e03b12;width:170px;height:50px;"><a class="activites"  href="javascript:registerForm()" style="position:relative;text-decoration:none;color:white">Register</button>
		<div class="close">
		<a href="javascript:closeRegisterForm()"> <i class="fa fa-close"></i></a>
		</div>
		<br><br><br>	
<div class="leftcardregister">
<i class='fas fa-user-tie'></i>
 <b>Username* </b></div>
 <div class="rightcardregister">
 <input type="text" name="userName" required></div>
<div class="leftcardregister"> 
<i class='fas fa-envelope'></i>
   <b> Email* </b></div>
 <div class="rightcardregister">   
 <input type="text" name="emailId"  required></div> 
<div class="leftcardregister"> 
<i class='far fa-keyboard'></i>
  <b>Password*</b></div>
 <div class="rightcardregister">  
<input type="password" name="password" maxlength="8" required></div>
<div class="leftcardregister">
<i class='fas fa-phone'></i>
  <b> Mobilenumber*</b></div>
 <div class="rightcardregister">  
 <input type="text" name="mobileNumber"  maxlength="10" required></div>
   <%
  if(session.getAttribute("status")!=null)
  {
	  %>
	  <center>
	  <% 
  out.print(session.getAttribute("status"));
  session.removeAttribute("status");
  %>
  </center>
  <script>
  document.getElementById("myForm").style.display = "none";
  document.getElementById("reg").style.display = "block";
  <%
  }
  %></script>
  <br>
  <a class="register" href="index.jsp"><button type="submit" class="button">Register</button></a>
     </form>
</div>
<div class="form-popup" id="forgot">
<form class="form-containerforgot"  method="post" action="Update">
<b>Reset Password</b>
<div class="closeforgot">
		<a href="javascript:closeforgotpopup()"> <i class="fa fa-close"></i></a>
</div>
<div class="leftcardforgot"> 
<i class='fas fa-envelope'></i>
   <b> Email* </b></div>
 <div class="rightcardforgot">   
 <input type="text" name="emailId"  required><br></div><br>
<div class="leftcardforgot">
<i class='far fa-keyboard'></i>
  <b>Password*</b></div>  
 <div class="rightcardforgot">  
<input type="password" name="oldPassword" maxlength="8" required><br></div>
<br>
<div class="leftcardforgot">
<i class='far fa-keyboard'></i>
  <b>Confirm Password*</b></div>
 <div class="rightcardforgot">  
<input type="password" name="password" maxlength="8" required><br></div>
<br>
<a class="register" ><button type="submit" class="button">Reset</button></a>
</form>
</div>
<div class="footer">
<div class="footerelements">
  <i class="fa fa-fw fa-home"></i>
  <a href="index.jsp">Home</a>&nbsp
  <i class='glyphicon glyphicon-earphone'></i>
   <a href="contact.html">Contact</a>
  <i class="glyphicon glyphicon-info-sign"></i>
  <a href="about.html">About</a>
  <i class=" fa fa-question"></i>
  <a href="he.html">Help</a>
</div>
<img class="bookmyshow" src="https://cdn.thefashionstation.in/wp-content/uploads/2019/07/bookmyshow-1-1038x491.png">
<div class="socialmedia">
<a href="https://www.facebook.com/BookMyShowIN/" class="fa fa-facebook" style="text-decoration:none;color:white"></a>
<a  href="https://twitter.com/bookmyshow" class="fa fa-twitter" style="text-decoration:none;color:white"></a>
<a href="https://www.linkedin.com/company/bookmyshow/" class="fa fa-linkedin" style="text-decoration:none;color:white"></a>
<a href="https://www.youtube.com/user/BookMyShow" class="fa fa-youtube" style="text-decoration:none;color:white"></a>
<a href="https://www.instagram.com/bookmyshowin/" class="fa fa-instagram" style="text-decoration:none;color:white"></a>
</div>
</div>
	</body>
	</html>