package org.fundacionjala.coding.oscar.movies;

/**
 * Created by Oz64 on 09/09/2017.
 */
public class NewRelease extends Movie {
    public static final int NEW_RELEASE = 1;

    /**
     * This is the constructor, invoke the super class movie with
     * the title ant the type of movie, 1 for this case of NewRelease.
     *
     * @param title of the movie.
     */
    public NewRelease(String title) {
        super(title, NEW_RELEASE);
    }

    @Override
    public double getAmount(int daysRented) {
        return (daysRented * 3);
    }
}
