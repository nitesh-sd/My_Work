package com.jtcindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab13 {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JTCAppConfig.class);
		System.out.println("Container is ready");
		Hello h1 =(Hello)ctx.getBean("myhello");
		h1.show();
	}
}
