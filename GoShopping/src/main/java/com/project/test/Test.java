package com.project.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.dao.ProductDAO;
import com.project.dao.UserDAO;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("springjdbc.xml");
		UserDAO dao = context.getBean(UserDAO.class);
		ProductDAO dao1 = context.getBean(ProductDAO.class);
	
		 System.out.println(dao.getUser(102));
		 System.out.println(dao.getAllUsers());
		 System.out.println(dao1.addProduct(1, "watch", 1000));

	}

}
