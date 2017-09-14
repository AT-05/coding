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
     * This method return the name of the movie.
     *
     * @return a string with the name.
     */
    public Movie getMovie() {
        return movie;
    }

    /**
     * This method calculate the amount for the movie.
     *
     * @return the amount as a double.
     */
    public double calculateAmount() {
        return movie.getAmount(daysRented);
    }

    /**
     * This method calculate frequent renter points for the movie.
     *
     * @return the points as a integer.
     */
    public int calculateFrequentRenterPoints() {
        return movie.calculateFrequentRenterPoints(daysRented);
    }
}
