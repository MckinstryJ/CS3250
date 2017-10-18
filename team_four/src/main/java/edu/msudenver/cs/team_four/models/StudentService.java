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
	
	public String addStudent(Student Student) {
		String result;
		stuRepo.save(Student);
		return  result = Student + "added to database.";
	}
	
	public String updateStudent(Student Student) {
		String result;
		stuRepo.save(Student);
		return result = Student + "updated";
	}
	
	public String deleteStudent(String id) {
		String result;
		stuRepo.delete(id);
		return result = "Student with id " + id + " deleted.";
	}
}
