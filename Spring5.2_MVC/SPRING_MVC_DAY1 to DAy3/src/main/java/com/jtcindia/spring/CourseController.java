package com.jtcindia.spring;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CourseController {
	@Autowired
	CourseServices courseService;

	public CourseController() {
		System.out.println("Course Controller*******");
	}

	@GetMapping(value = "myjava.jtc")
	public String getJavaCourses(HttpServletRequest request) {
		System.out.println("getJavaCourses in CourseController");
		// CourseServices sc = new CourseServices();
		List<String> mylist = courseService.getJavaCourses();
		request.setAttribute("MyCourses", mylist);
		request.setAttribute("CourseName", "JAVA");
		return "show";
	}

//	@GetMapping(value = "myspring.jtc")
//	public String getSpringCourses(HttpSession session) {
//		System.out.println("getSpringCourses in CourseController");
//		// CourseServices sc = new CourseServices();
//		List<String> mylist = courseService.getSpringCourses();
//		session.setAttribute("MyCourses", mylist);
//		session.setAttribute("CourseName", "SPRING");
//		return "show";
//	}

	@PostMapping(value = "myspring.jtc")
	public String getSpringCourses(HttpSession session) {
		System.out.println("getSpringCourses in CourseController"); 
		// CourseServices	sc = new CourseServices();
		List<String> mylist = courseService.getSpringCourses();
		session.setAttribute("MyCourses", mylist);
		session.setAttribute("CourseName", "SPRING");
		return "show";
	}

//	 After using @PostMapping we will get following error
	/*
	 * HTTP Status 405 - Request method 'GET' not supported
	 * 
	 * type Status report
	 * 
	 * message Request method 'GET' not supported
	 * 
	 * description The specified HTTP method is not allowed for the requested
	 * resource.
	 */
	
	
	// @RequestMapping(value = "myweb.jtc", method = RequestMethod.POST)// when we
	// are not specifying anything then by default it is get and after specifying it
	// with get then the code will run and if we specify it as post then code will
	// not run.
	@RequestMapping(value = "myweb.jtc", method = RequestMethod.POST) // method = Request.POST by default it is get if we
																		// are writing POST then we have to Provide POST																	// in UI also.
	public String getWebCourses(Model model) {
		System.out.println("getwebCourses in CourseController");
		List<String> mylist = courseService.getWebCourses();
		model.addAttribute("MyCourses", mylist);
		model.addAttribute("CourseName", "WEB");

		return "show";

	}
}
