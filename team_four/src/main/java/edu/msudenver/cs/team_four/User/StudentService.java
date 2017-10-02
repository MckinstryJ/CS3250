package edu.msudenver.cs.team_four.User;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	private StudentRepository StudentRepository;
	
	public List<Student> getAllStudents() {
		List<Student> Students = new ArrayList<>();
		StudentRepository.findAll().forEach(Students::add);
		return Students;
	}
	
	public Student getStudent(String id) {
		return StudentRepository.findOne(id);
	}
	
	public void addStudent(Student Student) {
		StudentRepository.save(Student);
	}
	
	public void updateStudent(String id, Student Student) {
		StudentRepository.save(Student);
	}
	
	public void deleteStudent(String id) {
		StudentRepository.delete(id);
	}
}
