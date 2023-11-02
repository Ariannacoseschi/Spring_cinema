package com.example.spring_cinema.models;

import jakarta.persistence.*;

@Table(name = "Movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "ID")
    private String ID;
    @Column(name = "title")
    private String title;
    @Column(name = "rating")
    private int rating;
    @Column(name = "duration")
    private String duration ;



    public Movie(String ID, String title,String duration){
        this.ID = ID;
        this.title = title;
        this.rating = 0;
        this.duration = duration;

    }

    public Movie() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
