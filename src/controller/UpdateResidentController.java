package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import helper.residentHelper;
import model.resident;


/**
 * Servlet implementation class UpdateResidentController
 */
//@WebServlet("/UpdateResidentController")
public class UpdateResidentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	//rId,name,userName,password,email,contact,NIC
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try(PrintWriter out=response.getWriter())
		{
			resident resident=new resident();
			
			resident.setResidentType(request.getParameter("residenttype"));
			resident.setrId(Integer.parseInt(request.getParameter("rId")));
			resident.setName(request.getParameter("name"));
			resident.setUserName(request.getParameter("userName"));
			resident.setPassword(Integer.parseInt(request.getParameter("password")));
			resident.setEmail(request.getParameter("email"));
			resident.setContact(request.getParameter("contact"));
			resident.setNIC(request.getParameter("nic"));
			
			
			
		
			 try {
				 residentHelper residentHelper=new residentHelper();
				 
				 boolean executionStatus = residentHelper.updateResident(resident);
				 
				 if(executionStatus)
				 	 response.sendRedirect(request.getContextPath()+"/resident.jsp?update=true");//resident page
				 //use a message box 
				 else
					 
					 response.sendRedirect(request.getContextPath()+"/resident.jsp?update=false");
					 
			 }
			 
			 catch (ClassNotFoundException cnfe) {
				 out.print(cnfe);
			 }catch(SQLException se) {
				 out.print(se);
			 }
			 
			
			
		}
		
	}

}	