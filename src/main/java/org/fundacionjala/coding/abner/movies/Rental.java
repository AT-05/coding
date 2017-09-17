package org.fundacionjala.coding.abner.movies;

/**
 * This class give the Movies rented.
 * Created by Abner on 9/12/2017.
 */
public class Rental {
    /**
     * This is var of de class.
     */
    private Movie movie;
    private int daysRented;

    /**
     * This constructor of the class whit.
     *
     * @param movie      The new movie for crated.
     * @param daysRented Is is day of rented.
     */
    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    /**
     * This is geter the movie.
     *
     * @return the movie.
     */
    public Movie getMovie() {
        return movie;
    }

    /**
     * This function calculation of the amount.
     *
     * @return the value of calculation.
     */
    public double calculateAmount() {
        return movie.calculateAmount(daysRented);
    }

    /**
     * This function calculation of the point.
     *
     * @return the value of calculation.
     */
    public int calculateFrequentRenterPoints() {
        return movie.calculateFrequentRenterPoints(daysRented);
    }

}
