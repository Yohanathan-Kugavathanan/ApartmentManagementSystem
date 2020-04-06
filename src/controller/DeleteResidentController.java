package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
//import javax.servlet.annotation.WebServlet;//
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import helper.residentHelper;
import model.resident;




public class DeleteResidentController extends HttpServlet {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

protected void doPost  (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		try (PrintWriter out = response.getWriter()) {
			
			//Delete Resident
			resident resident = new resident();
			
			
			resident.setUserName(request.getParameter("userName"));
		
			try {
				
				residentHelper residentHelper=new residentHelper();
			
				boolean executionStatus = residentHelper.deleteResident(resident);//returns boolean
				
				if(executionStatus) 
					out.print(true);
					//response.sendRedirect(request.getContextPath()+"Resident.jsp?delete=true");
				else
					response.sendRedirect(request.getContentType()+"Resident.jsp?delete=false");
			
			
			} catch (ClassNotFoundException cnfe) {
				out.print(cnfe);
			} catch (SQLException se) {
				out.print(se);
			}
			
			
			
		}
		
	}


		

		
		
		
		
		
		
	

	
	

}
