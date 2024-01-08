package com.jtcindi.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab1A {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JTCAppConfig.class);
	     System.out.println("Spring Container is Ready"); 
	    Hello h1 = (Hello)ctx.getBean("createHello");
	    Hello h2 = (Hello)ctx.getBean("createHello");
	    System.out.println(h1 ==h2);
	    
	    Runtime r1 = (Runtime)ctx.getBean("createRT");
	    Runtime r2 = (Runtime)ctx.getBean("createRT");
	    System.out.println(r1 == r2);
	
	}

}

//as we have written the code in singleton design pattern so prototype scope will not work on it 
// similarly the Runtime is also design in singleton pattern so prototype scope will not work on it
