package edu.msudenver.cs.team_four;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.msudenver.cs.team_four.models.*;

public class ProfessorTest {

	
	static Professor profTest = new Professor("5678" , "Billy","Mays");
	
	@Test
	public void idTest() {
		profTest.setId("1234");
		assertEquals("1234", profTest.getId());
	}
	
	@Test
	public void firstNameTest() {
		profTest.setFirstName("Jim");
		assertEquals("Jim", profTest.getFirstName());
	}
	
	@Test
	public void lastNameTest() {
		profTest.setLastName("Rage");
		assertEquals("Rage", profTest.getLastName());
	}
}
