package edu.msudenver.cs.team_four.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CourseController {
	
	@Autowired
	private CourseService courService;

	@RequestMapping(value="/courses", method=RequestMethod.POST)
	public String courseSubmit(Courses course, Model model)
	{	
		courService.addCourse(course);
		model.addAttribute("courses", courService.getAllCourses());
		model.addAttribute("course", new Courses());
		return "courses";
	}
	
	@RequestMapping(value ="/courses", method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("courses", courService.getAllCourses());
		model.addAttribute("course", new Courses());
		return "courses";
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/deleteCourse")
	public String deleteCourse(@RequestParam("courseId") String id, Model model) {
		courService.deleteCourse(id);
		model.addAttribute("course", new Courses());
		model.addAttribute("courses", courService.getAllCourses());
		return "courses";
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/updateCourse")
	public String updateCourse(Courses course, Model model) {
		courService.updateCourse(course);
		model.addAttribute("course", new Courses());
		model.addAttribute("courses", courService.getAllCourses());
		return "courses";
	}
}