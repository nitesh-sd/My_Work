package com.jtcindia.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CourseServices {
	List<String> getJavaCourses(){
		List<String> mylist = new ArrayList<>();
		mylist.add("Core Jave");
		mylist.add("OOPS");
		
		return mylist;
		
	}
	public List<String> getSpringCourses(){
		List<String> mylist = new ArrayList<>();
		mylist.add("Spring IOC");
		mylist.add("Spring MVC");
		mylist.add("Spring with Rest API");		
		return mylist;
	}
	public List<String> getWebCourses(){
		List<String> mylist = new ArrayList<>();
		mylist.add("HTML");
		mylist.add("CSS");
		mylist.add("JAVASCRIPT");		
		return mylist;
	}

}
