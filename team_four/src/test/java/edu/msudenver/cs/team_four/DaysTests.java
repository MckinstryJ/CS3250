package edu.msudenver.cs.team_four;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.msudenver.cs.team_four.models.*;

public class DaysTests {
	
	@Test
	public void setDayOfWeekTest() {
		Days tester = new Days("Monday","1400","1500");
		tester.setDayOfWeek("Tuesday");
		assertEquals("Tuesday",tester.getDayOfWeek());
	}
	
	@Test
	public void getDayOfWeekTest() {
		Days tester = new Days("Monday","1400","1500");
		assertEquals("Monday",tester.getDayOfWeek());
	}
	
	@Test
	public void setStartHourTest() {
		Days tester = new Days("Monday","1400","1500");
		tester.setStartHour("1300");
		assertEquals("1300",tester.getStartHour());
	}
	
	@Test
	public void getStartHourTest() {
		Days tester = new Days("Monday","1400","1500");
		assertEquals("1400",tester.getStartHour());
	}
	
	@Test
	public void setEndHourTest() {
		Days tester = new Days("Monday","1400","1500");
		tester.setStartHour("1600");
		assertEquals("1600",tester.getEndHour());
	}
	
	@Test
	public void getEndHourTest() {
		Days tester = new Days("Monday","1400","1500");
		assertEquals("1500",tester.getEndHour());
	}
	
}
