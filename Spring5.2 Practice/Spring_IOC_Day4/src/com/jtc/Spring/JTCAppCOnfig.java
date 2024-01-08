package com.jtc.Spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class JTCAppCOnfig {
	static {
		System.out.println("SB in JTCAppConfig");
	}
	
	@Bean
	@Scope("prototype")
	public Hello createHello() {
	System.out.println("createHello in Hello");
	Hello hello = Hello.getHello();
	return hello;
	
	}
	
	@Bean
	@Scope("prototype")
	public Runtime createRT() {
		System.out.println("CreateRT in Runtime ******");
		//Runtime rt = new Runtime(); //not possible because the constructor of Runtime is private
		Runtime rt = Runtime.getRuntime();
		return rt;
	}
}
