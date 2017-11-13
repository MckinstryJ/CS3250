package edu.msudenver.cs.team_four.models;

import javax.persistence.*;
import javax.persistence.OneToOne;
public class Semester {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private int startDate;
	private int endDate;
	private String startMonth = null;
	private String endMonth = null;
	
    @OneToOne
    @JoinColumn(name = "section_id")
    private Section section;

    public Semester() {
    	this.section = null;
    	this.id = Long.valueOf(0);
    	this.startMonth = "TBD";
    	this.startDate = 0;
    	this.endMonth = "TBD";
    	this.endDate = 0;
    }

    public Semester(Section section) {
    	this.section = section;
    	this.id = Long.valueOf(0);
	this.startMonth = "TBD";
    	this.startDate = 0;
    	this.endMonth = "TBD";
    	this.endDate = 0;
    }
    public Semester(int startDate, int endDate, String startMonth, String endMonth, String Year) 
    {
	super();
	this.id = Long.valueOf(0);
	this.startDate = 0;
	this.endDate = 0;
	this.startMonth = startMonth;
	this.endMonth = endMonth;
	this.Year = Year;
 
    }

    public Long getId() {
    	return id;
    }

    public void setId(Long id) {
    	this.id = id;
    }
	
    public String getStartMonth() {
        return startMonth;
    }
	
    public void setStartMonth(String startMonth) {
        this.startMonth = startMonth;
    }

    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDay = startDate;
    }

    public String getEndMonth() {
        return endMonth;
    }

    public void setEndMonth(String endMonth) {
        this.endMonth = endMonth;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }
	
    public String getYear() {
	    return Year;
    }
	
    public void setYear(String Year) {
	    this.Year = Year;
    }
}
