package com.jtcindia.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JTCAppConfig1 {
	@Bean("ao")
	public A createA(){
		A ao = new A();
		ao.setA(100);
		ao.setMsg("JTCA");
		return ao;
		
	}
	@Bean("bo")
	public B createB(){
		B bo = new B(101,"JTCB");
		return bo;
		
	}

}
