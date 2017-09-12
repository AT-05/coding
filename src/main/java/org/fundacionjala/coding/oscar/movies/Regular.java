package org.fundacionjala.coding.oscar.movies;

/**
 * Created by Oz64 on 09/09/2017.
 */
public class Regular extends Movie {
    public static final int REGULAR = 0;

    /**
     * This is the constructor, invoke the super class movie with
     * the title ant the type of movie, 0 for this case of regular.
     *
     * @param title of the movie.
     */
    public Regular(String title) {
        super(title, REGULAR);
    }

    @Override
    public double getAmount(int daysRented) {
        double thisAmount = 2;
        return (daysRented > 2) ? thisAmount + (daysRented - 2) * 1.5 : thisAmount;
    }
}
