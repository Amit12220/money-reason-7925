package com.Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

public static Connection getConnection() {
		
		Connection conn=null;
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/criminal";
		
		try {
			
			conn=DriverManager.getConnection(url,"root","Amit@2655");
			
		} catch (SQLException e) {
	
			e.printStackTrace();
		}
		
		return conn;
	}
}
