package org.fundacionjala.coding.oscar.movies;

/**
 * The class for represent a movie.
 */
public abstract class Movie {
    private String title;

    /**
     * This is a constructor.
     *
     * @param title of the movie.
     */
    public Movie(String title) {
        this.title = title;
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

    /**
     * This is a abstract method for calculate frequent renter points.
     *
     * @param daysRented the days for rented a movie.
     * @return the points as a integer.
     */
    public abstract int calculateFrequentRenterPoints(int daysRented);
}
