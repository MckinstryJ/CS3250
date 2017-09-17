package edu.msudenver.cs.team_four.UserTests;

import static org.junit.Assert.assertEquals;

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
	//Tests the username fetch method and is supposed to fail.
	public void userNameFail() {
		assertNotEquals("Result", "Steve", testerA.getName());
		
	}
	@Test
	//Tests the username fetch method
	public void userNamePass() {
		assertEquals("Result", "Bruce", testerA.getName());
		
	}
	@Test
	//Tests the username change method
	public void changeUserName() {
		tester.setName("Frank");
		assertEquals("Result","Frank",tester.getName());
	}
	@Test
	//tests the username change method and is supposed to fail
	public void changeUserNameFail() {
		tester.setName("Steve");
		assertNotEquals("Result","Frank",tester.getName());
	}
	@Test
	//Testing fetch id
	public void idTest() {
		assertEquals("Result", "12345", tester.getId());
	}
	@Test
	//testing change id
	public void changeIdTest() {
		tester.setId("67890");
		assertEquals("Result","67890", tester.getId());
	}
	//Service Tests
	@Test
	public void addUserTest() {
		//Cannot add to the User Service List due to the Arrays.asList(); producing a fixed array. Needs to be fixed
		//Or we will only ever have three users using the product.
		/**tester3.addUser(tester);
		tester3.addUser(testerA);
		tester3.addUser(testerB);
		*/
		System.out.println(tester3.getAllUsers());
	}
	@Test	
	public void updateUserTest(){
		tester3.updateUser("12345",testerA);
		assertEquals("Result", "testerA", tester3.getUser("ID1"));
	}
	/**@Test
	//Array does not allow deletion of users.
		public void deleteUserTest(){
		tester3.deleteUser("ID2");
		assertEquals("Result", null,tester3.getUser("ID2"));
		
	}*/
	@Test
	//This test is returning the user's location instead of the user name.
	public void getUserTest() {
		assertEquals("Result","Student3",tester3.getUser("ID3"));
	}

}

