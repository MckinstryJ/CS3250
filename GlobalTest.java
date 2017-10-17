package edu.msudenver.cs.team_four;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.msudenver.cs.team_four.models.Global;

public class GlobalTest {

	@Test
	public void allLevelTest() {
		Global g = new Global();
		assertEquals("Freshman", g.creditHours(12));
		assertEquals("Sophomore", g.creditHours(35));
		assertEquals("Junior", g.creditHours(66));
		assertEquals("Senior", g.creditHours(100));
	}

}
