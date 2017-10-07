package edu.msudenver.cs.team_four;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import edu.msudenver.cs.team_four.models.CourseList;
import edu.msudenver.cs.team_four.models.Courses;

public class CourseListTest {

	@Test
	public void courseListSetUpTest(){
		CourseList cl = new CourseList();
	}
	
	/*
	 * Add Course Tests
	 */
	@Test
	public void addCourseTest() {
		Courses course = new Courses("Potions 201", "Dark Arts", 665, 
				3, "Advanced Potions for Advanced Wizards and Witches", 
				"Designed to create the potions you need while in extended isolation.", 
				"Points 101", "None");
		CourseList cl = new CourseList();
		cl.addCourse(course);
	}
	
	@Test
	public void addCourseFailTest() {
		Courses coures = new Courses("", "", 343, 3, "", "", "", "");
	}
	
	/*
	 * Remove Course Tests
	 */
	@Test
	public void removeCourseTest() {
		Courses course = new Courses("Potions 201", "Dark Arts", 665, 
				3, "Advanced Potions for Advanced Wizards and Witches", 
				"Designed to create the potions you need while in extended isolation.", 
				"Points 101", "None");
		CourseList cl = new CourseList();
		cl.addCourse(course);
		cl.removeCourse(0);
	}
	
	/*
	 * Clear Course List Test
	 */
	@Test
	public void clearCourseListTest() {
		Courses course = new Courses("Potions 201", "Dark Arts", 665, 
				3, "Advanced Potions for Advanced Wizards and Witches", 
				"Designed to create the potions you need while in extended isolation.", 
				"Points 101", "None");
		CourseList cl = new CourseList();
		cl.addCourse(course);
		cl.clearCourseList();
	}
	
	/*
	 * Show Course List Test
	 */
	@Test
	public void showCourseListTest() {
		Courses course = new Courses("Potions 201", "Dark Arts", 665, 
				3, "Advanced Potions for Advanced Wizards and Witches", 
				"Designed to create the potions you need while in extended isolation.", 
				"Points 101", "None");
		CourseList cl = new CourseList();
		cl.addCourse(course);
		cl.showCourseList();
	}
}
