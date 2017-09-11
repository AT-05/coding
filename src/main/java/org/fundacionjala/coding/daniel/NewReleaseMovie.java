package org.fundacionjala.coding.daniel;

/**
 * Created by Administrator on 08/09/17.
 */
public class NewReleaseMovie extends Movie {
    /**
     * @param title
     * Title of New Release Movie.
     * @param priceCode
     * Constructor for Class NewReleaseMovie.
     */
    public NewReleaseMovie(String title, int priceCode) {
        super(title, priceCode);
    }

    /**
     * @param thisAmount
     * Current Amount.
     * @param each
     * The current rental.
     * @return
     * Returns the amount for a new relesease movie.
     */
    @Override
    public double getAmount(double thisAmount, Rental each) {
        thisAmount += each.getDaysRented() * 3;
        return thisAmount;
    }

}

