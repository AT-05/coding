package org.fundacionjala.coding.franco.movies;

/**
 * Created by Administrator on 9/8/2017.
 */
public class Regular extends Movie {

    private static final double AMOUNT_FACTOR = 1.5;

    /**
     * Regular Class constructor.
     *
     * @param title is the Movie title.
     */
    public Regular(String title) {
        super(title);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    double calculateAmount(int daysRented) {
        return daysRented > 2 ? (daysRented - 2) * AMOUNT_FACTOR : 2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    int calculateFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
