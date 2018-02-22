package org.fundacionjala.coding.abner.movies;

/**
 * This class extend of the movie.
 * Created by Abner on 9/8/2017.
 */
public class MovieNewRelease extends Movie {

    /**
     * This is a constructor.
     *
     * @param title it is a title of the movie.
     */
    public MovieNewRelease(String title) {
        super(title);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double calculateAmount(int daysRented) {
        return daysRented * 3;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int calculateFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }
}
