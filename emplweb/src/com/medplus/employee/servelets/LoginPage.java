package com.medplus.employee.servelets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginPage
 */
@WebServlet("/LoginPage")
public class LoginPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		HttpSession session = request.getSession();
		if(username.equals("admin")) {
			if(password.equals("admin"))  {
				RequestDispatcher rd = request.getRequestDispatcher("AdminHome.jsp");
				session.setAttribute("login", "admin");
				session.setAttribute("user", username);
				rd.forward(request, response);	
			}
			else {
				RequestDispatcher rd= request.getRequestDispatcher("LoginPage.jsp");
				rd.forward(request, response);
			}
		}
		else {
			if(password.equals("123")) {
				RequestDispatcher rd = request.getRequestDispatcher("UserHome.jsp");
				session.setAttribute("login", "user");
				session.setAttribute("user", username);
				rd.forward(request, response);
			}
		}
	}

}
