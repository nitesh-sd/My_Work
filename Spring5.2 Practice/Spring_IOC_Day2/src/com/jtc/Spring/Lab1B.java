package com.jtc.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab1B {
	public static void main(String[] args) {
		System.out.println("Main in Lab1B");
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JTCAppCOnfig.class);
		A a1 =(A)ctx.getBean("createA");
		System.out.println(a1);
		
		System.out.println("***************");
		B b1 = (B)ctx.getBean("B");
		System.out.println(b1);
		
		System.out.println("****************");
		Hello h2 = (Hello) ctx.getBean("Hello");
		h2.show();
	
	}

}
