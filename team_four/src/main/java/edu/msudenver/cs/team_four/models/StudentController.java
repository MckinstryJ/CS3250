package edu.msudenver.cs.team_four.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/students")
	public String studentLanding() {
		return "students";
	}
	
/*
	@RequestMapping("/Students/{id}")
	public Student getStudent(@PathVariable String id) {
		Student stu = studentService.getStudent(id);
		return stu;
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/Students")
	public void addStudent(@RequestBody Student student) {
		studentService.addStudent(student);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/stuInfo")
	public String updateStudent(@PathVariable String id, @RequestParam("newName") String newName) {
		Student stu = studentService.getStudent(id);
		if (newName != null) {
			stu.setName(newName);
			studentService.updateStudent(id, stu);
		} else {
			//???
		}
		
		return "";
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/Students/{id}")
	public void deleteStudent(@PathVariable String id) {
		studentService.deleteStudent(id);
	}
	*/
}