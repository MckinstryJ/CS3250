package edu.msudenver.cs.team_four.User;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService StudentService;

	@RequestMapping("/Students")
	public List<Student> getAllStudents(){
		return StudentService.getAllStudents();
	}
	
	@RequestMapping("/Students/{id}")
	public Student getStudent(@PathVariable String id) {
		return StudentService.getStudent(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/Students")
	public void addStudent(@RequestBody Student Student) {
		StudentService.addStudent(Student);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/Students/{id}")
	public void updateStudent(@RequestBody Student Student, @PathVariable String id) {
		StudentService.updateStudent(id, Student);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/Students/{id}")
	public void addStudent(@PathVariable String id) {
		StudentService.deleteStudent(id);
	}
}
