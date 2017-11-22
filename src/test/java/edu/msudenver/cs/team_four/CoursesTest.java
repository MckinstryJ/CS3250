package edu.msudenver.cs.team_four;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.msudenver.cs.team_four.models.*;

public class CoursesTest {
	
	static Courses courseTester = new Courses("Bork" , "Bork Bork", "Meep","Mana manah", "Doop dee a doop doop"
												,"Doop doo da doo", "Miss Piggy", "Kermit");
	
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
		String[] semester = {"Spring","Spring","Spring"};
		courseTester.setSemester(semester);
		assertEquals("Spring", courseTester.getSemester()[0]);
	}
	@Test
	public void setCourseDates() {
		String[] dates = {"15","23","21"};
		courseTester.setDates(dates);
		assertEquals("23", courseTester.getDates()[1]);
	}
	@Test
	public void setCourseBuilding() {
		String[] buildings = {"North","South","East"};
		courseTester.setBuilding(buildings);
		assertEquals("East", courseTester.getBuilding()[2]);
	}
	@Test
	public void setCourseRoom() {
		String[] rooms = {"101","102","103"};
		courseTester.setRoom(rooms);
		assertEquals("101", courseTester.getRoom()[0]);
	}
	@Test
	public void setCourseDay() {
		String[] days = {"M", "T", "F"};
		courseTester.setDay(days);
		assertEquals("F", courseTester.getDay()[2]);
	}
	@Test
	public void setCourseTime() {
		String[] times = {"8","10","12"};
		courseTester.setTime(times);
		assertEquals("10", courseTester.getTime()[1]);
	}
}

