package com.jtcindia.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab1B_Initializing_with_Spring {
	public static void main(String[] args) {
		System.out.println("main in Lab1B");
		//with Spring
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JTCAppConfig.class);
		// when we are telling ApplicationContext that this is a JTCAppConfig.class is a configuration class then it will
		//do all the necessary work automatically.
		A a1 = (A)ctx.getBean("createA");
		System.out.println(a1);
		
		B b1 = (B)ctx.getBean("BO");
		System.out.println(b1);
		
		Hello h2 = (Hello)ctx.getBean("myHello");
		h2.show();
	}

}
