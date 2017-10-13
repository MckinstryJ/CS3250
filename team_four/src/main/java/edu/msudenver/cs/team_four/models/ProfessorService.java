package edu.msudenver.cs.team_four.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ProfessorService {
	
	@Autowired
	private ProfessorRepository proRepo;
	
	public List<Professor> getAllProfessors() {
		List<Professor> pro = new ArrayList<>();
		proRepo.findAll().forEach(pro::add);
		return pro;
	}
	
	public Professor getProfessor(String id) {
		return proRepo.findOne(id);
	}
	
	public void addProfessor(Professor pro) {
		proRepo.save(pro);
	}
	
	public void updateProfessor(String id, Professor pro) {
		proRepo.save(pro);
	}
	
	public void deleteProfessor(String id) {
		proRepo.delete(id);
	}

}
