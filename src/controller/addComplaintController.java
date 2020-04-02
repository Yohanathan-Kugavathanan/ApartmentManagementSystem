package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import helper.complaintHelper;
import model.complaintModel;


//@WebServlet("/addComplaintController")
public class addComplaintController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	  public addComplaintController() {
	        // TODO Auto-generated constructor stub
	    }
	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	try(PrintWriter out=response.getWriter()){
		
		complaintModel complaint=new complaintModel();
		
		
		complaint.setComplaint(request.getParameter("complaint"));

	try {
		complaintHelper ch=new complaintHelper();
	
		boolean executionStatus=ch.addComplaint(complaint);
		
		
		if(executionStatus)
		{
			out.print(true);
		response.sendRedirect(request.getContextPath() + "/ownerTenant/complaint/viewComplaint.jsp?complaintId=" + complaint.getComplaintId());// room
		}
		
		
		else
		{
			RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/ownerTenant/complaint/addComplaint.jsp");
		dispatcher.forward(request,response);
		}	
		
		
	}catch (ClassNotFoundException cnfe) {
			out.print(cnfe);
	}catch (SQLException se) {
		out.print(se);
	}
		
	}
	
	
	
	}

}
