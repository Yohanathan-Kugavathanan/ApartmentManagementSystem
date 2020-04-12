package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import helper.House2Helper;
import model.House2;

/**
 * Servlet implementation class DeleteHouse2Controller
 * This controller handles deleting houses
 * @author Sumithraarachchi D.H.G(IT18123982)
 */

@WebServlet("/DeleteHouse2Controller")
public class DeleteHouse2Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try (PrintWriter out = response.getWriter()) {

			House2 house2 = new House2();


			house2.setH2No(Integer.parseInt(request.getParameter("h2No")));

			try {
				House2Helper h2h=new House2Helper();

				boolean executionStatus = h2h.deleteHouse2(house2);//return boolean

				if(executionStatus) 
					response.sendRedirect(request.getContextPath()+"/house/view-house2.jsp?rInforId="+house2.getH2No());



				else
					response.sendRedirect(request.getContentType()+"/house/view-house2.jsp");

			} catch (ClassNotFoundException cnfe) {
				out.print(cnfe);
			} catch (SQLException se) {
				out.print(se);
			}catch(NumberFormatException ex) {
				out.print(ex);
			}



		}
	}

}
