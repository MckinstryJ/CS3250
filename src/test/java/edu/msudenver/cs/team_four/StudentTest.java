package edu.msudenver.cs.team_four;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.msudenver.cs.team_four.models.*;

import java.util.*;

public class StudentTest {
	
	static Student tester;
	static Student testerA;
	static Student testerB;
	static StudentController tester2;
	static StudentService tester3;
	
	@BeforeClass
	public static void testSetup() {
		tester = new Student("12345","Alfred","lastName");
		testerA = new Student("900689234","Bruce","lastName");
		testerB = new Student("900548322","Richard","lastName");
		tester2 = new StudentController();
		tester3 = new StudentService();
	}
	
	
	@AfterClass
	public static void testCleanup() {
		tester = null;
		testerA = null;
		testerB = null;
		tester2 = null;
		tester3 = null;
	}
	//Tests for Student Class
	@Test
	public void StudentConstructorTest() {
		tester = new Student();
	}
	
	@Test
	//Tests the Studentname fetch method and is supposed to fail.
	public void StudentNameFail() {
		assertNotEquals("Result", testerA.getName());
	}
	@Test
	//Tests the Studentname fetch method
	public void StudentNamePass() {
		testerA = new Student("12345","Bruce","lastName");
		assertEquals("Bruce lastName", testerA.getName());
	}
	@Test
	//Tests the Studentname change method
	public void changeStudentFirstName() {
		tester = new Student("12345","Bill","lastName");
		tester.setFirstName("Frank");
		assertEquals("Frank",tester.getFirstName());
	}
	@Test
	//tests the Studentname change method and is supposed to fail
	public void changeStudentFirstNameFail() {
		tester = new Student("12345","Bill","lastName");
		tester.setFirstName("Steve");
		assertNotEquals("Frank",tester.getFirstName());
	}
	
	@Test
	//Tests the Studentname change method
	public void changeStudentLastName() {
		tester = new Student("12345","Bill","lastName");
		tester.setLastName("otherName");
		assertEquals("otherName",tester.getLastName());
	}
	
	@Test
	//tests the Studentname change method and is supposed to fail
	public void changeStudentLastNameFail() {
		tester = new Student("12345","Bill","lastName");
		tester.setLastName("otherName");
		assertNotEquals("Frank",tester.getLastName());
	}
	
	@Test
	//Testing fetch id
	public void idTest() {
		tester = new Student("1234456","Bob","lastName");
		assertEquals("1234456", tester.getId());
	}
	@Test
	//testing change id
	public void changeIdTest() {
		tester = new Student("1234456","Bob","lastName");
		tester.setId("67890");
		assertEquals("67890", tester.getId());
	}
}

