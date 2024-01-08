package com.jtcindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab9 {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JTCAppConfig.class);
		System.out.println("Spring Container");
		Customer cust = (Customer) ctx.getBean("myCust");
		System.out.println(cust.getEmails());
	}

}
