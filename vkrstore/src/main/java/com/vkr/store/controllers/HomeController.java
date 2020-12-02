package com.vkr.store.controllers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vkr.store.services.ServiceInfo;





@Controller
public class HomeController {
	
	@RequestMapping("/")
	@ResponseBody
	public String home() {		
		return "Hello World!!!";	
	}
	
	@RequestMapping("/home")	
	public String home(HashMap<String,Object> model) {		
		List<ServiceInfo> services= Arrays.asList(
				new ServiceInfo("Service List", "/services")				
				);		
		model.put("services", services);
		//path of the jsp file
		return "/WEB-INF/views/index.jsp";
	}	
	
	@RequestMapping("/welcome")
	@ResponseBody
	public String welcome() {
		
		return "Welcome to Spring Boot";
	
	}
	
	@RequestMapping("/services")
	@ResponseBody
	public String services() {
		
		return "Currently we are in progress for creating services for our store, Please visit again....";
	
	}
	
}
