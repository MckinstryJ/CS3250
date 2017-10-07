package edu.msudenver.cs.team_four.models;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SectionController {
	
	@RequestMapping("/Sections")
	public String home() {
		return LayoutController.HEADER + LayoutController.BODY;
	}

}
