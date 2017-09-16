package edu.msudenver.cs.team_four.User;

import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	private List<User> users= Arrays.asList(
			new User("Student1", "ID1"),
			new User("Student2", "ID2"),
			new User("Student3", "ID3")
			);
	
	public List<User> getAllUsers() {
		return users;
	}
	
	public User getUser(String id) {
		return users.stream().filter(u -> u.getId().equals(id)).findFirst().get();
	}
	
	public void addUser(User user) {
		users.add(user);
	}
	
	public void updateUser(String id, User user) {
		for (int i = 0; i < users.size(); i++) {
			User u = users.get(i);
			if (u.getId().equals(id)) {
				users.set(i, user);
				return;
			}
		}
	}
	
	public void deleteUser(String id) {
		users.removeIf(u -> u.getId().equals(id));
	}
}