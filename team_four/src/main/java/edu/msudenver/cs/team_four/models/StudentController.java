package edu.msudenver.cs.team_four.models;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	private String studentTable = LayoutController.TABLE
			+ "					<tr>"
			+ "						<th>Student ID #</th>"	
			+ "						<th>Name</th>"
			+ "						<th>Options</th>"
			+ "					</tr>";

	@RequestMapping("/Students")
	public String getAllStudents(){
		Student stu = new Student("123456", "John Mckinstry");
		studentService.addStudent(stu);
		
		String studentList = "";
		for (Student s : studentService.getAllStudents()) {
			studentList += "<tr><th>" + s.getId() + "</th>" 
							+ "<th>" + s.getName() + "</th>"
							+ "<th>" + "<a href=\"/Students/" + s.getId() 
							+ "\">INFO</a></tr>";
		}
		return LayoutController.HEADER + studentTable + studentList + LayoutController.BODY;
	}
	
	@RequestMapping("/Students/{id}")
	public String getStudent(@PathVariable String id) {
		Student stu = studentService.getStudent(id);
		
		String studentForm = "<form name=\"stuInfo\" action=\"stuInfo\" method=\"PUT\" class=\"bg-info\" style=\"width:80%;margin-left:2%;margin-right:45%;padding:20px;>"
				+ "			<div class=\"form-group\">" 
				+ "				<label for=\"studentID\">Student Id:</label>"
				+ "				<input name=\"id\" type=\"text\" class=\"form-control\" id=\"studentID\" placeholder=\"" 
									+ stu.getId() + "\">"
				+ "			</div>"
				+ "			<div class=\"form-group\">"
				+ "				<label for=\"studentName\"><br>Name:</label>"
				+ "				<input name=\"newName\" type=\"text\" class=\"form-control\" id=\"studentName\" placeholder=\"" 
									+ stu.getName() + "\">"
				+ "			</div>"
				+ "			<button type=\"submit\" class=\"btn btn-primary\">Update</button>"
				+ "			<button type=\"delete\" class=\"btn btn-primary\">Delete</button>"
				+ "		</form>";
		
		return LayoutController.HEADER + studentForm + LayoutController.BODY;
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
		
		return getStudent(id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/Students/{id}")
	public void addStudent(@PathVariable String id) {
		studentService.deleteStudent(id);
	}
}
