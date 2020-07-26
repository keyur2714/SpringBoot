package com.webstack.billdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webstack.billdesk.domain.User;

@Repository
public interface UserRespository extends JpaRepository<User, Long>{

	User findByUsername(String username);
	
}
