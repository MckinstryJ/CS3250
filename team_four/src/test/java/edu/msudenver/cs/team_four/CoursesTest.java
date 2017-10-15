package edu.msudenver.cs.team_four;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.msudenver.cs.team_four.models.*;

public class CoursesTest {
	
	static Courses courseTester = new Courses("Bork" , "Bork Bork", "Meep","Mana manah", "Doop dee a doop doop"
												,"Doop doo da doo", "Miss Piggy", "Kermit");
	
	@Test
	public void setCRNTest() {
		courseTester.setCoursenumber("12345");
		assertEquals("12345", courseTester.getCoursenumber());
	}
	
	@Test
	public void setCourseNameTest() {
		courseTester.setCourseName("Computer Science 1");
		assertEquals("Computer Science 1", courseTester.getCourseName());
	}
	
	@Test
	public void setCourseDepartment() {
		courseTester.setDepartment("Computer Science");
		assertEquals("Computer Science", courseTester.getDepartment());
	}
	
	@Test
	public void setCoursePrereq() {
		courseTester.setPrereqs("Pressing the power button");
		assertEquals("Pressing the power button", courseTester.getPrereqs());
	}
	
	@Test
	public void setCourseCoreq() {
		courseTester.setCoreqs("None");
		assertEquals("None", courseTester.getCoreqs());
	}
	
	@Test
	public void setCourseDecrip() {
		courseTester.setDescription("Learn some shit");
		assertEquals("Learn some shit", courseTester.getDescription());
	}
	
	@Test
	public void setCourseCreds() {
		courseTester.setCredits("4");
		assertEquals("4", courseTester.getCredits());
	}
	
	@Test
	public void setCourseLearn() {
		courseTester.setLearningObjectives("Learn computer shit");
		assertEquals("Learn computer shit", courseTester.getLearningObjectives());
	}
}
