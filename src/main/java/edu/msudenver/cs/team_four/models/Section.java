package edu.msudenver.cs.team_four.models;

import javax.persistence.*;
@Entity
public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int sectionNumber = 0;
    private int roomNumber;
    private String time;

    @OneToOne
    @JoinColumn(name = "professor_id")
    private Professor professor;

    @OneToOne
    @JoinColumn(name = "course_courseId")
    private Courses course;

    @OneToOne
    @JoinColumn(name = "building_id")
    private Buildings building;

    public Section(Courses course,
    		       int sectionNumber,
    		       Professor professor,
    		       Buildings building,
                   int roomNumber,
                   String time) {
        this.course = course;
        this.sectionNumber = sectionNumber;
        this.professor = professor;
        this.building = building;
        this.roomNumber = roomNumber;
    }
    
    protected Section() {}

    public Buildings getBuilding() {
        return building;
    }

    public void setBuilding(Buildings building) {
        this.building = building;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Courses getCourse() {
        return course;
    }

    public void setCourse(Courses course) {
        this.course = course;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    public int getSectionNumber() {
        return sectionNumber;
    }
    
    public void setSectionNumber(int sectionNumber) {
        this.sectionNumber = sectionNumber;
    }
}