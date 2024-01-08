package com.jtcindia.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Hello {
	//since we are not using setter or constructor So for dependency injection we are using @Autowire annotation
	
	@Autowired(required = false)
	Hai hai;
	
	//Here we have not written any setters or constructor
	void show() {
		System.out.println("show in Hello");
		System.out.println(hai);//the moment when we are calling this method it means that we are trying to call the toString() method
	}
}
