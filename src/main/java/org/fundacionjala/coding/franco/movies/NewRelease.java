package org.fundacionjala.coding.franco.movies;

/**
 * Created by Administrator on 9/8/2017.
 */
public class NewRelease extends Movie {

    private static final double AMOUNT_FACTOR = 3;

    /**
     * NewRelease Class constructor.
     *
     * @param title is the Movie title.
     */
    public NewRelease(String title) {
        super(title);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    double calculateAmount(int daysRented) {
        return daysRented * AMOUNT_FACTOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    int calculateFrequentRenterPoints(int daysRented) {
        return daysRented > 1 ? 2 : 1;
    }
}
