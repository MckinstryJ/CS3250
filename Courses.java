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
	
	public Courses(String courseName, String department, String coursenumber, String credits, String description, 
					String learningObjectives, String prereqs, String coreqs) {
						this.courseName = courseName;
						this.department = department;
						this.coursenumber = coursenumber;
						this.credits = credits;
						this.description = description;
						this.learningObjectives = learningObjectives;
						this.prereqs = prereqs;
						this.coreqs = coreqs;
					}
	public Courses() {
		// TODO Auto-generated constructor stub
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
}
