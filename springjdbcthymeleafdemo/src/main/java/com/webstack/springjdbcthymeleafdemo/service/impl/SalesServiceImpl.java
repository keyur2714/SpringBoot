package com.webstack.springjdbcthymeleafdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webstack.springjdbcthymeleafdemo.dao.SalesDAO;
import com.webstack.springjdbcthymeleafdemo.model.Sales;
import com.webstack.springjdbcthymeleafdemo.service.SalesService;

@Service
public class SalesServiceImpl implements SalesService{

	@Autowired
	private SalesDAO salesDAO;  
	
	@Override
	public List<Sales> list() {
		return salesDAO.list();
	}

	@Override
	public void save(Sales sales) {
		salesDAO.save(sales);
	}

}
