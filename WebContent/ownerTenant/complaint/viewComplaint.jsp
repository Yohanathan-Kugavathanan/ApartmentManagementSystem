<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
      <%@page import="helper.complaintHelper,model.complaintModel,controller.*, java.util.ArrayList" %>
   
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>View my complaint</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <!-- Font Awesome -->
  <link rel="stylesheet" href="../../plugins/fontawesome-free/css/all.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="../../dist/css/adminlte.min.css">
  <!-- Google Font: Source Sans Pro -->
  <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">


</head>
<body>


<div class="card-body table-responsive p-0">
             
<table class="table table-hover text-nowrap">


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
		
</div>		









</body>
</html>