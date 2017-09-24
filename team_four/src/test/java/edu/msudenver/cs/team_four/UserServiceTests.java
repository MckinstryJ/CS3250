package edu.msudenver.cs.team_four;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.msudenver.cs.team_four.User.User;
import edu.msudenver.cs.team_four.User.UserController;
import edu.msudenver.cs.team_four.User.UserService;

public class UserServiceTests {
	static User testerUser1;
	static User testerUser2;
	static User testerUser3;
	static UserController testerUC;
	static UserService testerUS;
	
	@Test
	public void addUserTest() {
		testerUS = new UserService();
		testerUS.addUser(testerUser1);
		testerUS.addUser(testerUser2);
		testerUS.addUser(testerUser3);
		assertEquals(3, testerUS.getAllUsers().size());
	}
	
	@Test
	public void getUserTest() {
		testerUser1 = new User("Bill", "123456");
		testerUS = new UserService();
		testerUS.addUser(testerUser1);
		assertFalse(testerUS.getUser("123456").toString().isEmpty());
	}
	
	@Test
	public void getUserNameTest() {
		testerUser1 = new User("Bill", "123456");
		testerUS = new UserService();
		testerUS.addUser(testerUser1);
		assertEquals("Bill", testerUS.getUserName("123456"));
	}
	
	@Test
	public void updateUserTest() {
		testerUser1 = new User("Bill", "123456");
		testerUser2 = new User("Shetern", "123456");
		testerUS = new UserService();
		testerUS.addUser(testerUser1);
		testerUS.updateUser("123456", testerUser2);
		assertEquals("Shetern", testerUS.getUserName("123456"));
	}
	
	@Test
	public void deleteUserTest() {
		testerUser1 = new User("Bill", "123456");
		testerUS = new UserService();
		testerUS.addUser(testerUser1);
		testerUS.deleteUser(testerUser1);
		assertTrue(testerUS.getAllUsers().isEmpty());
	}
}