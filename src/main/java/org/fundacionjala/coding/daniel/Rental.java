package org.fundacionjala.coding.daniel;

/**
 * Class Rental.
 */
public class Rental {
    private Movie movie;
    private int daysRented;

    /**
     * @param movie      The movie selected by the customer.
     * @param daysRented The days rented.
     */
    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    /**
     * @return Number of days rented.
     */
    public int getDaysRented() {
        return daysRented;
    }

    /**
     * @return The movie rented.
     */
    public Movie getMovie() {
        return movie;
    }
}
