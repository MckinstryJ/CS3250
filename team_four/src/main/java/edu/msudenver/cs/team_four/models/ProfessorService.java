package edu.msudenver.cs.team_four.models;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessorService {

	@Autowired
	private ProfessorRepository ProfessorRepository;
	
	public List<Professor> getAllProfessors() {
		List<Professor> pro = new ArrayList<>();
		ProfessorRepository.findAll().forEach(pro::add);
		return pro;
	}
	
	public Professor getProfessor(String id) {
		return ProfessorRepository.findOne(id);
	}
	
	public void addProfessor(Professor Professor) {
		ProfessorRepository.save(Professor);
	}
	
	public void updateProfessor(String id, Professor Professor) {
		ProfessorRepository.save(Professor);
	}
	
	public void deleteProfessor(String id) {
		ProfessorRepository.delete(id);
	}
}
