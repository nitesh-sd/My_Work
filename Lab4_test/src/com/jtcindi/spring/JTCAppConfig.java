package com.jtcindi.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JTCAppConfig {
	
	@Bean
	@Scope("prototype")
	public Hello createHello(){
	System.out.println("Create Hello *****");
	Hello hello = Hello.getHello();
	return hello;
	}
	
	
	@Bean
	@Scope("prototype")
	public Runtime createRT(){
		System.out.println("CreateRT ******");
		Runtime rt = Runtime.getRuntime();
		return rt;
	}
	

}
