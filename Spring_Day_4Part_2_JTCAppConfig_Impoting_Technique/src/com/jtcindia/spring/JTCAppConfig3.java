package com.jtcindia.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JTCAppConfig3 {
	@Bean("myHai")
	public Hai createHai(A ao, B bo) {
		Hai hai = new Hai();
		hai.setAobj(ao);
		hai.setBobj(bo);
		return hai;
	} 
}
