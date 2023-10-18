package com.habib.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtil {

	// Define the database properties
	private static final String URL = "jdbc:mysql://localhost:3306/employeedirectory";
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	private static Connection connection = null;
	
	// Define the static method
	
	public static Connection openConnection() {
		// check the connection
		if (connection != null) {
			return connection;
		}
		// load the driver
		// get the connection
		
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		// return connection
		return connection;
	}
}
