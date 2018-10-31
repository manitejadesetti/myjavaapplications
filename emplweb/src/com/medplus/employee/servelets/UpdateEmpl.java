package com.medplus.employee.servelets;

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
import com.medplus.employee.utils.DateParsing;

/**
 * Servlet implementation class UpdateEmpl
 */
@WebServlet("/UpdateEmpl")
public class UpdateEmpl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateEmpl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    AdminService service = new AdminServiceImpl();
    Employee emp = null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("dfsg");
		int code=Integer.parseInt(request.getParameter("code"));
		
		System.out.println(code);
        
         emp= service.getEmployeeByID(code);
         RequestDispatcher rd= request.getRequestDispatcher("UpdateEmpl.jsp");
         request.setAttribute("employee", emp);
         rd.forward(request, response);
         
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int empcode = Integer.parseInt(request.getParameter("empcode"));
		String empname = request.getParameter("empname");
		String job = request.getParameter("job");
		int salary = Integer.parseInt(request.getParameter("salary"));
		String dob = request.getParameter("dateofbirth");
		Employee emp = new Employee();
		emp.setEmpcode(empcode);
		emp.setEmpname(empname);
		emp.setJob(job);
		emp.setSalary(salary);
		emp.setDateOfBirth(DateParsing.convertStringToUtilDate(dob));
		AdminService service = new AdminServiceImpl();
		int rows = service.updateEmployee(emp);
		RequestDispatcher rd =request.getRequestDispatcher("ViewEmpls");
		rd.forward(request, response);
	}

}
