package edu.msudenver.cs.team_four.models;

public class Days {
	
	public String dayOfWeek = null;
	public String startHour = null;
	public String endHour = null;
	
	
	public Days() {
		
	}
	
	public Days(String dayOfWeek, String startHour, String endHour) {
		super();
		this.dayOfWeek = dayOfWeek;
		this.startHour = startHour;
		this.endHour = endHour;
	}
	
	public String getDayOfWeek() {
		return dayOfWeek;
	}
	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	public String getStartHour() {
		return startHour;
	}
	public void setStartHour(String startHour) {
		this.startHour = startHour;
	}
	public String getEndHour() {
		return endHour;
	}
	public void setEndHour(String endHour) {
		this.endHour = endHour;
	}
	
}
