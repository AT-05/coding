package org.fundacionjala.coding.franco;

/**
 * Created by Administrator on 9/8/2017.
 */
public class RegularMovie extends Movie {

    /**
     * RegularMovie Class constructor.
     *
     * @param title is the Movie title.
     */
    public RegularMovie(String title) {
        super(title);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    double calculateAmount(int daysRented) {
        return daysRented > 2 ? (daysRented - 2) * 1.5 : 2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    int calculateFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
