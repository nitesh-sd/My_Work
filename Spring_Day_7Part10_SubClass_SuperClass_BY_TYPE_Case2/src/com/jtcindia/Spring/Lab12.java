package com.jtcindia.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab12 {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JTCAppConfig.class);
		System.out.println("Spring container is ready........");
		Hello h1=(Hello)ctx.getBean("myhello");
		h1.show();
		
		
	}

}
