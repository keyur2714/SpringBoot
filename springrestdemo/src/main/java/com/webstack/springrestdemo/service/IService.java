package com.webstack.springrestdemo.service;

import java.util.List;

public interface IService<E> {
	void save(E e);
	void update(E e,Integer id);
	E get(Integer id);
	List<E> list();
	void delete(Integer id);
}
