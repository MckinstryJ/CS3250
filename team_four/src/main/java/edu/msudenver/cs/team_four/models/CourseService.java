package edu.msudenver.cs.team_four.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CourseService {
	
	@Autowired
	private CourseRepository courRepo;
	
	public ArrayList<Courses> getAllCourses() {
		ArrayList<Courses> cour = new ArrayList<>();
		courRepo.findAll().forEach(cour::add);
		return cour;
	}
	
	public Courses getCourse(String id) {
		return courRepo.findOne(id);
	}
	
	public void addCourse(Courses cour) {
		courRepo.save(cour);
	}
	
	public void updateCourse(String id, Courses cour) {
		courRepo.save(cour);
	}
	
	public void deleteCourse(String id) {
		courRepo.delete(id);
	}

}
