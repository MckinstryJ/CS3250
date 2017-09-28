package edu.msudenver.cs.team_four.User;

import java.util.*;

public class CourseList {
	
	private List<Courses> courseList = new ArrayList<Courses>();
	
	public void addCourse(Courses newCourse) {
		courseList.add(newCourse);
	}
	
	public void removeCourse(int index) {
		courseList.remove(index);
	}
	
	public void clearCourseList() {
		courseList.clear();
	}
	
	public void showCourseList(){
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
	}

}
