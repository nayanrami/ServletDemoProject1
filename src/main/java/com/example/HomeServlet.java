package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.dao.EmployeeDAOImpl;
import com.example.model.Employee;


@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();		
		RequestDispatcher rd  = null;
		
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String email = request.getParameter("email");
		String mobileno = request.getParameter("mobileno");
		
		StringBuilder error = new StringBuilder();
		
		if(!firstname.isEmpty()) {
			Employee employee = new Employee();
			employee.setFirstname(firstname);
			employee.setLastname(lastname);
			employee.setMobileno(mobileno);
			employee.setEmail(email);
			
			
			
			
			request.setAttribute("SUCCESS", "CHECK YOUR INBOX");
			rd = request.getRequestDispatcher("login.jsp");
		}else {
			error.append("Enter Firstname");
			request.setAttribute("ERROR", error);
			rd = request.getRequestDispatcher("index.jsp");
		}
		
		
		rd.forward(request, response);
		
		
		out.println("Welcome "+firstname+" "+lastname);
	}

}

