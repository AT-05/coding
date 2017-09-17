package org.fundacionjala.coding.franco.movies;

/**
 * Created by Administrator on 9/8/2017.
 */
public class ChildrensMovie extends Movie {

    /**
     * ChildrensMovie Class constructor.
     *
     * @param title is the Movie title.
     */
    public ChildrensMovie(String title) {
        super(title);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    double calculateAmount(int daysRented) {
        return daysRented > 3 ? (daysRented - 3) * 1.5 : 1.5;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    int calculateFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
