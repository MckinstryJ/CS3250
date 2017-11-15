package edu.msudenver.cs.team_four;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.msudenver.cs.team_four.models.*;

public class CoursesTest {
	
	static Courses courseTester = new Courses("Bork" , "Bork Bork", "Meep","Mana manah", "Doop dee a doop doop"
												,"Doop doo da doo", "Miss Piggy", "Kermit", "a", "b", "c", "d"
												,"e", "f","g");
	
	@Test
	public void constructorTest() {
		Courses cour = new Courses();
	}
	
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
	
	@Test
	public void setCourseSemester() {
		courseTester.setSemester("Spring");
		assertEquals("Spring", courseTester.getSemester());
	}
	
	@Test
	public void setCourseStartDate() {
		courseTester.setStartDate("Spring");
		assertEquals("Spring", courseTester.getStartDate());
	}
	
	@Test
	public void setCourseEndDate() {
		courseTester.setEndDate("Spring");
		assertEquals("Spring", courseTester.getEndDate());
	}
	
	@Test
	public void setCourseBuilding() {
		courseTester.setBuilding("Spring");
		assertEquals("Spring", courseTester.getBuilding());
	}
	
	@Test
	public void setCourseRoom() {
		courseTester.setRoom("Spring");
		assertEquals("Spring", courseTester.getRoom());
	}
	
	@Test
	public void setCourseDay() {
		courseTester.setDay("Spring");
		assertEquals("Spring", courseTester.getDay());
	}
	
	@Test
	public void setCourseTime() {
		courseTester.setTime("Spring");
		assertEquals("Spring", courseTester.getTime());
	}
}
