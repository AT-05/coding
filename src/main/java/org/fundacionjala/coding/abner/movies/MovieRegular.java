package org.fundacionjala.coding.abner.movies;

/**
 * This class extend of the movie.
 * Created by Abner on 9/12/2017.
 */
public class MovieRegular extends Movie {
    /**
     * This is a constructor.
     *
     * @param title it is a title of the movie.
     */
    public MovieRegular(String title) {
        super(title);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double calculateAmount(int daysRented) {
        return (daysRented > 2) ? (2 + (daysRented - 2) * 1.5) : 2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int calculateFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
