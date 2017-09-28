package org.fundacionjala.coding.daniel;

/**
 * Class Movie.
 */
public class Movie {
    private String title;
    private int priceCode;

    /**
     * @param title     the title of the movie
     * @param priceCode Constructor for Class Movie.
     */
    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    /**
     * @return The title of the movie.
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param thisAmount The current Amount.
     * @param each       Each Rental from customers.
     * @return Returns the amount for each Movie.
     */
    public double getAmount(double thisAmount, Rental each) {
        return 0.0;
    }
}

