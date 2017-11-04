package edu.msudenver.cs.team_four.models;

import javax.persistence.*;
public class Semester {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    private String semesterName;
    private String startMonth;
    private int startDay;
    private String endMonth;
    private int endDay;

    @OneToOne
    @JoinColumn(name = "section_id")
    private Section section;

    public Semester() {
    	this.section = null;
    	this.id = Long.valueOf(0);
    	this.semesterName = "TBD";
    	this.startMonth = "TBD";
    	this.startDay = 0;
    	this.endMonth = "TBD";
    	this.endDay = 0;
    }

    public Semester(Section section) {
    	this.section = section;
    	this.id = Long.valueOf(0);
    this.semesterName = "TBD";
    this.startMonth = "TBD";
    	this.startDay = 0;
    	this.endMonth = "TBD";
    	this.endDay = 0;
    }
    
    public Semester(Section section, String semesterName, String startMonth, int startDay, String endMonth, int endDay) {
    	this.section = section;
    	this.id = Long.valueOf(0);
    this.semesterName = semesterName;
    this.startMonth = startMonth;
    	this.startDay = startDay;
    	this.endMonth = endMonth;
    	this.endDay = endDay;
    }

    public Semester(Section section, Long id, String semesterName, String startMonth, int startDay, String endMonth, int endDay) {
    	this.section = section;
    	this.id = Long.valueOf(0);
    this.semesterName = semesterName;
    this.startMonth = startMonth;
    	this.startDay = startDay;
    	this.endMonth = endMonth;
    	this.endDay = endDay;
    }

    public Long getId() {
    	return id;
    }

    public void setId(Long id) {
    	this.id = id;
    }

    public String getSemesterName() {
        return semesterName;
    }

    public void setSemesterName(String semesterName) {
        this.semesterName = semesterName;
    }

    public String getStartMonth() {
        return startMonth;
    }

    public void setStartMonth(String startMonth) {
        this.startMonth = startMonth;
    }

    public int getStartDay() {
        return startDay;
    }

    public void setStartDay(int startDay) {
        this.startDay = startDay;
    }

    public String getEndMonth() {
        return endMonth;
    }

    public void setEndMonth(String endMonth) {
        this.endMonth = endMonth;
    }

    public int getEndDay() {
        return endDay;
    }

    public void setEndDay(int endDay) {
        this.endDay = endDay;
    }
}