/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movietask2;

/**
 *
 * @author Zahra
 */

    public class Movie {
    private static int movieCount = 0;
    private int movieId;
    private String description;
    private int duration;

    public Movie(String description, int duration) {
        this.movieId = generateMovieId();
        this.description = description;
        this.duration = duration;
    }

    private static int generateMovieId() {
        return ++movieCount;
    }

    public int getMovieId() {
        return movieId;
    }

    public String getDescription() {
        return description;
    }

    public int getDuration() {
        return duration;
    }
}


