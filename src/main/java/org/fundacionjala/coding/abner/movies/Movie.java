package org.fundacionjala.coding.abner.movies;

/**
 * This class is father movie.
 * Created by Abner on 9/8/2017.
 */
abstract class Movie {
    private String title;

    /**
     * This function create de move.
     *
     * @param title this is a name of the movie.
     */
    Movie(String title) {
        this.title = title;
    }

    /**
     * This function abstract calculate amount.
     *
     * @param daysRented it is days rented.
     * @return the amount.
     */
    public abstract double calculateAmount(int daysRented);

    /**
     * This function abstract calculate the point.
     *
     * @param daysRented it is days rented.
     * @return the Points.
     */
    public abstract int calculateFrequentRenterPoints(int daysRented);

    /**
     * It is the geter of title.
     *
     * @return the movie title.
     */
    public String getTitle() {
        return title;
    }
}
