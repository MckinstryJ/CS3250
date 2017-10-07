package edu.msudenver.cs.team_four.models;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfessorController {
	
	@RequestMapping("/Professors")
	public String home() {
		return LayoutController.HEADER + LayoutController.BODY;
	}

}
