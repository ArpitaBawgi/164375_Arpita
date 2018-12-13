package com.arpita.ado;

import java.util.ArrayList;

public class UserDAO implements IUserDAO {
	ArrayList<User> userList;

	public UserDAO() {
		userList = new ArrayList<User>();
		userList.add(new User("Arpita", "Bawgi", "Admin"));
		userList.add(new User("ArpitaU", "Bawgi", "User"));
	}

	public String getUserType(String user, String password) {
		for (User user1 : userList) {
			if (user1.getUser().equals(user)
					&& (user1.getPassword().equals(password))) {
				return user1.getUserType();
			}
		}
		throw new InvalidUserException("Username and Password doesnt exist");
	}

	@Override
	public String getuserType(String user, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changePassword(String user, String password) {
		
		
	}

	@Override
	public void changePassword(String user, String oldpassword,
			String newpassword) {
		// TODO Auto-generated method stub
		
	}
}
