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
	
	public String addCourse(Courses cour) {
		String result;
		courRepo.save(cour);
		return  result = cour + " added.";
	}
	
	public String updateCourse(Courses cour) {
		String result;
		courRepo.save(cour);
		return result = cour + " updated.";
	}
	
	public String deleteCourse(String id) {
		String result;
		courRepo.delete(id);
		return result = "Course with id " + id + " deleted.";
	}

}
