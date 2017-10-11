package edu.msudenver.cs.team_four.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ProfessorController {
	
	@Autowired
	private ProfessorService proService;
	
	@RequestMapping("/professors")
	public String professorLanding() {
		return "professors";
	}
	/*
	@RequestMapping("/professor.html/{id}")
	public Professor getProfessor(@PathVariable String id) {
		Professor pro = proService.getProfessor(id);
		return pro;
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/professor.html")
	public void addProfessor(@RequestBody Professor pro) {
		proService.addProfessor(pro);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/stuInfo")
	public String updateProfessor(@PathVariable String id, @RequestParam("newName") String newName) {
		Student stu = proService.getStudent(id);
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