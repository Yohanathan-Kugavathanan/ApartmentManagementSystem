package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import helper.rInforHelper;
import model.rInforModel;

/**
 * Servlet implementation class addRInforController
 */
@WebServlet("/addRInforController")
public class addRInforController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public addRInforController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

try(PrintWriter out=response.getWriter()){
			
			rInforModel rinfor=new rInforModel();
			
		
			rinfor.setrId(request.getParameter("rId"));
			rinfor.setrAmount(Double.parseDouble(request.getParameter("rAmount")));
			rinfor.setMonth(request.getParameter("month"));
		
			
		try {
			
			boolean executionStatus=rInforHelper.rInformation(rinfor);
	
			RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/rentInformtion/addRentInfor.jsp");
			dispatcher.forward(request,response);
		
		
			if(executionStatus)
				out.print(true);
			else
				out.print(false);
			
			
		}catch (ClassNotFoundException cnfe) {
				out.print(cnfe);
		}catch (SQLException se) {
			out.print(se);
		}
			
		}

	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
