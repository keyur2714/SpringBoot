package com.webstack.webappdemo.cotroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping("/customerParam")
	public String customerWithParams(String cname,HttpSession session) {
		
		String name = cname;
		
		System.out.println(name);
						
		//request.setAttribute("cname", name);
		session.setAttribute("cname", name);
		return "customer";
	}
	
	@GetMapping("/customerMv")
	public ModelAndView customerDisplay(@RequestParam(name = "cname") String customerName,@RequestParam(name = "mobileNo") String mobileNumber) {
		
		System.out.println(customerName+" "+mobileNumber);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("cname", customerName);
		mv.addObject("mobileNo",mobileNumber);
		
		mv.setViewName("customer");
		
		return mv;
	}
	
	
}
