package org.fundacionjala.coding.franco.movies;

/**
 * Created by Administrator on 9/8/2017.
 */
public class NewReleaseMovie extends Movie {

    /**
     * NewReleaseMovie Class constructor.
     *
     * @param title is the Movie title.
     */
    public NewReleaseMovie(String title) {
        super(title);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    double calculateAmount(int daysRented) {
        return daysRented * 3;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    int calculateFrequentRenterPoints(int daysRented) {
        return daysRented > 1 ? 2 : 1;
    }
}
