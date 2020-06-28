package com.webstack.springjdbcthymeleafdemo.service;

import java.util.List;

public interface IService<T> {
	List<T> list();
	void save(T type);
}
