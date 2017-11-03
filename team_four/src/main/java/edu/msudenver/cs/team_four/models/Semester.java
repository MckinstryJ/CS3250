package edu.msudenver.cs.team_four.models;

public class Semester {

	public String startDate = null;
	public String endDate = null;
	public String startMonth = null;
	public String endMonth = null;
	public String Year = null;
	
	public Semester() {
	}
	
	public Semester(String startDate, String endDate, String startMonth, String endMonth, String Year) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.startMonth = startMonth;
		this.endMonth = endMonth;
		this.Year = Year;
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

	public String getStartMonth() {
		return startMonth;
	}

	public void setStartMonth(String startMonth) {
		this.startMonth = startMonth;
	}

	public String getEndMonth() {
		return endMonth;
	}

	public void setEndMonth(String endMonth) {
		this.endMonth = endMonth;
	}
	
	public String getYear() {
		return Year;
	}

	public void setYear(String Year) {
		this.Year = Year;
	}
	
	
	
	
}
