package com.jtcindia.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JTCAppConfig {
	
//	  In general in the case of @Autowire we are not explicitely not specify the
//	  Bean dependency which are usually create an instance for that and call it.


	@Bean("hai")
	public Hai createHai1() {
		Hai hai = new Hai();
		hai.setMsg("I am in Hai****1");
		return hai;
	}

	@Bean("hai")
	public Hai createHai2() {
		Hai hai = new Hai();
		hai.setMsg("I am in Hai****2");
		return hai;
	}

	@Bean("myhello")
	public Hello createHello() {
		Hello h1 = new Hello();
		return h1;
	}
}
