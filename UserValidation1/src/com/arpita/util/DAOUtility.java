package com.arpita.util;

import jdk.internal.dynalink.beans.StaticClass;

import com.arpita.ado.IUserDAO;
import com.arpita.ado.UserDAO;

public class DAOUtility {



	public static IUserDAO getUserDAOVersion2() {
		// TODO Auto-generated method stub
		return new UserDAOVersion2();
	}



}
