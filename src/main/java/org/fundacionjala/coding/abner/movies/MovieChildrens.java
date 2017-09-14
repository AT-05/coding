package org.fundacionjala.coding.abner.movies;

/**
 * This class extend of the movie.
 * Created by Abner on 9/8/2017.
 */
public class MovieChildrens extends Movie {

    /**
     * This is a constructor.
     *
     * @param title it is a title of the movie.
     */
    public MovieChildrens(String title) {
        super(title);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double calculateAmount(int daysRented) {

        return (daysRented > 3) ? 1.5 + ((daysRented - 3) * 1.5) : 1.5;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int calculateFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
