package org.fundacionjala.coding.daniel;

/**
 * Created by Administrator on 08/09/17.
 */
public class RegularMovie extends Movie {
    /**
     * @param title     Title for regular movie.
     * @param priceCode price code.
     */
    public RegularMovie(String title, int priceCode) {
        super(title, priceCode);
    }

    /**
     * @param thisAmount The current Amount.
     * @param each       Each Rentl from customers.
     * @return Returns the amount fora regular movie.
     */
    @Override
    public double getAmount(double thisAmount, Rental each) {
        thisAmount += 2;
        if (each.getDaysRented() > 2) {
            thisAmount += (each.getDaysRented() - 2) * 1.5;
        }
        return thisAmount;
    }
}

