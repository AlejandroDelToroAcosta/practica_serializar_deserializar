package org.ulpgc.example;
import java.io.Serializable;
public class Movie implements Serializable{
    private String title;
    private String director;

    public Movie (String title, String director) {
        this.title = title;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }
}
