package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import helper.House2Helper;
import model.House2;

/**
 * Servlet implementation class UpdateHouse2Controller
 * This controller handles updating houses
 * @author Sumithraarachchi D.H.G(IT18123982)
 */

@WebServlet("/UpdateHouse2Controller")
public class UpdateHouse2Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try(PrintWriter out=response.getWriter())
		{
			House2 house2 = new House2();

			//house2.setH2No(Integer.parseInt(request.getParameter("h2No")));	
			house2.setH2FloorNo(Integer.parseInt(request.getParameter("h2FloorNo")));
			house2.setH2NoBeds(Integer.parseInt(request.getParameter("h2NoBeds")));
			house2.setH2NoBaths(Integer.parseInt(request.getParameter("h2NoBaths")));
			house2.setH2Sqft(Double.parseDouble(request.getParameter("h2Sqft")));
			house2.setH2HouseType(request.getParameter("h2HouseType"));
			house2.setH2Status(request.getParameter("h2Status"));
			house2.setH2Price(Double.parseDouble(request.getParameter("h2Price")));
			house2.setH2AdvancePayment(Double.parseDouble(request.getParameter("h2AdvancePayment")));
			house2.setH2PerMonthRate(Double.parseDouble(request.getParameter("h2PerMonthRate")));
			house2.setH2Rent(request.getParameter("h2Rent"));
			house2.setH2GasSupply(request.getParameter("h2GasSupply"));
			house2.setH2HotWater(request.getParameter("h2HotWater"));

			try {

				House2Helper house2Helper=new House2Helper(); 

				boolean executionStatus = house2Helper.updateHouse2(house2);

				if(executionStatus)
					response.sendRedirect(request.getContextPath()+"/house/update-house2.jsp?h2No="+house2.getH2No());
				//using a message box 
				else
					request.setAttribute("h2No",request.getParameter("h2No") );
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/house/update-house2.jsp");
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
