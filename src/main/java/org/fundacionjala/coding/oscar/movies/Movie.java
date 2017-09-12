package org.fundacionjala.coding.oscar.movies;

/**
 * The class for represent a movie.
 */
public abstract class Movie {
    private String title;
    private int priceCode;

    /**
     * This is a constructor.
     *
     * @param title     of the movie.
     * @param priceCode the price code of the movie.
     */
    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    /**
     * This method return the price code of the movie.
     *
     * @return a price code as an integer.
     */
    public int getPriceCode() {
        return priceCode;
    }

    /**
     * This method return the title of the movie.
     *
     * @return the title as a string.
     */
    public String getTitle() {
        return title;
    }

    /**
     * This is a abstract method for get amount.
     *
     * @param daysRented the days for rented a movie.
     * @return the amount as a double.
     */
    public abstract double getAmount(int daysRented);
}
