package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HelloJdbc {

	public static void main(String[] args) {
	
		Connection connection=null;
		
		try {
			//Step1
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded");
			
			//Step2
			String url="jdbc:mysql://localhost:3306/dxc";
			String username="root";
			String password="root";
			connection=DriverManager.getConnection(url, username, password);
			System.out.println("Connection Successfull");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}finally {
			try {
				//Step6
				connection.close();
				System.out.println("Connection closed");
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
	}

}
