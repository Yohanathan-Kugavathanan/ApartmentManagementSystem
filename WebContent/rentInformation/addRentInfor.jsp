<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form method=" action="../addRInforController.java">
	<table align="center">
	<tr><td><h3>Tenant ID</h3></td>
		<td><input type="text" name="rId" required></td>
	</tr>
	
	<tr><td><h3>Amount</h3></td>
		<td><input type="number" name="rAmount" required></td>	
	</tr>
	
	<tr><td><h3>Month</h3></td>
		<td><select name="month" required>
				<option value="january" name="month">January</option>
				<option value="february" name="month">February</option>
				<option value="march" name="month">March</option>
				<option value="april" name="month">April</option>
				<option value="may" name="month">May</option>
				<option value="june" name="month">June</option>
				<option value="july" name="month">July</option>
				<option value="august" name="month">August</option>
				<option value="september" name="month">September</option>
				<option value="october" name="month">October</option>
				<option value="november" name="month">November</option>
				<option value="december" name="month">December</option>
				
		</select></td>
		</tr>
		
		</tr><td><input type="submit" value="submit"></td>
		</tr>
	</table>
	</form>











</body>
</html>