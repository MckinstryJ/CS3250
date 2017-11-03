package edu.msudenver.cs.team_four;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.msudenver.cs.team_four.models.Semester;

public class SemesterTests {

	@Test
	public void setStartDateTest() {
		Semester tester = new Semester("10","15","January","May","2018");
		tester.setStartDate("12");
		assertEquals("12",tester.getStartDate());
	}
	
	@Test
	public void getStartDateTest() {
		Semester tester = new Semester("10","15","January","May","2018");
		assertEquals("10",tester.getStartDate());
	}
	
	@Test
	public void setEndDateTest() {
		Semester tester = new Semester("10","15","January","May","2018");
		tester.setEndDate("12");
		assertEquals("12",tester.getEndDate());
	}
	
	@Test
	public void getEndDateTest() {
		Semester tester = new Semester("10","15","January","May","2018");
		assertEquals("15",tester.getEndDate());
	}
	
	@Test
	public void setStartMonthTest() {
		Semester tester = new Semester("10","15","January","May","2018");
		tester.setStartMonth("February");
		assertEquals("February",tester.getStartMonth());
	}
	
	@Test
	public void getStartMonthTest() {
		Semester tester = new Semester("10","15","January","May","2018");
		assertEquals("January",tester.getStartMonth());
	}
	
	@Test
	public void setEndMonthTest() {
		Semester tester = new Semester("10","15","January","May","2018");
		tester.setEndMonth("February");
		assertEquals("February",tester.getEndMonth());
	}
	
	@Test
	public void getEndMonthTest() {
		Semester tester = new Semester("10","15","January","May","2018");
		assertEquals("May",tester.getEndMonth());
	}
	
	@Test
	public void setYearTest() {
		Semester tester = new Semester("10","15","January","May","2018");
		tester.setYear("2017");
		assertEquals("2017",tester.getYear());
	}
	
	@Test
	public void getYearTest() {
		Semester tester = new Semester("10","15","January","May","2018");
		assertEquals("2018",tester.getYear());
	}
	
}
