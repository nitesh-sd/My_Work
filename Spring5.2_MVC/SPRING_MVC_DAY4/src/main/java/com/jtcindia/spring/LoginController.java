package com.jtcindia.spring;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
	@Autowired 
	private UserValidator userValidator;
	
	@GetMapping("/showLogin.jtc")
	public String showLoginForm(Model model) throws ServletException{
		System.out.println("ShoLoginForm in LoginCOntroller*****");
		User user = new User();
		user.setUsername("Nitesh Kumar");
		model.addAttribute("MyUser", user);
		return "login";
	}
//	@GetMapping("/showLogin.jtc")
//	public String showLoginForm(HttpServletRequest  model) throws ServletException{
//		System.out.println("ShoLoginForm in LoginCOntroller*****");
//		User user = new User();
//		user.setUsername("Nitesh Kumar");
//		model.setAttribute("myuser", user);
//		return "login";
//	}
//	
	@PostMapping("/verifyUser.jtc")
	public String VerifyUser(@ModelAttribute("MyUser")User user,BindingResult result) {
		System.out.println("verifyUser method in LoginController **** ");
		userValidator.validate(user, result);
		if(result.hasErrors()) {
			System.out.println(result.getErrorCount());
			return "login";
		}
		String un = user.getUsername();
		String pw = user.getPassword();
		if(un.equals(pw))
			return "home";
		return "login";
	}

}
