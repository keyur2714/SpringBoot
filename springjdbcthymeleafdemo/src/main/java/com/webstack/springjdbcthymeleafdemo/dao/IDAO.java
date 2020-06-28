package com.webstack.springjdbcthymeleafdemo.dao;

import java.util.List;

public interface IDAO<T> {
	List<T> list();
	void save(T type);
}
