<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
      <%@page import="helper.complaintHelper,model.complaintModel,controller.*, java.util.ArrayList" %>
   
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>




		<table border="">
		<tr>
			<th>Complaint ID</th>
			<th>Complaint</th>
			
		</tr>
		
		
		
		<%
			
				complaintHelper ch =new complaintHelper();
				ArrayList<complaintModel> complaintList= ch.displayComplaints();
				
		for (complaintModel complaint:complaintList)
		{
		%>
		
		<tr>
			<td><%=complaint.getComplaintId() %></td> <!-- The code placed within JSP expression tag is written to the output stream of the response. -->
			<td><%=complaint.getComplaint() %></td>
		<td><a href="<%=request.getContextPath() %>/ownerTenant/complaint/updateComplaint.jsp?complaintId=<%=complaint.getComplaintId() %>"><b>View</b></a></td>
			<td>
				<form method="post" action="../../deleteComplaintController">
					
					<input type="hidden" name="complaintId" value="<%=complaint.getComplaintId()%>"> 
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