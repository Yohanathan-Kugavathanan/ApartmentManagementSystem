package controller;

/**Servlet implementation class AddHouse2Controller
 * This controller handles inserting houses
 * @author Sumithraarachchi D.H.G(IT18123982)
 *
 */

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

//@WebServlet("/AddHouse2Controller")
public class AddHouse2Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddHouse2Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try(PrintWriter out=response.getWriter()){

			House2 house2=new House2();

			house2.setH2No(Integer.parseInt(request.getParameter("h2No")));	
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
				House2Helper hh2=new House2Helper();

				boolean executionStatus=hh2.addHouse2(house2);
				
				//RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/house/view-house2.jsp");
				//dispatcher.forward(request,response);
				response.sendRedirect("house/view-house2.jsp");


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
