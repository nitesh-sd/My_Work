package com.jtcindia.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JTCAppConfig {
	
//	  In general in the case of @Autowire we are not explicitely not specify the
//	  Bean dependency which are usually create an instance for that and call it.

//Case D.5  In the case of Duplicate Bean with Different Bean id which is not matching to the @Qualifier attribute gives us null because Spring could not find the Exact match.
	
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
