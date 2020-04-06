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


<p><a href="viewResponse.jsp"><i class="">back</i></a></p>
		<table border="">
		<tr>
			<th>Response ID</th>
			<th>Response</th>
		</tr>
		
		
		
		<%
				responseModel re = new responseModel();
				re.setResponseId(Integer.parseInt(request.getParameter("responseId")));
	
				responseHelper reh =new responseHelper();
				ArrayList<responseModel> responseList= reh.displayResponse(re);
				
		for (responseModel resp:responseList)
		{
		%>
		
		<tr>
			<td><%=resp.getResponseId() %></td> <!-- The code placed within JSP expression tag is written to the output stream of the response. -->
			<td><%=resp.getResponse() %></td>
			
			
			<td></td>	
		</tr>			
		

		
		
		</table>
		
	
		
		<br/><br/><br/></br>
		
		
		
		<form method="post" action="../../updateResponseController">
	<table align="center">
	<tr><td><h3>Response</h3></td>
		<td><input type="textarea" name="response" VALUE="<%=resp.getResponse() %>" required></td>
	</tr>
		
		<tr><td>
		<input type="hidden" value="<%=resp.getResponseId() %>" name="responseId">
		  
		<input type="submit" value="Update"></td>
		</tr>
	</table>
	</form>
		
		<%
			}
			%>
			








</body>
</html>