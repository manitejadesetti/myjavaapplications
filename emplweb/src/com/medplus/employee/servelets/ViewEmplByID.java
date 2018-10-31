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
 * Servlet implementation class ViewEmplByID
 */
@WebServlet("/ViewEmplByID")
public class ViewEmplByID extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewEmplByID() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    AdminService service = new AdminServiceImpl();
	Employee emp=null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//RequestDispatcher rd = request.getRequestDispatcher("ViewEmplByID.jsp");
		//rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int code=Integer.parseInt(request.getParameter("empcode"));
		emp=service.getEmployeeByID(code);
		request.setAttribute("emp", emp);
		RequestDispatcher rd = request.getRequestDispatcher("ViewEmplByID.jsp");
		rd.forward(request, response);
		
	}

}
