package org.fundacionjala.coding.oscar.movies;

/**
 * Created by Oz64 on 09/09/2017.
 */
public class NewRelease extends Movie {

    private static final int AMOUNT_FACTOR = 3;

    /**
     * This is the constructor, invoke the super class movie with
     * the title ant the type of movie, 1 for this case of NewRelease.
     *
     * @param title of the movie.
     */
    public NewRelease(String title) {
        super(title);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double getAmount(int daysRented) {
        return daysRented * AMOUNT_FACTOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int calculateFrequentRenterPoints(int daysRented) {
        return daysRented > 1 ? 2 : 1;
    }
}
