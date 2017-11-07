package edu.msudenver.cs.team_four;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.msudenver.cs.team_four.models.Times;

public class Timestest {
	
	Times time = new Times();
	String id = "Cheese";
	int start = 7;
	int start2 = 21;
	int start3 = 5;
	int duration = 2;
	
	@Test
	public void idTest(){
		time.setId(id);
		assertEquals("Cheese" , time.getId());
	}
	
	@Test
	public void startTimePass() {
		time.setStartTime(start);
		assertEquals(7, time.getStartTime());
	}
	@Test (expected = IllegalArgumentException.class)
	public void startTimeFail() {
		time.setStartTime(start2);
		assertEquals(21, time.getStartTime());
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void startTimeFail2() {
		time.setStartTime(start3);
		assertEquals(5, time.getStartTime());
	}
	
	@Test
	public void durationTest() {
		time.setDuration(duration);
		assertEquals(2, time.getDuration());
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void durationFail() {
		int duration2 = 0;
		time.setDuration(duration2);
		assertEquals(0,time.getDuration());
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void durationFail2() {
		int duration2 = 4;
		time.setDuration(duration2);
		assertEquals(4, time.getDuration());
	}
	@Test
	public void equalsTest1() {
		Object o = null;
		assertEquals(false, time.equals(o));
	}
	@Test
	public void equalsTest2() {
		Object o = "Cheese";
		assertEquals(false, time.equals(o));
	}
	@Test
	public void equalsTest3() {
		Object o = time;
		assertEquals(true, time.equals(o));
	}
	
	@Test
	public void equalsTestFinal() {
		Times timeBlock = new Times();
		timeBlock.setDuration(duration);
		timeBlock.setStartTime(start);
		time.setDuration(duration);
		time.setStartTime(start);
		Object o = timeBlock;
		assertEquals(true, time.equals(o));
	}
	@Test
	public void equalsTestFinal2() {
		Times timeBlock = new Times();
		timeBlock.setDuration(3);
		timeBlock.setStartTime(9);
		time.setDuration(duration);
		time.setStartTime(start);
		Object o = timeBlock;
		assertEquals(false, time.equals(o));
	}
	@Test
	public void hasConflictTest() {
		Object o = null;
		assertEquals(false, time.hasConflict(o));
	}
	@Test
	public void hasConflict2() {
		Times timeBlock = new Times();
		timeBlock.setDuration(duration);
		timeBlock.setStartTime(start);
		time.setDuration(duration);
		time.setStartTime(start);
		Object o = timeBlock;
		assertEquals(true, time.hasConflict(o));
	}
	@Test
	public void conflict3() {
		Object o = "Cheese";
		assertEquals(false, time.hasConflict(o));
	}
	@Test
	public void conflict4() {
		Times timeBlock = new Times();
		timeBlock.setDuration(1);
		timeBlock.setStartTime(7);
		time.setDuration(2);
		time.setStartTime(6);
		Object o = timeBlock;
		assertEquals(true, time.hasConflict(o));
	}
	@Test
	public void conflict5() {
		Times timeBlock = new Times();
		timeBlock.setDuration(2);
		timeBlock.setStartTime(10);
		time.setDuration(1);
		time.setStartTime(11);
		Object o = timeBlock;
		assertEquals(true, time.hasConflict(o));
	}
	@Test
	public void conflict6() {
		Times timeBlock = new Times();
		timeBlock.setDuration(1);
		timeBlock.setStartTime(13);
		time.setStartTime(10);
		time.setDuration(2);
		assertEquals(false, time.hasConflict(timeBlock));
	}
}
