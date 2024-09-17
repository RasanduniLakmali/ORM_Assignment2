package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


/* Owner's End */

@Entity
public class Watch {

    @Id
    private int wId;
    private String type;
    private String colour;

    @ManyToOne
    @JoinColumn(name = "st_id")
    private Student student;

    public Watch() {
    }

    public Watch(int wId, String type, String colour, Student student) {
        this.wId = wId;
        this.type = type;
        this.colour = colour;
        this.student = student;
    }

    public int getwId() {
        return wId;
    }

    public void setwId(int wId) {
        this.wId = wId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Watch{" +
                "wId=" + wId +
                '}';
    }
}

