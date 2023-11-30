package com.erp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.erp.dao.UserDAOImpl;

@WebServlet("/loginController")
public class LoginController extends HttpServlet {
	RequestDispatcher rd;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		UserDAOImpl userDAOImpl = new UserDAOImpl();
		if (userDAOImpl.authenticate(username, password)) {			
			HttpSession session = request.getSession();
			session.setAttribute("AUTHUSER", username);
			rd = request.getRequestDispatcher("home.jsp");			
		} else {
			request.setAttribute("ERROR", "Invalid Username / Password");
			rd = request.getRequestDispatcher("login.jsp");
		}

		rd.forward(request, response);

	}

}
