<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form method="post" action="../../addRInforController">
	<table align="center">
	<tr><td><h3>Tenant ID</h3></td>
		<td><input type="text" name="rId" required></td>
	</tr>
	
	<tr><td><h3>Amount</h3></td>
		<td><input type="number" name="rAmount" required></td>	
	</tr>
	
	<tr><td><h3>Month</h3></td>
		<td><select name="month">
				<option value="january" >January</option>
				<option value="february" >February</option>
				<option value="march" >March</option>
				<option value="april" >April</option>
				<option value="may" >May</option>
				<option value="june" >June</option>
				<option value="july" >July</option>
				<option value="august" >August</option>
				<option value="september" >September</option>
				<option value="october" >October</option>
				<option value="november" >November</option>
				<option value="december" >December</option>
				
		</select></td>
		</tr>
		
		<tr><td><input type="submit" value="submit"></td>
		</tr>
	</table>
	</form>











</body>
</html>