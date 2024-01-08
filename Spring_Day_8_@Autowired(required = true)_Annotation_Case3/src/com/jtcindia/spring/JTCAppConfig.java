package com.jtcindia.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JTCAppConfig {
	/*
	 * In general in the case of @Autowire we are not explicitely not specify the
	 * Bean dependency which are usually create an instance for that and call it.
	 */
//Case 3 --> when two duplicate Beans are fount with different Bean Id and Method
	@Bean("myhai1")
	public Hai createHai1() {
		Hai hai = new Hai();
		hai.setMsg("I am in Hai");
		return hai;
	}

	@Bean("myhai2")
	public Hai createHai2() {
		Hai hai = new Hai();
		hai.setMsg("I am in Hai");
		return hai;
	}

	@Bean("myhello")
	public Hello createHello() {
		Hello h1 = new Hello();
		return h1;
	}
}
