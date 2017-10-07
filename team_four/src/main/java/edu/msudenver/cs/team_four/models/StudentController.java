package edu.msudenver.cs.team_four.models;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	private String studentTable = "<table class = \"table table-responsive bg-primary\" style=\"width: 80%; align: center\">"
			+ "					<tr>"
			+ "						<th>Student ID #</th>"	
			+ "						<th>Name</th>"
			+ "						<th>Options</th>"
			+ "					</tr>";

	@RequestMapping("/Students")
	public String getAllStudents(){
		//AS AN EXAMPLE
		Student stu = new Student("123456", "John Mckinstry");
		studentService.addStudent(stu);
		
		//How we will display student info through table...
		String studentList = "";
		for (Student s : studentService.getAllStudents()) {
			studentList += "<tr><th>" + s.getId() + "</th>" 
							+ "<th>" + s.getName() + "</th>"
							+ "<th>" + "options..." + "</tr>";
		}
		return LayoutController.HEADER + studentTable + studentList + LayoutController.BODY;
	}
	
	@RequestMapping("/Students/{id}")
	public Student getStudent(@PathVariable String id) {
		return studentService.getStudent(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/Students")
	public void addStudent(@RequestBody Student Student) {
		studentService.addStudent(Student);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/Students/{id}")
	public void updateStudent(@RequestBody Student Student, @PathVariable String id) {
		studentService.updateStudent(id, Student);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/Students/{id}")
	public void addStudent(@PathVariable String id) {
		studentService.deleteStudent(id);
	}
}
