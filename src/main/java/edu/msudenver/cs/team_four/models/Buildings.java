package edu.msudenver.cs.team_four.models;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Buildings {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id = 123456789;

    private String buildingName = "DEFAULT";
    private int numberOfRooms = 1;

    @OneToOne
    @JoinColumn(name = "room_id")
    private Rooms rooms;

    public Buildings() {

    }

    public Buildings(String buildingName) {

        setBuildingName(buildingName);
    }

    public Buildings(String buildingName, int numberOfRooms) {

        this.buildingName = buildingName;
        this.numberOfRooms = numberOfRooms;
    }

    public Buildings(String buildingName, int numberOfRooms, long buildingId) {

        setBuildingName(buildingName);
        setNumberOfRooms(numberOfRooms);
        setId(buildingId);
    }

    public String getBuildingName() {

        return buildingName;
    }

    public void setBuildingName(String buildingName) {

        this.buildingName = buildingName;
    }

    public int getNumberOfRooms() {

        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {

        this.numberOfRooms = numberOfRooms;
    }

    public long getId() {

        return id;
    }

    public void setId(long id) {

        this.id = id;
    }

    public Rooms getRoom() {

        return rooms;
    }

    public void setRoom(int roomNumber, int numberOfSeats) {

    }
}
