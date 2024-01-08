package com.jtcindia.spring;

import java.sql.Connection;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class UserValidator implements Validator{  
	//THe UserVaidator class must implement Validator interface

	@Override
	public boolean supports(Class clazz) {
		System.out.println("supports in UserValidator");
		
		return User.class.equals(clazz);
	}

	@Override
	public void validate(Object command, Errors errors) {
		System.out.println("validator in UserValidator");
		User user =(User) command;
		if(user.getUsername() == null|| user.getUsername().length()==0) {
			errors.rejectValue("username", "errors.required", new Object[] {"Username"},"UserName is Required");
		}
		if(user.getPassword() == null|| user.getPassword().length()==0 || user.getPassword().length()<= 9){
			errors.rejectValue("password", "errors.required", new Object[] {"Password"},"Password is Required");
		}
	}

	
	

}
