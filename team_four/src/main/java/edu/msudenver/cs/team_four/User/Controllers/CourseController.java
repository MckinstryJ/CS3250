package edu.msudenver.cs.team_four.User.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	private String courseTable = "<table class = \"table table-responsive bg-primary\" style=\"width: 80%; align: center\">"
			+ "					<tr>"
			+ "						<th>CRN</th>"	
			+ "						<th>Name</th>"
			+ "						<th>Department</th>"
			+ "						<th>Options</th>"
			+ "					</tr>";
	
	@RequestMapping("/Courses")
	public String home() {
		return LayoutController.HEADER + courseTable + LayoutController.BODY;
	}

}
