package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

/* Inverse End */

@Entity
public class Student {
    @Id
    private int sId;
    private String name;
    private String address;

    @OneToMany(mappedBy = "student",fetch = FetchType.LAZY)

    private List<Watch> watchList;

    public Student() {
    }

    public Student(int sId, String name, String address, List<Watch> watchList) {
        this.sId = sId;
        this.name = name;
        this.address = address;
        this.watchList = watchList;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Watch> getWatchList() {
        return watchList;
    }

    public void setWatchList(List<Watch> watchList) {
        this.watchList = watchList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sId=" + sId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", watchList=" + watchList +
                '}';
    }
}

