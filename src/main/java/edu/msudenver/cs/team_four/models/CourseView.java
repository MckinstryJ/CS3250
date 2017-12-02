package edu.msudenver.cs.team_four.models;

public class CourseView{
	private String[] semester = {"Fall", "Spring", "Summer"}; 
	private String[] dates = {"Aug 15th - Dec 15th", "Jan 15th - May 15th", "June 5th - Aug 5th"}; 
	private String[] building = {"North", "East", "South", "West", "Science", "Plaze"}; 
	private String[] room = {"100","110","120","130","140","150","160","170","180","190"}; // 010 to 590
	public String[] day = {"MW", "TTh", "F"}; 
	private String[] time = {"8am", "10am", "12pm", "2pm", "4pm", "6pm", "8pm"}; 
	
	public String[] getSemester() {
		return semester;
	}

	public void setSemester(String[] semester) {
		this.semester = semester;
	}

	public String[] getDates() {
		return dates;
	}

	public void setDates(String[] dates) {
		this.dates = dates;
	}

	public String[] getBuilding() {
		return building;
	}

	public void setBuilding(String[] building) {
		this.building = building;
	}

	public String[] getRoom() {
		return room;
	}

	public void setRoom(String[] room) {
		this.room = room;
	}

	public String[] getDay() {
		return day;
	}

	public void setDay(String[] day) {
		this.day = day;
	}

	public String[] getTime() {
		return time;
	}

	public void setTime(String[] time) {
		this.time = time;
	}
}
