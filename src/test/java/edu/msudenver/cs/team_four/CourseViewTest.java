package edu.msudenver.cs.team_four;
import edu.msudenver.cs.team_four.models.*;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CourseViewTest {
	static CourseView courseTester = new CourseView();
	
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
