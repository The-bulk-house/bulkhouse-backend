package com.example.bulkhousebackend.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Workout {

    @Id
    private int id;
    private String name;
    private String description;
    private String image;

    public Workout(){}

    public Workout(Integer id, String name, String description, String image) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.image = image;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public void setName(String name) {
        this.name = name;
    }
}
