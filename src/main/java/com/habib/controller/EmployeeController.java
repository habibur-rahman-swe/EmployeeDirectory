package com.habib.controller;

import java.io.IOException;
import java.util.List;

import com.habib.dao.EmployeeDAO;
import com.habib.dao.impl.EmployeeDAOImpl;
import com.habib.entiy.Employee;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static EmployeeDAO employeeDAO = new EmployeeDAOImpl();
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String message = "List Employees - Coming Soon....";
		
		request.setAttribute("message", message);
		
		List<Employee> employees = employeeDAO.get();
		
		request.setAttribute("employees", employees);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/employee-list.jsp");
		
		requestDispatcher.forward(request, response);
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
