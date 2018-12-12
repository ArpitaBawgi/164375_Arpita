package com.spring8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		/*ApplicationContext context=new ClassPathXmlApplicationContext("spring8.xml");
		Customer customer=(Customer) context.getBean("spring8.xml");
		System.out.println();*/
		
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring8.xml");
		
	    	Customer cust = (Customer)context.getBean("customer");
	    	
	    	System.out.println(cust);
	    	
	    	((ConfigurableApplicationContext) context).close();

	}

}
