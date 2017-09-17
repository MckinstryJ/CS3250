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
	public void userName() {
		System.out.println(testerA.getName());
		
	}
	@Test
	public void changeUserName() {
		tester.setName("Frank");
		System.out.println(tester.getName());
	}
	@Test
	public void idTest() {
		System.out.println( tester.getId());
	}
	@Test
	public void changeIdTest() {
		tester.setId("67890");
		System.out.println( tester.getId());
	}
	//Service Tests
	@Test
	public void addUserTest() {
		//Cannot add to the User Service List due to the Arrays.asList(); producing a fixed array
		/**tester3.addUser(tester);
		tester3.addUser(testerA);
		tester3.addUser(testerB);
		*/
		System.out.println(tester3.getAllUsers());
	}
	@Test	
	public void updateUserTest(){
		tester3.updateUser("12345",testerA);
		System.out.println( tester3.getAllUsers());
	}
	@Test
	public void deleteUserTest(){
		tester3.deleteUser("900689234");
		System.out.println(tester3.getAllUsers());
		
	}
	@Test
	public void getUserTest() {
		System.out.println(tester3.getUser("ID3"));
	}

}
