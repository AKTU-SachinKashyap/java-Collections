package com.student.manager;

import java.sql.Connection;
import java.sql.DriverManager;

public class cp {

	static Connection con;
	public static Connection createC() { 
		try {
			// load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");
//			con.prepareStatement("insert into student values()");
			 
			// create the connection...
			String user = "root"; 
			String password = "Sach@8923Abhi&"; 
			String url ="jdbc:mysql://localhost:3306/student_manage";
			con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
