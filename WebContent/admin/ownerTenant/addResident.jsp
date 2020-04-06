<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta name="viewport" content="width=device-width, initial-scale=1">


<title>Resident</title>
<link rel="stylesheet" type="text/css" href="Resident.css">
</head>
<body>

<h2 align="center">SunShine </h2>
<h3>Redisent Form</h3>

<form  method= "post" action="../../addResidentController">
<div class="container">
 <img src="abi.png" alt=" face" width="100" height="100" align="right">
 
 <br>   <br> 
                  <label for="type"><b> Resident Type:</b></label>
                         <select id="type" name="residenttype">
                         <option value="owner">Owner</option>
                         <option value="Tenant">Tenant</option>
                   
                   </select>
     
 <br>   <br> 
  
           <label for="rId"><b> RId </b></label>
           <input type="number" placeholder="Enter Rid" name="rId" required>
           
<br>    <br>

	       <label for="name"><b>Name</b></label>
           <input type="password" placeholder="Enter name" name="name"   required>
           
<br>    <br> 
 
	        <label for="username"><b>UserName</b></label>
            <input type="text" placeholder="Enter username" name="userName" required>
            
<br>    <br> 

 <center>
            <label for="password"><b>Password</b></label>
            <input type="password" placeholder="Enter password.." name="password" required>
</center>



            <label for="nic"><b>NIC</b></label>
            <input type="text" placeholder="Enter nic" name="nic" required>   
             
<br>	<br>

            <label for="contact"><b>Contact</b></label>
            <input type="text" placeholder="Enter contact.." name="contact" required>  
                      
    
<br>    <br>
 
            <label for="email"><b>Email</b></label>
            <input type="email" placeholder="Enter email.." name="email" required>  
                      
<br>    <br>  

<center>
            <button type="reset">EDIT</button>
            <button type="submit">ADD</button>
 </center> 
   
  </div></form>

</body>
</html>