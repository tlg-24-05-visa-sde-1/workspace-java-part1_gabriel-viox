package com.movies.client;

import com.movies.Genre;
import com.movies.Movie;
import com.movies.Rating;

class MovieClient {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Twilight");
        movie1.setReleaseYear(2008);
        movie1.setRevenue(5_280_000_000.0);
        movie1.setRating(Rating.PG_13);
        movie1.setGenre(Genre.ROMANCE);
        System.out.println(movie1); // toString() automatically called

        Movie movie2 = new Movie("Oppenheimer", 2023, 123_000_000.50, Rating.R, Genre.DRAMA);
        System.out.println(movie2);

        Movie movie3 = new Movie("Stoopin", Genre.ANIME);
        System.out.println(movie3);

        Movie movie4 = new Movie("The Room", 2003, 5_100_000.00, Rating.R, Genre.DRAMA);
        System.out.println(movie4);
    }
}