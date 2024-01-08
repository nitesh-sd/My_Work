package com.jtcindia.Spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

 @Configuration
public class JTCAppConfig {
	static{
		System.out.println("sb in JTCAppConfig");
		
	}
	@Bean
	public A createA() {
		A ao = new A();
		ao.setA(99);
		ao.setMsg("JTC Spring");
		return ao;
	}
	@Bean("BO")
	public B createB() {
	B bo = new B(888,"Hello B");
		return bo;
	}
	@Bean("myHello")
	public Hello createHello(A ao, B bo) {
		Hello h1 = new Hello(bo);
		h1.setAobj(ao);
		return h1;
		}

}
