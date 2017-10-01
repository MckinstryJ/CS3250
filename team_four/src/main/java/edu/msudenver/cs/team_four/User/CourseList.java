package edu.msudenver.cs.team_four.User;

import java.util.*;

public class CourseList {
	
	private List<Courses> courseList = new ArrayList<Courses>();
	
	public String addCourse(Courses newCourse) {
		courseList.add(newCourse);
		return newCourse.courseName;
	}
	
	public String removeCourse(int CRN) {
		int index = 0;
		while(index < courseList.size()) {
			if(CRN == courseList.get(index).getCRN()) {
			courseList.remove(index);
			return "Course removed";
			}
			else {
				index ++;
			}
		}
		return "Course not found";
	}
	
	public String clearCourseList() {
		if(courseList.size() == 0) {
			return "No elements in list.";
		}
		else {
		courseList.clear();
		return "List emptied.";
		}
	}
	
	public String showCourseList(){
		if(courseList.size() == 0) {
			return "Course List is empty.";
		}
		else {
			int i = 0;
			Courses courseName = null;
			while(i < courseList.size()) {
				courseName = courseList.get(i);
				System.out.println(courseName.getCourseName());
				System.out.println(courseName.getCRN());
				System.out.println(courseName.getDepartment());
				System.out.println(courseName.getDescription());
				System.out.println(courseName.getLearningObj());
				System.out.println(courseName.getPrereqs());
				System.out.println(courseName.getCoreq());
				i++;
			}
		return "List displayed";
		}
	}
}
