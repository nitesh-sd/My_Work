package com.jtc.Spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JTCAppCOnfig {
	static {
		System.out.println("SB in JTCAppConfig");
		
	}
	@Bean
	public A createA() {
		A ao = new A();
		ao.setA(100);
		ao.setStr("Hello in A");
		return ao;

	}
	@Bean("B")
	public B createB() {
		B bo = new B(102,"Hello in B");
		return bo;
	}
	
	@Bean("Hello")
	public Hello createHello(A ao, B bo) {
	Hello h1 = new Hello(bo);
	h1.setAobj(ao);
	return h1;
	
	}

}
