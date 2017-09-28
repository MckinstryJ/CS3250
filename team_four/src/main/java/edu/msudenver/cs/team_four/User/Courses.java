package edu.msudenver.cs.team_four.User;

public class Courses {
	public String courseName;
	public String department;
	public int coursenumber;
	public int credits;
	public String description;
	public String learningObjectives;
	public String prereqs;
	public String coreqs; 
	
	public Courses(String courseName, String department, int coursenumber, int credits, String description, 
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
	public String getCourseName() {
		return this.courseName;
	}
	
	public void changeCourseName(String newCourseName) {
		this.courseName = newCourseName;
	}
	
	public String changeDepartment(String newDept) {
		this.department = newDept;
		return this.department;
	}
	
	public int changeCRN(int newCrn) {
		this.coursenumber = newCrn;
		return this.coursenumber;
	}
	
	public int changeCredits(int newCreds) {
		this.credits = newCreds;
		return this.credits;
	}
	
	public String changeDescription(String newDescrip) {
		this.description = newDescrip;
		return this.description;
	}
	
	public String changeLearningObj(String newLearn) {
		this.learningObjectives = newLearn;
		return this.learningObjectives;
	}
	
	public String changePrereqs(String newPrereq) {
		this.prereqs = newPrereq;
		return this.prereqs;
	}
	
	public String changeCoreq(String newCoreq) {
		this.coreqs = newCoreq;
		return this.coreqs;
	}
	public String getDepartment() {
		return this.department;
	}
	
	public int getCRN() {
		return this.coursenumber;
	}
	
	public int getCredits() {
		return this.credits;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public String getLearningObj() {
		return this.learningObjectives;
	}
	
	public String getPrereqs() {
		return this.prereqs;
	}
	
	public String getCoreq() {
		return this.coreqs;
	}
}