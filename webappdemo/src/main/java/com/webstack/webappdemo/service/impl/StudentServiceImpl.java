package com.webstack.webappdemo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webstack.webappdemo.domain.Student;
import com.webstack.webappdemo.dto.StudentDTO;
import com.webstack.webappdemo.repository.StudentRepository;
import com.webstack.webappdemo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void save(StudentDTO student) {
		
		Student stud = new Student();
		stud.setRollNo(student.getRollNo());
		stud.setName(student.getName());
		stud.setEmail(student.getEmail());
		stud.setMobileNo(student.getMobileNo());
		
		studentRepository.save(stud);
	}

	@Override
	public StudentDTO get(Long id) {
		Student student = studentRepository.getOne(id);
		StudentDTO studentDTO = new StudentDTO();
		studentDTO.setId(student.getId());
		studentDTO.setName(student.getName());
		studentDTO.setRollNo(student.getRollNo());
		studentDTO.setEmail(student.getEmail());
		studentDTO.setMobileNo(student.getMobileNo());
		return studentDTO;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		Student student = studentRepository.getOne(id);
		studentRepository.delete(student);
		
	}

	@Override
	public List<StudentDTO> list() {
		// TODO Auto-generated method stub
		List<Student> students = studentRepository.findAll();
		List<StudentDTO> studentsDTO = new ArrayList<StudentDTO>();
		for(Student student : students) {
			StudentDTO studentDTO = new StudentDTO();
			studentDTO.setId(student.getId());
			studentDTO.setName(student.getName());
			studentDTO.setRollNo(student.getRollNo());
			studentDTO.setEmail(student.getEmail());
			studentDTO.setMobileNo(student.getMobileNo());
			studentsDTO.add(studentDTO);
		}
		
		return studentsDTO;
	}

}
