<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<style>
body{
overflow-x:hidden;
margin:auto;
width:1350px;
}

/* The container */
.container {
  display: block;
  position: relative;
  padding-left: 35px;
  margin-bottom: 12px;
  cursor: pointer;
  font-size: 22px;
  -webkit-user-select: none;
  -moz-user-select: none;
  -ms-user-select: none;
  user-select: none;
}

/* Hide the browser's default checkbox */
.container input {
  position: absolute;
  opacity: 0;
  cursor: pointer;
  height: 0;
  width: 0;
}

/* Create a custom checkbox */
.checkmark {
  position: absolute;
  top: 0;
  left: 0;
  height: 25px;
  width: 25px;
  background-color: #eee;
}

/* On mouse-over, add a grey background color */
.container:hover input ~ .checkmark {
  background-color: #ccc;
}

/* When the checkbox is checked, add a blue background */
.container input:checked ~ .checkmark {
  background-color: #333;
}

/* Create the checkmark/indicator (hidden when not checked) */
.checkmark:after {
  content: "";
  position: absolute;
  display: none;
}

/* Show the checkmark when checked */
.container input:checked ~ .checkmark:after {
  display: block;
}

/* Style the checkmark/indicator */
.container .checkmark:after {
  left: 9px;
  top: 5px;
  width: 5px;
  height: 10px;
  border: solid white;
  border-width: 0 3px 3px 0;
  -webkit-transform: rotate(45deg);
  -ms-transform: rotate(45deg);
  transform: rotate(45deg);
}

.r1{
position:relative;
bottom:-2px;
left:30px;
}

.r2{
 position:relative;
 bottom:36px;
 left:85px;
}

.r3{
 position:relative;
 bottom:74px;
 left:140px;
}

.r4{
 position:relative;
 bottom:112px;
 left:200px;
}

.r5{
position:relative;
bottom:150px;
left:255px;
}

.r6{
position:relative;
bottom:188px;
left:310px;
}

.r7{
position:relative;
bottom:226px;
left:510px;
}

.r8{
position:relative;
bottom:264px;
left:570px;
}

.r9{
position:relative;
bottom:303px;
left:630px;
}

.r10{
position:relative;
bottom:342px;
left:690px;
}

.r11{
position:relative;
bottom:381px;
left:753px;
}

.r12{
position:relative;
bottom:419px;
left:810px;
}



.B{
position:relative;
bottom:440px;}


.GB{
position:relative;
bottom:405px;}

.SB{
position:relative;
bottom:405px;}


.C{
position:relative;
bottom:845px;}

.GC{
position:relative;
bottom:810px;}

.SC{
position:relative;
bottom:810px;}


.D{
position:relative;
bottom:1250px;}

.GD{
position:relative;
bottom:1215px;}

.SD{
position:relative;
bottom:1215px;}




.E{
position:relative;
bottom:1655px;}

.GE{
position:relative;
bottom:1622px;}

.SE{
position:relative;
bottom:1620px;}

.gold{
position:relative;
bottom:22px;
}

.silver{

position:relative;
bottom:60px;
}
.back{position:relative;
top:40px;
}
.booktitle{
position:relative;
text-align:center;
color:red;
font-size:50px;
}
.leftalign{
position:relative;
left:30px;
}



</style>

<script type="text/javascript">
function myfun()
{
var a=document.getElementsByName('chk');
var newvar=0;
var count;
for(count=0;count<a.length;count++)
{
if(a[count].checked==true){
	newvar=newvar+1;
	} 
if(newvar>7)
	break;
}

if(newvar>7)
{
document.getElementById('notValid').innerHTML=""
alert("only maximum of 7 seats can be selected");
return false;
}
}

</script>
<body>

<p class="booktitle">Book your tickets here!!!</p>



<center>
<div class="platinumtitle" style="position:relative;background-color:#333;top:0px;width:950px;height:40px;color:white;font-size:35px">
&nbsp Platinum (Rs. 200.00)
</div>
</center>



<div class="platinum" style="width:950px;height:300px;background-color:#adad85;position:relative;right:-200px;">


<div class="A" style="background-color:#adad85">
<br>

<div class="leftalign" >

<div class="r1">
<label class="container">1
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>

</div>

<div class="r2">
<label class="container">2
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>


<div class="r3">
<label class="container">3
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>


<div class="r4">
<label class="container">4
  <input type="checkbox"  name="chk"onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r5">
<label class="container">5
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r6">
<label class="container">6
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

</div>

<div class="r7">
<label class="container">1
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>

</div>

<div class="r8">
<label class="container">2
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>


<div class="r9">
<label class="container">3
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>


<div class="r10">
<label class="container">4
  <input type="checkbox"  name="chk"onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r11">
<label class="container">5
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r12">
<label class="container">6
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

</div>

<br><br>

<div class="B">


<div class="leftalign">
<div class="r1">
<label class="container">1
  <input type="checkbox"  name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>

</div>

<div class="r2">
<label class="container">2
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>


<div class="r3">
<label class="container">3
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>


<div class="r4">
<label class="container">4
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r5">
<label class="container">5
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r6">
<label class="container">6
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>
</div>

<div class="r7">
<label class="container">1
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>

</div>

<div class="r8">
<label class="container">2
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>


<div class="r9">
<label class="container">3
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>


<div class="r10">
<label class="container">4
  <input type="checkbox"  name="chk"onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r11">
<label class="container">5
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r12">
<label class="container">6
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

</div>
<div class="C">
<div class="leftalign">
<div class="r1">
<label class="container">1
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r2">
<label class="container">2
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r3">
<label class="container">3
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>


<div class="r4">
<label class="container">4
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r5">
<label class="container">5
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r6">
<label class="container">6
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>
</div>



<div class="r7">
<label class="container">1
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>

</div>

<div class="r8">
<label class="container">2
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>


<div class="r9">
<label class="container">3
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>


<div class="r10">
<label class="container">4
  <input type="checkbox"  name="chk"onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r11">
<label class="container">5
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r12">
<label class="container">6
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

</div>



<div class="D">
<div class="leftalign">

<div class="r1">
<label class="container">1
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>

</div>

<div class="r2">
<label class="container">2
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>


<div class="r3">
<label class="container">3
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>


<div class="r4">
<label class="container">4
  <input type="checkbox"  name="chk"onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r5">
<label class="container">5
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r6">
<label class="container">6
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>
</div>


<div class="r7">
<label class="container">1
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>

</div>

<div class="r8">
<label class="container">2
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>


<div class="r9">
<label class="container">3
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>


<div class="r10">
<label class="container">4
  <input type="checkbox"  name="chk"onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r11">
<label class="container">5
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r12">
<label class="container">6
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

</div>


<div class="E">
<div class="leftalign">
<div class="r1">
<label class="container">1
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>

</div>

<div class="r2">
<label class="container">2
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>


<div class="r3">
<label class="container">3
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>


<div class="r4">
<label class="container">4
  <input type="checkbox"  name="chk"onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r5">
<label class="container">5
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r6">
<label class="container">6
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

</div>

<div class="r7">
<label class="container">1
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>

</div>

<div class="r8">
<label class="container">2
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>


<div class="r9">
<label class="container">3
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>


<div class="r10">
<label class="container">4
  <input type="checkbox"  name="chk"onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r11">
<label class="container">5
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r12">
<label class="container">6
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>
</div>
</div>
<div>
<span id="notValid" style="color:red"></span>
</div>
<center>
<div class="goldtitle" style="background-color:#333;width:950px;height:40px;color:white;position:relative;bottom:-10px;font-size:35px"> 
&nbsp Gold (Rs. 150.00)
</div>
</center>
<br>
<div class="gold" style="width:950px;height:325px;background-color: #adad85;position:relative;right:-200px;bottom:0px;">

<br>
<div class="leftalign" >
<div class="r1">

<label class="container">1
  <input type="checkbox" name="chk" onclick="return myfun()" >
  <span class="checkmark"></span>
</label>

</div>

<div class="r2">
<label class="container">2
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>

</div>

<div class="r3">
<label class="container">3
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>
<div class="r4">
<label class="container">4
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>
<div class="r5">
<label class="container">5
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r6">
<label class="container">6
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

</div>

<div class="r7">

<label class="container">1
  <input type="checkbox" name="chk" onclick="return myfun()" >
  <span class="checkmark"></span>
</label>

</div>

<div class="r8">
<label class="container">2
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r9">
<label class="container">3
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r10">
<label class="container">4
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r11">
<label class="container">5
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r12">
<label class="container">6
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="GB">

<div class="leftalign" >
<div class="r1">
<label class="container">1
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>

</div>

<div class="r2">
<label class="container">2
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>


<div class="r3">
<label class="container">3
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>


<div class="r4">
<label class="container">4
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r5">
<label class="container">5
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r6">
<label class="container">6
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>
</div>


<div class="r7">

<label class="container">1
  <input type="checkbox" name="chk" onclick="return myfun()" >
  <span class="checkmark"></span>
</label>

</div>

<div class="r8">
<label class="container">2
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>

</div>

<div class="r9">
<label class="container">3
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>

</div>


<div class="r10">
<label class="container">4
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r11">
<label class="container">5
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r12">
<label class="container">6
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>



</div>


<div class="GC">
<div class="leftalign" >
<div class="r1">
<label class="container">1
  <input type="checkbox" name="chk" onclick="return myfun()" >
  <span class="checkmark"></span>
</label>

</div>

<div class="r2">
<label class="container">2
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>


<div class="r3">
<label class="container">3
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>


<div class="r4">
<label class="container">4
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r5">
<label class="container">5
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r6">
<label class="container">6
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

</div>

<div class="r7">

<label class="container">1
  <input type="checkbox" name="chk" onclick="return myfun()" >
  <span class="checkmark"></span>
</label>

</div>

<div class="r8">
<label class="container">2
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>

</div>

<div class="r9">
<label class="container">3
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>

</div>


<div class="r10">
<label class="container">4
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r11">
<label class="container">5
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r12">
<label class="container">6
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

</div>

<div class="GD">
<div class="leftalign" >

<div class="r1">
<label class="container">1
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>

</div>

<div class="r2">
<label class="container">2
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>


<div class="r3">
<label class="container">3
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>


<div class="r4">
<label class="container">4
  <input type="checkbox"  name="chk"onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r5">
<label class="container">5
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r6">
<label class="container">6
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>
</div>


<div class="r7">
<label class="container">1
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>

</div>

<div class="r8">
<label class="container">2
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r9">
<label class="container">3
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>


<div class="r10">
<label class="container">4
  <input type="checkbox"  name="chk"onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r11">
<label class="container">5
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r12">
<label class="container">6
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>
</div>

<div class="GE">
<div class="leftalign" >
<div class="r1">
<label class="container">1
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r2">
<label class="container">2
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r3">
<label class="container">3
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r4">
<label class="container">4
  <input type="checkbox"  name="chk"onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r5">
<label class="container">5
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r6">
<label class="container">6
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>
</div>

<div class="r7">
<label class="container">1
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r8">
<label class="container">2
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r9">
<label class="container">3
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r10">
<label class="container">4
  <input type="checkbox"  name="chk"onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r11">
<label class="container">5
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r12">
<label class="container">6
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>
</div>
</div>

<center>
<div class="silvertitle" style="background-color:#333;width:950px;height:40px;color:white;position:relative;top:-25px;font-size:35px">
&nbsp Silver (Rs. 100.00)
</div>
</center>
<div class="silver" style="width:950px;height:315px;background-color:#adad85;position:relative;right:-200px;bottom:25px;">
<br>
<div class="leftalign" >
<div class="r1">
<label class="container">1
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r2">
<label class="container">2
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r3">
<label class="container">3
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r4">
<label class="container">4
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r5">
<label class="container">5
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r6">
<label class="container">6
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>
</div>

<div class="r7">
<label class="container">1
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r8">
<label class="container">2
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r9">
<label class="container">3
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>


<div class="r10">
<label class="container">4
  <input type="checkbox"  name="chk"onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r11">
<label class="container">5
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r12">
<label class="container">6
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="SB">
<div class="leftalign" >
<div class="r1">
<label class="container">1
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r2">
<label class="container">2
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r3">
<label class="container">3
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r4">
<label class="container">4
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r5">
<label class="container">5
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r6">
<label class="container">6
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>
</div>

<div class="r7">
<label class="container">1
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>

</div>

<div class="r8">
<label class="container">2
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r9">
<label class="container">3
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r10">
<label class="container">4
  <input type="checkbox"  name="chk"onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r11">
<label class="container">5
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r12">
<label class="container">6
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>
</div>

<div class="SC">
<div class="leftalign" >
<div class="r1">
<label class="container">1
  <input type="checkbox" name="chk" onclick="return myfun()" >
  <span class="checkmark"></span>
</label>
</div>

<div class="r2">
<label class="container">2
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r3">
<label class="container">3
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r4">
<label class="container">4
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r5">
<label class="container">5
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r6">
<label class="container">6
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>
</div>

<div class="r7">
<label class="container">1
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>

</div>

<div class="r8">
<label class="container">2
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r9">
<label class="container">3
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r10">
<label class="container">4
  <input type="checkbox"  name="chk"onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r11">
<label class="container">5
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r12">
<label class="container">6
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>
</div>

<div class="SD">
<div class="leftalign" >
<div class="r1">
<label class="container">1
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r2">
<label class="container">2
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r3">
<label class="container">3
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r4">
<label class="container">4
  <input type="checkbox"  name="chk"onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r5">
<label class="container">5
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r6">
<label class="container">6
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>
</div>

<div class="r7">
<label class="container">1
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r8">
<label class="container">2
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r9">
<label class="container">3
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r10">
<label class="container">4
  <input type="checkbox"  name="chk"onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r11">
<label class="container">5
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r12">
<label class="container">6
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>
</div>

<div class="SE">
<div class="leftalign" >
<div class="r1">
<label class="container">1
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r2">
<label class="container">2
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r3">
<label class="container">3
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r4">
<label class="container">4
  <input type="checkbox"  name="chk"onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r5">
<label class="container">5
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r6">
<label class="container">6
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>
</div>

<div class="r7">
<label class="container">1
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>

<div class="r8">
<label class="container">2
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>
<div class="r9">
<label class="container">3
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>
<div class="r10">
<label class="container">4
  <input type="checkbox"  name="chk"onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>
<div class="r11">
<label class="container">5
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>
<div class="r12">
<label class="container">6
  <input type="checkbox" name="chk" onclick="return myfun()">
  <span class="checkmark"></span>
</label>
</div>
</div>
</div>
</div>
</body>
</html>
</html>