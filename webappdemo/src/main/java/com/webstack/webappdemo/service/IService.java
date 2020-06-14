package com.webstack.webappdemo.service;

import java.util.List;

public interface IService<T> {

	List<T> list();
	void save(T type);
	T get(Long id);
	void delete(Long id);
	
}
