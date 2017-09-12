package org.fundacionjala.coding.oscar.movies;

/**
 * This is the class for movie and the days of rentals.
 */
public class Rental {
    private Movie movie;
    private int daysRented;

    /**
     * This is the constructor class.
     *
     * @param movie      is the class of movie.
     * @param daysRented is the days for rented.
     */
    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    /**
     * This method return the days for rented.
     *
     * @return a integer of days.
     */
    public int getDaysRented() {
        return daysRented;
    }

    /**
     * This method return the name of the movie.
     *
     * @return a string with the name.
     */
    public Movie getMovie() {
        return movie;
    }
}
