package org.varsha.jenkins.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		boolean isLoggedIn = false;
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		
		if("admin".equalsIgnoreCase(user) && "admin".equals(pass)) {
			isLoggedIn = true;
		}
		
		if(isLoggedIn) {
			request.getRequestDispatcher("welcome.html").forward(request, response);
		} else {
			request.getRequestDispatcher("index.html").forward(request, response);
		}
		
	}

}
