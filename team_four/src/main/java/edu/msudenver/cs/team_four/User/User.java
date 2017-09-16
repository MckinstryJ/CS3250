package edu.msudenver.cs.team_four.User;

public class User {

	private String Name;
	private String id;
	
	public User() {
		
	}
	
	
	public User(String name, String id) {
		super();
		Name = name;
		this.id = id;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	
}
