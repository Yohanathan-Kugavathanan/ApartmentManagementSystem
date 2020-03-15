package controller;

import model.Employee;
import helper.EmployeeHelper;



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "addEmployeeController", urlPatterns = {"/addEmployee"})
public class AddEmployeeController  extends HttpServlet{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
                try(PrintWriter out=response.getWriter()){
                      
                        //add employee
                        Employee emp= new Employee();
                        
                        emp.setEid(request.getParameter("eid"));
                        emp.setFname(request.getParameter("fname"));
                        emp.setLname(request.getParameter("lname"));
                        emp.setDob(request.getParameter("dob"));
                        emp.setAddress(request.getParameter("address"));
                           String[] qualify={ request.getParameter("qualify1") , request.getParameter("qualify2"),request.getParameter("qualify3"),request.getParameter("qualify4"), request.getParameter("qualify5") }; 
                        emp.setQualification(qualify);
                        emp.setTpNo(request.getParameter("tpNo"));
                
                        emp.setPosition(request.getParameter("position"));
                            String[] school={ request.getParameter("school1") ,request.getParameter("school2"),request.getParameter("school3")};
                        emp.setSchool(school);
                        emp.setBankAccNo(request.getParameter("bankAccNo"));
                      
                       
                       try{
                                @SuppressWarnings("unused")
                                EmployeeHelper EmployeeHelper=new EmployeeHelper();
                                    
                                boolean executionStatus = helper.EmployeeHelper.addEmployee(emp);
                                    
                                    
                                    
                                    if(executionStatus){
                                            out.println("true");
                                     //       response.sendRedirect(location);
                                    
                                    }
                                    else
                                    {
                                       //     RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Admin/");
		//	dispatcher.forward(request, response);
                                    out.println("false");
                                    }
                       
                       }catch (ClassNotFoundException cnfe) {
                                    out.print(cnfe);
                       }catch (SQLException se) {
                                    out.print(se);
                        }             
                       
                       
                       
                       }
                        
                
                
                }
    
    
    
    
    }
