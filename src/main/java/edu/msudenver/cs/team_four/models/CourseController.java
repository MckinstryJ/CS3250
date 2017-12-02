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
	private CourseView courseView = new CourseView();

	@RequestMapping(value="/courses", method=RequestMethod.POST)
	public String courseSubmit(Courses course, Model model)
	{	
		courService.addCourse(course);
		model.addAttribute("courses", courService.getAllCourses());
		co = new Courses();
		model.addAttribute("course", co);
		model.addAttribute("days", courseView.getDay());
		model.addAttribute("times", courseView.getTime());
		model.addAttribute("buildings", courseView.getBuilding());
		model.addAttribute("rooms", courseView.getRoom());
		//Once selected remove from courseView
		return "courses";
	}
	
	@RequestMapping(value ="/courses", method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("courses", courService.getAllCourses());
		co = new Courses();
		model.addAttribute("course", co);
		model.addAttribute("days", courseView.getDay());
		model.addAttribute("times", courseView.getTime());
		model.addAttribute("buildings", courseView.getBuilding());
		model.addAttribute("rooms", courseView.getRoom());
		return "courses";
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/deleteCourse")
	public String deleteCourse(@RequestParam("courseId") String id, Model model) {
		courService.deleteCourse(id);
		co = new Courses();
		model.addAttribute("course", co);
		model.addAttribute("days", courseView.getDay());
		model.addAttribute("times", courseView.getTime());
		model.addAttribute("buildings", courseView.getBuilding());
		model.addAttribute("rooms", courseView.getRoom());
		model.addAttribute("courses", courService.getAllCourses());
		//Once deleted add back variables to courseView (in original order)
		return "courses";
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/updateCourse")
	public String updateCourse(Courses course, Model model) {
		courService.updateCourse(course);
		co = new Courses();
		model.addAttribute("course", co);
		model.addAttribute("days", courseView.getDay());
		model.addAttribute("times", courseView.getTime());
		model.addAttribute("buildings", courseView.getBuilding());
		model.addAttribute("rooms", courseView.getRoom());
		model.addAttribute("courses", courService.getAllCourses());
		return "courses";
	}
}
