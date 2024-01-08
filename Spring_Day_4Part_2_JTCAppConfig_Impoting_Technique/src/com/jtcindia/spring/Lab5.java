package com.jtcindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.socket.messaging.SubProtocolWebSocketHandler;

public class Lab5 {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JTCAppConfig1.class, JTCAppConfig2.class, JTCAppConfig3.class);
	System.out.println("Spring Container is Ready");
	Hello h1 = (Hello)ctx.getBean("myHello");
	System.out.println(h1);
	A ao=(A)ctx.getBean("ao");
	System.out.println(ao);	  
	}
}
