package org.fundacionjala.coding.oscar.movies;

/**
 * Created by Oz64 on 09/09/2017.
 */
public class Regular extends Movie {

    private static final int AMOUNT_FACTOR = 2;

    private static final int MAX_DAYS = 2;

    private static final double AMOUNT = 1.5;

    /**
     * This is the constructor, invoke the super class movie with
     * the title ant the type of movie, 0 for this case of regular.
     *
     * @param title of the movie.
     */
    public Regular(String title) {
        super(title);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double getAmount(int daysRented) {
        return daysRented > MAX_DAYS ? AMOUNT_FACTOR + (daysRented - MAX_DAYS) * AMOUNT : AMOUNT_FACTOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int calculateFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
