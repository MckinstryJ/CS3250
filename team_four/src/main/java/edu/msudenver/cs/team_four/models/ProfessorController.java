package edu.msudenver.cs.team_four.models;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfessorController {
	
	private ProfessorService proService;
	
	private String proTable = LayoutController.TABLE
			+ "					<tr>"
			+ "						<th>Professor's Name</th>"	
			+ "						<th>Deparment</th>"
			+ "						<th>Options</th>"
			+ "					</tr>";

	@RequestMapping("/Professors")
	public String getAllProfessors(){
		//Employee Id? with Name...department implied?
		Professor pro = new Professor("111111", "Dr. Beaty");
		proService.addProfessor(pro);
		
		String proList = "";
		for (Professor p : proService.getAllProfessors()) {
			proList += "<tr><th>" + p.getId() + "</th>" 
							+ "<th>" + p.getName() + "</th>"
							+ "<th>" + "<a href=\"/Professors/" + p.getId() + "\">INFO</a></tr>";
		}
		return LayoutController.HEADER + proTable + proList + LayoutController.BODY;
	}
	
	@RequestMapping("/Professors/{id}")
	public String getProfessor(@PathVariable String id) {
		Professor pro = proService.getProfessor(id);
		
		//Area for adding/updating/deleting a new professor
		return null;
	}

}
