<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@page import="helper.rInforHelper,model.rInforModel,controller.*, java.util.ArrayList" %>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>






<p><a href="viewRentInfor.jsp"><i class=""></i></a></p>
		<table>
		<tr>
			<th>Rent Information ID</th>
			<th>Resident ID</th>
			<th>Rent Amount</th>
			<th>Month</th>
		</tr>
		
		
		
		<%
				rInforModel r = new rInforModel();
				r.setrInforId(Integer.parseInt(request.getParameter("rInforId")));
	
				rInforHelper rh =new rInforHelper();
				ArrayList<rInforModel> rInforList= rh.displayRInformation(r);
				
		for (rInforModel rinfor:rInforList)
		{
		%>
		
		<tr>
			<td><%=rinfor.getrInforId() %></td> <!-- The code placed within JSP expression tag is written to the output stream of the response. -->
			<td><%=rinfor.getrId() %></td>
			<td><%=rinfor.getrAmount() %></td>
			<td><%=rinfor.getMonth() %></td>
			
			
			<td></td>	
		</tr>			
		

		
		
		</table>
		
	
		
		<br/><br/><br/></br>
		
		
		
		<form method="post" action="../updateRInforController">
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
		
		<tr><td><input type="submit" value="Update"></td>
		</tr>
	</table>
	</form>
		
		<%
			}
			%>
			
		
		
		
		
				












</body>
</html>