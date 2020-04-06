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



<table border="">
		<tr>
			<th>Rent Information Id</th>
			<th>Resident Id</th>
			<th>Rent Amount</th>
			<th>Month</th>	
			
			
		</tr>
		
		
		<%
		
		
		rInforHelper rh=new rInforHelper();
		   ArrayList<rInforModel> rinforList= rh.displayRInformations();
		
		for (rInforModel rinfor: rinforList)
		{
	    %>
		<tr>
			<td><%=rinfor.getrInforId() %></td>
			<td><%=rinfor.getrId() %></td>
			<td><%=rinfor.getrAmount() %></td>
			<td><%=rinfor.getMonth() %></td>
		
			<td><a href="<%=request.getContextPath() %>/admin/rentInformation/updateRentInfor.jsp?rInforId=<%=rinfor.getrInforId() %>"><b>View</b></a></td>
			<td>
				<form method="post" action="../../deleteRInforController">
					
					<input type="hidden" name="rInforId" value="<%=rinfor.getrInforId()%>"> 
					<button type="submit" >Delete</button>
				</form>
			</td>
			<!--the context path is the portion of the request URL that indicates the context of the request.  -->
				
		</tr>	
		
		<%
		}
		%>
		
	</table>










</body>
</html>