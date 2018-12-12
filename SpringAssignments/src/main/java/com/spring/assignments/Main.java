package com.spring.assignments;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("spring1.xml");
	    Customer customer=context.getBean(Customer.class);
	  
	  System.out.println("Country: "+customer.address.getCountry());
	  System.out.println("State: "+customer.address.getState());
	  System.out.println("City: "+customer.address.getCity());
	  System.out.println("Street: "+customer.address.getStreet());
	  System.out.println("Zip: "+customer.address.getZip());
	  System.out.println("CustomerName: "+customer.getCustomerName());
	  System.out.println("CustomerId: "+customer.getCustomerId());
	  System.out.println("CustomerContact: "+customer.getCustomerContact());
	  System.out.println("CustomerAddress: "+customer.getCustomerAddress());
	 
	}

}
