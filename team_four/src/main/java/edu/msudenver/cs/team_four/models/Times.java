package edu.msudenver.cs.team_four.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Times {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private int startTime;
    private int duration;
    
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) throws IllegalArgumentException {
        if(startTime > 20 || startTime < 6) {
            throw new IllegalArgumentException("Start Time must be an integer between 6 and 20");
        }
        this.startTime = startTime;
    }

    public int getDuration() {
        return duration;
    }

   
    public void setDuration(int duration) throws IllegalArgumentException {
        if(duration < 1 || duration >3) {
            throw new IllegalArgumentException("Duration must be an integer between 1 and 3");
        }
        this.duration = duration;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == null || !(o instanceof Times)) {
            return false;
        }
        if (this == o) {
            return true;
        }

        Times timeBlock = (Times) o;
        return this.getStartTime() == timeBlock.getStartTime() &&
               this.getDuration()  == timeBlock.getDuration();
    }

    public boolean hasConflict(final Object o) {
        if (o == null || !(o instanceof Times)) {
            return false;
        }
        if (this == o) {
            return true;
        }

        Times timeBlock = (Times) o;
        if(this.getStartTime() == timeBlock.getStartTime()) return true;

        if(this.getStartTime() < timeBlock.getStartTime() && this.getStartTime() + this.duration > timeBlock.getStartTime()) {
            return true;
        }

        if(timeBlock.getStartTime() < this.getStartTime() && timeBlock.getStartTime() + timeBlock.duration > this.getStartTime()) {
            return true;
        }

        return false;
    }
}
