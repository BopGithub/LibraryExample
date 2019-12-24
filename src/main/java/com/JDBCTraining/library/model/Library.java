package com.JDBCTraining.library.model;

import javax.persistence.*;

@Entity
@Table(name = "Libraries")
public class Library {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(name = "location", nullable = false)
    private String Location;

    @Column(name = "manager", nullable = false)
    private String manager;

    @Column(name = "startworkinghours", nullable = false)
    private float startWorkingHours;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public float getStartWorkingHours() {
        return startWorkingHours;
    }

    public void setStartWorkingHours(float startWorkingHours) {
        this.startWorkingHours = startWorkingHours;
    }

    public Library() {
    }

    public Library(String location, String manager, float startWorkingHours) {
        Location = location;
        this.manager = manager;
        this.startWorkingHours = startWorkingHours;
    }
}
