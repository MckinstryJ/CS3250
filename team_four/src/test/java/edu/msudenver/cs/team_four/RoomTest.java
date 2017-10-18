package edu.msudenver.cs.team_four;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.msudenver.cs.team_four.models.Rooms;

public class RoomTest {
	private Rooms roomTest;
	
	@Before
	public void setUp() {
		roomTest = new Rooms();
	}
	
	@Test
	public void setandgetSize() {
		roomTest.setRoomSize("25");
		assertEquals("25", roomTest.getRoomSize());
	}
	
	@Test 
	public void setandgetNumber() {
		roomTest.setRoomNumber("AES200");
		assertEquals("AES200", roomTest.getRoomNumber());
	}
	
	@Test
	public void getIdTest() {
		assertEquals(null,roomTest.getId());
	}
}
