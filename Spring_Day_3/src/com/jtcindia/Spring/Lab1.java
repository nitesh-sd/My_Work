package com.jtcindia.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab1 {
	public static void main(String[] args) {
		
		System.out.println("Main in Lab-2");
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JTCAppConfig.class);

		Hello h1 = (Hello) ctx.getBean("Hello");
//		Hello h2 = (Hello) ctx.getBean("Hello");
//		System.out.println(h1 == h2);
//		
		System.out.println("***********************\n");
		Hai hai = (Hai) ctx.getBean("Hai");
//		Hai hai1 = (Hai) ctx.getBean("Hai");
//		System.out.println(hai == hai1);
	}
}
