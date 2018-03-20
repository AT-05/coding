package org.fundacionjala.coding.franco.movies;

/**
 * Created by Administrator on 9/8/2017.
 */
public abstract class Movie {
    protected final String title;

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

    /**
     * This is an abstract method.
     *
     * @param daysRented is the quantity of rental days.
     * @return the total frequent renter points depending on the Movie type.
     */
    abstract int calculateFrequentRenterPoints(int daysRented);

    /**
     * This method shows the rental figure of a movie.
     *
     * @param daysRented is the quantity of rental days.
     * @return the rental figure depending on the Movie type.
     */
    public String rentalFigure(int daysRented) {
        return String.format("\t%s\t%s", title, calculateAmount(daysRented));
    }
}
