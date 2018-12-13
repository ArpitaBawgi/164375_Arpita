package com.arpita.ado;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConnectionFactory {

	private static Connection connection;

	public static Connection getConnection() {
		try {
			connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE", "system", "orcl11g");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	public static void closeConnection() {
	try{
		connection.close();
	}
	catch(SQLException e){
		e.printStackTrace();
	}
	}

	public static void main(String[] args){
		System.out.println(ConnectionFactory.getConnection());
	

}
}
