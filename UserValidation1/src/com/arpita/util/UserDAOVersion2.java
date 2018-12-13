package com.arpita.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.arpita.ado.ConnectionFactory;
import com.arpita.ado.IUserDAO;
import com.arpita.ado.InvalidUserException;
import com.arpita.ado.User;

public class UserDAOVersion2 implements IUserDAO {

	@Override
	public String getuserType(String user, String password) {
		Connection connection = ConnectionFactory.getConnection();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE", "system", "orcl11g");
			PreparedStatement statement = connection
					.prepareStatement("select * from user1 where userName=? and password=?");
			statement.setString(1, user);
			statement.setString(2, password);
			ResultSet set = statement.executeQuery();
			while (set.next()) {
				if (set.getString("username").equals(user)
						&& set.getString("password").equals(password))
					return set.getString("userType");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		throw new InvalidUserException("User and password are not correct");
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void changePassword(String user, String oldpassword,
			String newpassword) {
		// TODO Auto-generated method stub

	}

	@Override
	public void changePassword(String user, String password) {
		// TODO Auto-generated method stub

	}

//	public static void main(String[] args) {
//		System.out.println(new UserDAOVersion2().getuserType("arp", "a123"));
//	}

}
