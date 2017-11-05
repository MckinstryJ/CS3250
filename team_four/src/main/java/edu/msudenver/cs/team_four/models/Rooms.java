package edu.msudenver.cs.team_four.models;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rooms {
		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private String id;

	    @Column
	    private int roomNumber;
	    private int capacity;
	    private Buildings building;
	    public Rooms() {
	        this.roomNumber = 0;
	    }

	    public Rooms(final int roomNumber, final int roomCapacity, final Buildings building) {

	        if (roomNumber < 0) {
	            throw new IllegalArgumentException("Stay positive");
	        } else {
	            this.roomNumber = roomNumber;
	        }

	        if (roomCapacity < 0) {
	            throw new IllegalArgumentException("Stay positive");
	        } else {
	            capacity = roomCapacity;
	        }

	        if (building == null) {
	            throw new IllegalArgumentException("Building cannot be null");
	        } else {
	            this.building = building;
	        }
	    }

	    public void setId(final String id) {
	        this.id = id;
	    }

	    public String getId() {
	        return id;
	    }

	    public void setRoomNumber(final int roomNumber)
	            throws IllegalArgumentException {
	        if (roomNumber < 0) {
	            throw new IllegalArgumentException("Stay positive");
	        } else {
	            this.roomNumber = roomNumber;
	        }
	    }

	    
	    public void setRoomCapacity(final int capacity)
	            throws IllegalArgumentException {
	        if (capacity < 0) {
	            throw new IllegalArgumentException("Stay positive");
	        } else {
	            this.capacity = capacity;
	        }
	    }

	   
	    public void setBuilding(final Buildings building)
	            throws IllegalArgumentException {
	        if (building == null) {
	            throw new IllegalArgumentException("Building cannot be null");
	        } else {
	            this.building = building;
	        }
	    }

	    
	    public int getRoomNumber() {
	        return roomNumber;
	    }

	   
	    public int getRoomCapacity() {
	        return capacity;
	    }

	    public Buildings getBuilding() {
	        return building;
	    }

	    @Override
	    public String toString() {
	        return "Id: " + id + ", Room Number: " + roomNumber;
	    }
	}
