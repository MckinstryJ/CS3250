package edu.msudenver.cs.team_four;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.msudenver.cs.team_four.User.*;

import java.util.*;

public class UserTest {
	
	static User tester;
	static User testerA;
	static User testerB;
	static UserController tester2;
	static UserService tester3;
	
	@BeforeClass
	public static void testSetup() {
		tester = new User("Alfred", "12345");
		testerA = new User("Bruce", "900689234");
		testerB = new User("Richard", "900548322");
		tester2 = new UserController();
		tester3 = new UserService();
	}
	
	
	@AfterClass
	public static void testCleanup() {
		tester = null;
		testerA = null;
		testerB = null;
		tester2 = null;
		tester3 = null;
	}
	//Tests for User Class
	@Test
	public void userConstructorTest() {
		tester = new User();
	}
	
	@Test
	//Tests the username fetch method and is supposed to fail.
	public void userNameFail() {
		assertNotEquals("Result", testerA.getName());
	}
	@Test
	//Tests the username fetch method
	public void userNamePass() {
		testerA = new User("Bruce", "12345");
		assertEquals("Bruce", testerA.getName());
	}
	@Test
	//Tests the username change method
	public void changeUserName() {
		tester = new User("Bill", "12345");
		tester.setName("Frank");
		assertEquals("Frank",tester.getName());
	}
	@Test
	//tests the username change method and is supposed to fail
	public void changeUserNameFail() {
		tester = new User("Bill", "123555");
		tester.setName("Steve");
		assertNotEquals("Frank",tester.getName());
	}
	@Test
	//Testing fetch id
	public void idTest() {
		tester = new User("Bob", "1234456");
		assertEquals("1234456", tester.getId());
	}
	@Test
	//testing change id
	public void changeIdTest() {
		tester = new User("Bob", "111111");
		tester.setId("67890");
		assertEquals("67890", tester.getId());
	}
}

