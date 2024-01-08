package com.jtcindia.Spring;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class JTCAppConfig {

	@Bean("ao")
	@Lazy
	public A createA(B b) {
		System.out.println("createA in JTCAppConfig");
		A a1 = new A();
		a1.setB(b);
		return a1;

	}

	@Bean("bo")
	@Lazy
	public B createB(A a) {
		System.out.println("createB in JTCAppConfig");
		B b1 = new B();
		b1.setA(a);
		return b1;

	}

	@Bean(name = "myhello", autowire = Autowire.BY_TYPE)
	public Hello createHello(A ao, B bo) {
		System.out.println("createHello in JTCAppCongi");
		Hello h1 = new Hello();
		h1.setAobj(ao);
		h1.setBobj(bo);
		return h1;
		
		

	}
}
