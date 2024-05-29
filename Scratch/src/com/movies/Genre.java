package com.movies;

public enum Genre {
    ROMANCE("Romance <3"),
    COMEDY("Comedy"),
    WESTERN("Howdy"),
    DRAMA("Drama..."),
    SCI_FI("Sci-fi"),
    ACTION("Action"),
    HORROR("Horror"),
    ANIME("^(=>.<=)^ Anime");

    private String display;

    Genre(String display){
        this.display = display;
    }
    public String getDisplay() {
        return display;
    }
    public String toString() {
        return display;
    }
}

