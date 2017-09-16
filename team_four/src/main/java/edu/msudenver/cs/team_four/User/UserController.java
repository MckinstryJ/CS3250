package edu.msudenver.cs.team_four.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class UserController {

	@Autowired
	private UserService UserService;
	
	@RequestMapping("/users")
	public List<User> getAllUsers() {
		return UserService.getAllUsers();
	}
	
	@RequestMapping("/users/{id}")
	public User getUser(@PathVariable String id) {
		return UserService.getUser(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/users")
	public void addUser(@RequestBody User user) {
		UserService.addUser(user);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/users{id}")
	public void updateUser(@RequestBody User user , @PathVariable String id) {
		UserService.updateUser(id, user);
	}
		
	@RequestMapping(method=RequestMethod.DELETE, value="/users{id}")
	public void deleteUser(@PathVariable String id) {
		UserService.deleteUser(id);
	}
}
