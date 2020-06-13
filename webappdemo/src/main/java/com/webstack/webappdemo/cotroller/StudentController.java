package com.webstack.webappdemo.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.webstack.webappdemo.dto.StudentDTO;

@Controller
@RequestMapping("/students")
public class StudentController {

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
		modelMap.put("student", student);
		return "detail";
	}
}
