package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import helper.rInforHelper;

import model.rInforModel;


/**
 * Servlet implementation class updateRInforController
 */
//@WebServlet("/updateRInforController")
public class updateRInforController extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		try(PrintWriter out=response.getWriter())
		{
			rInforModel rinfor=new rInforModel();
			

			rinfor.setrInforId(Integer.parseInt(request.getParameter("rInforId")));
			rinfor.setrId(request.getParameter("rId"));
			rinfor.setrAmount(Double.parseDouble(request.getParameter("rAmount")));
			rinfor.setMonth(request.getParameter("month"));
		
			
		
			 try {
				 
				 rInforHelper rIHelper=new rInforHelper(); 
				 
				 boolean executionStatus = rIHelper.updateRInformation(rinfor);
				 
				 if(executionStatus)
					 response.sendRedirect(request.getContextPath()+"rInforUpdate.jsp?rInforId="+rinfor.getrInforId());
				 //use a message box 
				 else
					 request.setAttribute("rInforId",request.getParameter("rInforId") );
				 RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("rInforUpdate.jsp");
				 dispatcher.forward(request, response);
				 
			 }
			 
			 catch (ClassNotFoundException cnfe) {
				 out.print(cnfe);
			 }catch(SQLException se) {
				 out.print(se);
			 }
			 
			
			
		}
		

			
		
		
		
		
	
	}

}
