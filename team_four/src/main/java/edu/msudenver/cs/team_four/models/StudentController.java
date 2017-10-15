package edu.msudenver.cs.team_four.models;

import java.io.Console;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="/students", method=RequestMethod.POST)
	public String studentSubmit(Student student, Model model)
	{	
		studentService.addStudent(student);
		model.addAttribute("students", studentService.getAllStudents());
		model.addAttribute("student", new Student());
		return "students";
	}
	
	@RequestMapping(value ="/students", method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("student", new Student());
		model.addAttribute("students", studentService.getAllStudents());
		return "students";
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/deleteStudent")
	public String deleteStudent(@RequestParam("studentId") String id, Model model) {
		studentService.deleteStudent(id);
		model.addAttribute("student", new Student());
		model.addAttribute("students", studentService.getAllStudents());
		return "students";
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/updateStudent")
	public String updateStudent(Student student, Model model) {
		studentService.updateStudent(student);
		model.addAttribute("student", new Student());
		model.addAttribute("students", studentService.getAllStudents());
		return "students";
	}
	
/*	
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
	*/
}
