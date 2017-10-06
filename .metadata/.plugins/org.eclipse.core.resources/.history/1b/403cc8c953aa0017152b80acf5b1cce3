package edu.msudenver.cs.team_four;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.msudenver.cs.team_four.User.*;

import java.util.*;

public class StudentTest {
	
	static Student tester;
	static Student testerA;
	static Student testerB;
	static StudentController tester2;
	static StudentService tester3;
	
	@BeforeClass
	public static void testSetup() {
		tester = new Student("Alfred", "12345");
		testerA = new Student("Bruce", "900689234");
		testerB = new Student("Richard", "900548322");
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
		testerA = new Student("Bruce", "12345");
		assertEquals("Bruce", testerA.getName());
	}
	@Test
	//Tests the Studentname change method
	public void changeStudentName() {
		tester = new Student("Bill", "12345");
		tester.setName("Frank");
		assertEquals("Frank",tester.getName());
	}
	@Test
	//tests the Studentname change method and is supposed to fail
	public void changeStudentNameFail() {
		tester = new Student("Bill", "123555");
		tester.setName("Steve");
		assertNotEquals("Frank",tester.getName());
	}
	@Test
	//Testing fetch id
	public void idTest() {
		tester = new Student("Bob", "1234456");
		assertEquals("1234456", tester.getId());
	}
	@Test
	//testing change id
	public void changeIdTest() {
		tester = new Student("Bob", "111111");
		tester.setId("67890");
		assertEquals("67890", tester.getId());
	}
}

