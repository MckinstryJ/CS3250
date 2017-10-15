package edu.msudenver.cs.team_four;
import static org.junit.Assert.*;

import org.junit.Test;

import edu.msudenver.cs.team_four.models.*;

public class BuildingTest {
	
	static Buildings buildTest1 = new Buildings();
	static Buildings buildTest2 = new Buildings();
	static Buildings buildTest3 = new Buildings();
	
	@Test
	public void setIdTest() {
		buildTest1.setId("1342");
		assertEquals("1342", buildTest1.getId());
	}
	
	@Test
	public void setBuildingName() {
		buildTest2.setBuildingName("Arts");
		assertEquals("Arts", buildTest2.getbuildingName());
	}
	
	@Test
	public void setBuildingAcronym() {
		buildTest2.setAcronym("KNG");
		assertEquals("KNG", buildTest2.getAcronym());
	}
	
	@Test
	public void setBuildingAddress() {
		buildTest3.setAddress("123 Fake St.");
		assertEquals("123 Fake St.", buildTest3.getAddress());
	}
}
