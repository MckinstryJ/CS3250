package edu.msudenver.cs.team_four.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CourseController {
	
	@Autowired
	private CourseService courService;
	
	@RequestMapping("/courses")
	public String professorLanding(Model model) {
		model.addAttribute("course", new Courses());
		return "courses";
	}
	
	@RequestMapping(value="/courses", method=RequestMethod.POST)
	public void professorSubmit(@ModelAttribute(value="course") Courses cour)
	{	
		courService.addCourse(cour);
	}

}
