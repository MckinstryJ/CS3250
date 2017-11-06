package edu.msudenver.cs.team_four.models;

public class Schedule {
	
	private String year;
	private Semester[] semester = new Semester[3];
	
	public Schedule(String y) {
		year = y;
	}
	
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public Semester[] getSemester() {
		return semester;
	}
}
