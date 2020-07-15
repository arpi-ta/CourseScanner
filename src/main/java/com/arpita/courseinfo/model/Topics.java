package com.arpita.courseinfo.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topics {

    @Id
    private String id;
    private String name;
    private String description;
    private String ratings;

    public Topics(){

    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRatings() {
        return ratings;
    }

    public void setRatings(String ratings) {
        this.ratings = ratings;
    }


}
