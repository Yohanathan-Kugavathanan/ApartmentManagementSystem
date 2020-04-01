<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {
  box-sizing: border-box;
}

input[type=text], select, textarea {
  width: 100%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  resize: vertical;
}

label {
  padding: 12px 12px 12px 0;
  display: inline-block;
}

input[type=submit] {
  background-color: #4CAF50;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  float: right;
}

input[type=submit]:hover {
  background-color: #45a049;
}

.container {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}

.col-25 {
  float: left;
  width: 25%;
  margin-top: 6px;
}

.col-75 {
  float: left;
  width: 75%;
  margin-top: 6px;
}

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}

/* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */
@media screen and (max-width: 600px) {
  .col-25, .col-75, input[type=submit] {
    width: 100%;
    margin-top: 0;
  }

}
</style>

<title>Insert title here</title>
</head>
<body>
<body>

<h2 align="center">SunShine </h2>
<h3>Notification Form</h3>

<form  method= "post"action="AddResident">
 <div class="container">
 
 <img src="apm2.jpg" alt=" face" width="100" height="100" align="right">
 
<br>    <br>
  
           <label for="nId"><b> NId </b></label>
           <input type="nid" placeholder="Enter Nid" name="nid" required>

<br>    <br>

	      <label for="description"><b>Description</b></label>
          <input type="description" placeholder="Enter description" name="description"   required>

<br>    <br>
 
          <label for="date"><b>Date</b></label>
          <input type="date-local" placeholder="Enter time" name=" " required>

<br>    <br> 

         <label for="time"><b>Time</b></label>
         <input type="time-local" placeholder="Enter date" name=" " required>



<center>
    <button type="submit">EDIT</button>
    <button type="submit">ADD</button>
</center>   
  </div>
</body>
</html>