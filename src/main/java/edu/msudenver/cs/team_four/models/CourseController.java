package edu.msudenver.cs.team_four.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CourseController {
	
	@Autowired
	private CourseService courService;
	private Courses co;

	@RequestMapping(value="/courses", method=RequestMethod.POST)
	public String courseSubmit(Courses course, Model model)
	{	
		courService.addCourse(course);
		model.addAttribute("courses", courService.getAllCourses());
		co = new Courses();
		model.addAttribute("course", co);
		model.addAttribute("days", co.getDay());
		model.addAttribute("times", co.getTime());
		model.addAttribute("buildings", co.getBuilding());
		model.addAttribute("rooms", co.getRoom());
		return "courses";
	}
	
	@RequestMapping(value ="/courses", method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("courses", courService.getAllCourses());
		co = new Courses();
		model.addAttribute("course", co);
		model.addAttribute("days", co.getDay());
		model.addAttribute("times", co.getTime());
		model.addAttribute("buildings", co.getBuilding());
		model.addAttribute("rooms", co.getRoom());
		return "courses";
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/deleteCourse")
	public String deleteCourse(@RequestParam("courseId") String id, Model model) {
		courService.deleteCourse(id);
		co = new Courses();
		model.addAttribute("course", co);
		model.addAttribute("days", co.getDay());
		model.addAttribute("times", co.getTime());
		model.addAttribute("buildings", co.getBuilding());
		model.addAttribute("rooms", co.getRoom());
		model.addAttribute("courses", courService.getAllCourses());
		return "courses";
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/updateCourse")
	public String updateCourse(Courses course, Model model) {
		courService.updateCourse(course);
		co = new Courses();
		model.addAttribute("course", co);
		model.addAttribute("days", co.getDay());
		model.addAttribute("times", co.getTime());
		model.addAttribute("buildings", co.getBuilding());
		model.addAttribute("rooms", co.getRoom());
		model.addAttribute("courses", courService.getAllCourses());
		return "courses";
	}
}
