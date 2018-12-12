package com.spring8;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

public class MyMainBean {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(Configuration.class);
		ctx.refresh();

		MyBean mb1 = ctx.getBean(MyBean.class);
		System.out.println(mb1.hashCode());

		MyBean mb2 = ctx.getBean(MyBean.class);
		System.out.println(mb2.hashCode());

		ctx.close();
	}

	}


