package com.medplus.employee.servelets;

import java.util.List;
import java.io.IOException;

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
 * Servlet implementation class ViewEmpls
 */
@WebServlet("/ViewEmpls")
public class ViewEmpls extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewEmpls() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AdminService service = new AdminServiceImpl();
		List<Employee> empList= service.getEmployees();
		RequestDispatcher rd = request.getRequestDispatcher("ViewEmpls.jsp");
		request.setAttribute("empls", empList);
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
