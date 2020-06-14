package com.webstack.webappdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webstack.webappdemo.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
