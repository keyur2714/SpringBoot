package com.webstack.springjdbcthymeleafdemo.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.webstack.springjdbcthymeleafdemo.dao.SalesDAO;
import com.webstack.springjdbcthymeleafdemo.model.Sales;

@Repository
@Transactional
public class SalesDOAImpl implements SalesDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public List<Sales> list() {		
		return jdbcTemplate.query("select * from item_transaction", BeanPropertyRowMapper.newInstance(Sales.class));
	}

	@Override
	public void save(Sales sales) {
		String query = "insert into item_transaction (item_name,quantity,amount) values (?,?,?)";
		Object obj[]={sales.getItemName(),sales.getQuantity(),sales.getAmount()};
		jdbcTemplate.update(query, obj );
	}

}
