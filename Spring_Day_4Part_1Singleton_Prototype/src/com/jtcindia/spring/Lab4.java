package com.jtcindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab4 {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JTCAppConfig.class);
		System.out.println("Spring container is ready");
		Hello h1=(Hello)ctx.getBean("createHello");
		h1.show();
		System.out.println("**********");
		Hello h2=(Hello)ctx.getBean("createHello");
		h2.show();
		System.out.println(h1 == h2);
		System.out.println("*****For RT *****");
		Runtime rt1 =(Runtime)ctx.getBean("createRT");
		Runtime rt2 =(Runtime)ctx.getBean("createRT");
		System.out.println(rt1 == rt2);
	}
}
