package org.fundacionjala.coding.oscar.movies;

/**
 * Created by Oz64 on 09/09/2017.
 */
public class Children extends Movie {

    /**
     * This is the constructor, invoke the super class movie
     * with the title ant the type of movie, 2 for this case of childrens.
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
        double thisAmount = 1.5;
        return daysRented > 3 ? thisAmount + (daysRented - 3) * 1.5 : thisAmount;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int calculateFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
