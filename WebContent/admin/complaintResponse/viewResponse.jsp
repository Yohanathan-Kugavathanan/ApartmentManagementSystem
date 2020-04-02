<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
         <%@page import="helper.responseHelper,model.responseModel,controller.*, java.util.ArrayList" %>
 
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="">
		<tr>
			<th>Response ID</th>
			<th>Response</th>
			
		</tr>
		
		
		
		<%
			
				responseHelper reh =new responseHelper();
				ArrayList<responseModel> responseList= reh.displayResponses();
				
		for (responseModel resp:responseList)
		{
		%>
		
		<tr>
			<td><%=resp.getResponseId() %></td> <!-- The code placed within JSP expression tag is written to the output stream of the response. -->
			<td><%=resp.getResponse() %></td>
		<td><a href="<%=request.getContextPath() %>/admin/complaintResponse/updateResponse.jsp?responseId=<%=resp.getResponseId() %>"><b>View</b></a></td>
			<td>
				<form method="post" action="../../deleteResponseController">
					
					<input type="hidden" name="responseId" value="<%=resp.getResponseId()%>"> 
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