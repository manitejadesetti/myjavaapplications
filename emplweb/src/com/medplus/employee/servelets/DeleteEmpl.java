package com.medplus.employee.servelets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.medplus.employee.bean.Employee;
import com.medplus.employee.service.AdminService;
import com.medplus.employee.service.impl.AdminServiceImpl;

/**
 * Servlet implementation class DeleteEmpl
 */
@WebServlet("/DeleteEmpl")
public class DeleteEmpl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteEmpl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AdminService service = new AdminServiceImpl();
		int code=Integer.parseInt(request.getParameter("code"));
	    int emp= service.deleteEmployee(code);
	    if(emp>0)
	    	System.out.println("Deleted");
	    else 
	    	System.out.println("not Deleted");
		RequestDispatcher rd = request.getRequestDispatcher("ViewEmpls");
		List<Employee> employees = service.getEmployees();
		request.setAttribute("empls", employees);
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
