package org.fundacionjala.coding.oscar.movies;

/**
 * Created by Oz64 on 09/09/2017.
 */
public class Children extends Movie {

    private static final double AMOUNT_FACTOR = 1.5;

    private static final int MAX_DAYS = 3;

    /**
     * This is the constructor, invoke the super class movie
     * with the title ant the type of movie, 2 for this case of children.
     *
     * @param title of the movie.
     */
    public Children(String title) {
        super(title);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double getAmount(int daysRented) {
        return daysRented > MAX_DAYS ? AMOUNT_FACTOR + (daysRented - MAX_DAYS) * AMOUNT_FACTOR : AMOUNT_FACTOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int calculateFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
