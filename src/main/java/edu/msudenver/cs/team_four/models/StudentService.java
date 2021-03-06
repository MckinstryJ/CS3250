package edu.msudenver.cs.team_four.models;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	private StudentRepository stuRepo;
	
	public ArrayList<Student> getAllStudents() {
		ArrayList<Student> Students = new ArrayList<>();
		stuRepo.findAll().forEach(Students::add);
		return Students;
	}
	
	public Student getStudent(String id) {
		return stuRepo.findOne(id);
	}
	
	public void addStudent(Student Student) {
		stuRepo.save(Student);
	}
	
	public void updateStudent(Student Student) {
		stuRepo.save(Student);
	}
	
	public void deleteStudent(String id) {
		stuRepo.delete(id);
	}
}
