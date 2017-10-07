package edu.msudenver.cs.team_four;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.msudenver.cs.team_four.models.Courses;

public class CoursesTest {

	@Test
	public void courseSetUpTest() {
		Courses course = new Courses("","",000,0,"","","","");
	}
	
	@Test
	public void getAndChangeCourseInfoTest() {
		Courses course = new Courses("", "", 0, 0, "", "", "", "");
		course.changeCourseName("Defense Against the Dark Arts 101");
		course.changeDepartment("Defense");
		course.changeCRN(535);
		course.changeCredits(3);
		course.changeDescription("Protection Spells");
		course.changeLearningObj("Be able to protect yourself against Tom Riddle");
		course.changePrereqs("Tom Riddle 101");
		course.changeCoreq("Tom Riddle 201");
		
		assertEquals("Defense Against the Dark Arts 101", course.getCourseName());
		assertEquals("Defense", course.getDepartment());
		assertEquals(535, course.getCRN());
		assertEquals(3, course.getCredits());
		assertEquals("Protection Spells", course.getDescription());
		assertEquals("Be able to protect yourself against Tom Riddle", course.getLearningObj());
		assertEquals("Tom Riddle 101", course.getPrereqs());
		assertEquals("Tom Riddle 201", course.getCoreq());
	}

}
