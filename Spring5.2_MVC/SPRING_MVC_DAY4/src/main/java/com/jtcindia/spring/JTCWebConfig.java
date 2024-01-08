package com.jtcindia.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@ComponentScan({"com.jtcindia.spring"})
public class JTCWebConfig {
	public JTCWebConfig() {
		System.out.println("JTCWebConfig constructor....");
	}
	@Bean
	public InternalResourceViewResolver viewResolver() {
		System.out.println("ViewRes ....");
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}

}
