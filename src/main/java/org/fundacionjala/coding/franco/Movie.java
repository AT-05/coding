package org.fundacionjala.coding.franco;

/**
 * Created by Administrator on 9/8/2017.
 */
public abstract class Movie {
    private final String title;

    /**
     * Constructor for Movie Class.
     *
     * @param title of the Movie.
     */
    public Movie(String title) {
        this.title = title;
    }

    /**
     * This is an abstract method.
     *
     * @param daysRented is the quantity of rental days.
     * @return the total amount depending on the Movie type.
     */
    abstract double calculateAmount(int daysRented);

    abstract int calculateFrequentRenterPoints(int daysRented);
}
