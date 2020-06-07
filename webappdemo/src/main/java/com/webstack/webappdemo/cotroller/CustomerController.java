package com.webstack.webappdemo.cotroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {

	
	@RequestMapping("/customer")
	public String customer(HttpServletRequest request) {
		
		String name = request.getParameter("cname");
		
		System.out.println(name);
		
		HttpSession session = request.getSession();
		
		//request.setAttribute("cname", name);
		session.setAttribute("cname", name);
		return "customer";
	}
	
}
