package com.spring8;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Customer implements InitializingBean,DisposableBean {
	String information;

	@Override
	public String toString() {
		return "Customer [information=" + information + "]";
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("This is for Destroying ");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("This is for Initialisation");
		
	}

}
