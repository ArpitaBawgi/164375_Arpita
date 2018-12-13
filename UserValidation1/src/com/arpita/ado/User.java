package com.arpita.ado;

public class User {
	String user;
	String password;
	String userType;
	public User(String user, String password, String userType) {
		super();
		this.user = user;
		this.password = password;
		this.userType = userType;
	}
	
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "User [user=" + user + ", password=" + password + ", userType="
				+ userType + "]";
	}
}
