package edu.msudenver.cs.team_four.User.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.msudenver.cs.team_four.User.Student;
import edu.msudenver.cs.team_four.User.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService StudentService;
	
	private String studentTable = "<table class = \"table table-responsive bg-primary\" style=\"width: 80%; align: center\">"
			+ "					<tr>"
			+ "						<th>Student ID #</th>"	
			+ "						<th>First Name</th>"
			+ "						<th>Last Name</th>"
			+ "						<th>Options</th>"
			+ "					</tr>";

	@RequestMapping("/Students")
	public String getAllStudents(){
		return LayoutController.HEADER + studentTable + LayoutController.BODY;
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
