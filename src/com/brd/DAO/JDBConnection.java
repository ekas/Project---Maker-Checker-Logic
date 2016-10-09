package com.brd.DAO;

import java.sql.*;
public class JDBConnection {
	public Connection conn = null;
	
	public Connection setConnection() throws ClassNotFoundException {
		
		
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Connecting to Database...");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@finn:1521:orcl","hr","hr");
			//conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","mycon","oracle12");
			System.out.println("Connected to Database Successfully...");
			System.out.println("Data Connection establisheds");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			System.out.println("Data Entry Start");
		}
		return conn;
	}
}
