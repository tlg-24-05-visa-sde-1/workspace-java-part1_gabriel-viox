package com.movies;

public class Movie {
    // instance variable
    private String title;
    private Integer releaseYear;
    private Double revenue;
    private Rating rating;
    private Genre genre;

    // constructors - get called when client says "new"
    // you get a free one until you start building them
    public Movie(String title){
        setTitle(title);
    }

    public Movie(String title, Genre genre){
        setTitle(title);
        setGenre(genre);
    }
    // one method can call another
    public Movie(String title, Integer releaseYear, Double revenue) {
        // delegate to the setters for any data validation/conversion
        this(title);                    //delegate to ctor above which handle title
        setReleaseYear(releaseYear);    //delegate to setters for any validation/conversion
        setRevenue(revenue);
    }

    public Movie(String title, Integer releaseYear, Double revenue, Rating rating, Genre genre) {
        this(title, releaseYear, revenue); //delegate to 3 argument constructor above.
        setRating(rating);
        setGenre(genre);
    }
    // autoboxing only works with corresponding types
    // "action" method play(), stop(), rewind(), fastForward(), pause()

    // "accessor" methods getters() setters()
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Double getRevenue() {
        return revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    public Rating getRating() {
        return rating;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }


    //ToDO: if revenue is null, use %s for that, otherwise use %,.2f
    public String toString() {
        return String.format("com.movies.Movie : title=%s, releaseYear=%s, rating=%s, genre=%s, revenue=%,.2f",
               getTitle(), getReleaseYear(), getRating(), getGenre(), getRevenue());
//        return "com.movies.Movie: " + getTitle() + ", Release Year: " + getReleaseYear() + ", Revenue: " + getRevenue()
//                + ", Rating: " + getRating() + ", com.movies.Genre: " + getGenre();
    }
}