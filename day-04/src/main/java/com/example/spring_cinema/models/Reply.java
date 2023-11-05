package com.example.spring_cinema.models;

public class Reply {

    private String movieState;
    private String message;

    public Reply(String wordState, String message) {
        this.movieState = movieState;
        this.message = message;


    }

    public Reply() {
    }

    public String getMovieState() {
        return movieState;
    }

    public void setMovieState(String movieState) {
        this.movieState = movieState;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
