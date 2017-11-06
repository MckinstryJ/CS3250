package edu.msudenver.cs.team_four;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.msudenver.cs.team_four.models.Schedule;

public class ScheduleTest {

	@Test
	public void basicTests() {
		Schedule s = new Schedule("2017");
		assertEquals("2017", s.getYear());
		s.setYear("2018");
		assertEquals("2018", s.getYear());
		assertEquals(3, s.getSemester().length);
	}
}
