package com.demoAPI_2.demoAPI_2.modal;

public class Movie {
    public String getMovieId() {
        return movieId;
    }

    public Movie(String movieId, String name) {
        this.movieId = movieId;
        this.name = name;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String movieId;
    private String name;

}
