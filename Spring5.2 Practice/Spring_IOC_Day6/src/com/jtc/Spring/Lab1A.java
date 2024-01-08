package com.jtc.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab1A {
	public static void main(String[] args) {
		System.out.println("Main in Lab-2");
		//Since here ApplicationContext is an interface so we can make the object with its sub type AnnotationConfigApplicationContext
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JTCAppCOnfig.class);
		
		Hello h1 = (Hello) ctx.getBean("createHello");
		h1.show();
		System.out.println("****************");
		Hello h2 = (Hello) ctx.getBean("createHello");
		h2.show();
		//since Hello class is designed with singleton so it will give true after comparing
		System.out.println(h1 == h2);		
		
		Runtime rt1 = (Runtime)ctx.getBean("createRT");
		Runtime rt2 = (Runtime)ctx.getBean("createRT");
		//since Runtime is designed with singleton so it will give true after comparing
		
		System.out.println(rt1 == rt2);	
	}

}
