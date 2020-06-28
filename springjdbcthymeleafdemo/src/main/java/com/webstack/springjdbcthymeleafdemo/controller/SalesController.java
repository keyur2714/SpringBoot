package com.webstack.springjdbcthymeleafdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.webstack.springjdbcthymeleafdemo.model.Sales;
import com.webstack.springjdbcthymeleafdemo.service.impl.SalesServiceImpl;

@Controller
public class SalesController {

	@Autowired
	private SalesServiceImpl salesService;
	
	@GetMapping("/")
	public String index() {
		return "index.html";
	}
	
	@GetMapping("/new")
	public ModelAndView newSales() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("sales",new Sales());
		modelAndView.setViewName("newsales");
		return modelAndView;
	}
	
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public String save(@ModelAttribute("sales") Sales sales) {
		salesService.save(sales);
		return "redirect:/sales";
	}
	
	@GetMapping("/sales")
	public ModelAndView sales() {
		List<Sales> salesList = salesService.list();
		ModelAndView mv = new ModelAndView();
		mv.addObject("salesList", salesList);
		mv.setViewName("sales");
		
		return mv;
	}
	
}
