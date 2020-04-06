package controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import helper.residentHelper;
import model.resident;


/**
 * Servlet implementation class addResidentController
 */

//@WebServlet("/addResidentController")
public class addResidentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public addResidentController() {
		
	}
	
	
		
		
		
		
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		try (PrintWriter out = response.getWriter()) {
			
			resident  resident=new resident();
			
			
		    resident.setResidentType(request.getParameter("residenttype"));
			resident.setrId(Integer.parseInt(request.getParameter("rId")));
			resident.setName(request.getParameter("name"));
			resident.setUserName(request.getParameter("userName"));
			resident.setPassword(Integer.parseInt(request.getParameter("password")));
			resident.setEmail(request.getParameter("email"));
			resident.setContact(request.getParameter("contact"));
			resident.setNIC(request.getParameter("nic"));
			
		   
			
			
			
			
		
	  try {
		  
		  residentHelper reh=new residentHelper();
				
			     	boolean executionStatus = reh.addResident(resident);
				
			     	RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/admin/ownerTenant/viewResident.jsp");
					dispatcher.forward(request,response);
					     	
			     	
				   if(executionStatus) 
					out.print(true);
				   else
					out.print(false);
				     }
			
			          catch (ClassNotFoundException cnfe) {
				      out.print(cnfe);
			   }    catch (SQLException se) {
				       out.print(se);
			
				      
	
			}		         

		}		         
		
		
}	
		
}		
		
		
	






