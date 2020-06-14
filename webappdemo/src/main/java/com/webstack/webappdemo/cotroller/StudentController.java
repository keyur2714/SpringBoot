package com.webstack.webappdemo.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.webstack.webappdemo.dto.StudentDTO;
import com.webstack.webappdemo.service.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {

	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/getStudentById")
	@ResponseBody
	public StudentDTO getStudentById(Long id) {
		return studentService.get(id);
	}
	
	@GetMapping("/")
	public String getAllStudents(ModelMap modelMap){
		List<StudentDTO> allStudents = studentService.list();
		
		modelMap.put("students", allStudents);
		
		return "managestudents";
	}
	
	
	@GetMapping("/add")
	public String studentEntry() {
		return "student";
	}
	
/*	@PostMapping("/save")
	public String save(@RequestParam("rollNo") String rollNo,@RequestParam("name") String name,ModelMap modelMap ) {
		System.out.println(rollNo+ " " + name);
		modelMap.put("rollNo", rollNo);
		modelMap.put("name", name);
		return "detail";
	}*/
	
	@PostMapping("/save")
	public String save(StudentDTO student,ModelMap modelMap ) {
		System.out.println(student);
		/*modelMap.put("rollNo", student.getRollNo());
		modelMap.put("name", student.getName());
		modelMap.put("mobileNo", student.getMobileNo());
		modelMap.put("email", student.getEmail());*/
		studentService.save(student);
		modelMap.put("student", student);
		return "detail";
	}
	
	@GetMapping("/getStudent")
	public String get(@RequestParam(name = "id") Long id,ModelMap modelMap) {
		StudentDTO studentDTO = studentService.get(id);
		modelMap.put("student", studentDTO);
		return "detail";
	}
	
}
