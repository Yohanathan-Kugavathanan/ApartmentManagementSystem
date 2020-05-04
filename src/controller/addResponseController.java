package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import helper.responseHelper;
import model.responseModel;

/**
 * Servlet implementation class addResponseController
 */
//@WebServlet("/addResponseController")
public class addResponseController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public addResponseController() {
		
	}
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try (PrintWriter out = response.getWriter()) {

			responseModel resp=new responseModel();
	
	
		resp.setResponse(request.getParameter("response"));
	
	try {
		responseHelper reh=new responseHelper();
		
		boolean executionStatus=reh.addResponse(resp);
	
		
		
		
		
		 if(executionStatus)
				response.sendRedirect(request.getContextPath()+"/admin/complaintResponse/viewResponse.jsp?add=true");
			
		 else
				response.sendRedirect(request.getContextPath()+"/admin/complaintResponse/viewResponse.jsp?add=false");
	
		
	}catch (ClassNotFoundException cnfe) {
		out.print(cnfe);
	}catch (SQLException se) {
		out.print(se);
	}

		
		
	}
			
			
	}

}
