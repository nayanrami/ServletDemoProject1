package com.erp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.erp.dao.UserDAOImpl;
import com.erp.model.User;

@WebServlet("/registercontroller")
public class RegisterController extends HttpServlet {	
	
	RequestDispatcher rd;
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String email = request.getParameter("email");
		
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setEmail(email);
		user.setFirstname(firstname);
		user.setLastname(lastname);
		
		
		UserDAOImpl userDaoImpl = new UserDAOImpl();
		
		if(userDaoImpl.save(user)) {
			request.setAttribute("SUCCESS", "SUCCESS");
			rd = request.getRequestDispatcher("login.jsp");
		}else {
			request.setAttribute("FAIL", "FAIL");
			rd = request.getRequestDispatcher("register.jsp");
		}
		rd.forward(request, response);
		
	}	
}
