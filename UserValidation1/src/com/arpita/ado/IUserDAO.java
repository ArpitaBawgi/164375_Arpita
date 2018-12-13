package com.arpita.ado;

public interface IUserDAO {

	public String  getuserType(String user, String password) ;
	public void  addUser(User user);
	public void changePassword(String user,String password);
	void changePassword(String user, String oldpassword, String newpassword);
		
	
}
