package com.habib.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.habib.dao.EmployeeDAO;
import com.habib.entiy.Employee;
import com.habib.util.DBConnectionUtil;

public class EmployeeDAOImpl implements EmployeeDAO {
	Connection connection = null;
	Statement statement = null;
	ResultSet resultSet = null;
	
	@Override
	public List<Employee> get() {
		// Create a reference variables
		List<Employee> list = new ArrayList<>();
		
		try {
			
			// Create a sql query
			String sql = "select * from tbl_employee";
			
			// create a statement
			connection = DBConnectionUtil.openConnection();
			statement = connection.createStatement();
			
			// execute the sql query
			resultSet = statement.executeQuery(sql);
			
			// Process the resultset
			while(resultSet.next()) {
				Employee e = new Employee(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4));
				// add employee to list
//				System.out.println(e);
				list.add(e);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
//		System.out.println(connection);
		// return the list
		return list;
	}
	
	
}
