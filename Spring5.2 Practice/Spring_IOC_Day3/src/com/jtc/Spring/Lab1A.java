package com.jtc.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab1A {
	public static void main(String[] args) {
		System.out.println("Main in Lab-2");
		//Since here ApplicationContext is an interface so we can make the object with its sub type AnnotationConfigApplicationContext
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JTCAppCOnfig.class);
		
		Hello h1 = (Hello) ctx.getBean("Hello");
//		Hello h2 = (Hello) ctx.getBean("Hello");
//		System.out.println(h1 == h2);
		
		System.out.println("**************");
		Hai hai = (Hai) ctx.getBean("Hai");
//		Hai hai2 = (Hai) ctx.getBean("Hai");
//		System.out.println(hai == hai2);

	}

}
