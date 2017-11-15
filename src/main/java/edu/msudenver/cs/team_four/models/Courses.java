package edu.msudenver.cs.team_four.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Courses {
	
	@Id
	public String coursenumber;
	public String courseName;
	public String prereqs;
	public String coreqs; 
	public String department;
	public String description;
	public String learningObjectives;
	public String credits;
	private String semester; //Fall, Spring, Summer
	private String startDate; //Fall - Aug 15th, Spring - Jan 15th, Summer - June 5th
	private String endDate; //Fall - Dec 15th, Spring - May 15th, Summer - Aug 5th
	private String building; //North, East, South, West, Science, Plaza
	private String room; // 010 to 590
	private String day; //MW, TTh, F
	private String time; //8am to 8pm at 2 hour increments
	
	public Courses() {
		
	}
	
	public Courses(String courseName, String department, String coursenumber, String credits, String description, 
					String learningObjectives, String prereqs, String coreqs, String semester, String startDate, 
					String endDate, String building, String room, String day, String time) {
						this.courseName = courseName;
						this.department = department;
						this.coursenumber = coursenumber;
						this.credits = credits;
						this.description = description;
						this.learningObjectives = learningObjectives;
						this.prereqs = prereqs;
						this.coreqs = coreqs;
						this.semester = semester;
						this.startDate = startDate;
						this.endDate = endDate;
						this.building = building;
						this.room = room;
						this.day = day;
						this.time = time;
					}
	public String getCoursenumber() {
		return coursenumber;
	}
	public void setCoursenumber(String coursenumber) {
		this.coursenumber = coursenumber;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getPrereqs() {
		return prereqs;
	}
	public void setPrereqs(String prereqs) {
		this.prereqs = prereqs;
	}
	public String getCoreqs() {
		return coreqs;
	}
	public void setCoreqs(String coreqs) {
		this.coreqs = coreqs;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLearningObjectives() {
		return learningObjectives;
	}
	public void setLearningObjectives(String learningObjectives) {
		this.learningObjectives = learningObjectives;
	}
	public String getCredits() {
		return credits;
	}
	public void setCredits(String credits) {
		this.credits = credits;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
}
