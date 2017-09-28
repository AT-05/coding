package org.fundacionjala.coding.daniel;

/**
 * Created by Administrator on 08/09/17.
 */
public class ChildrenMovie extends Movie {
    /**
     * @param title
     * The title of the Children movie.
     * @param priceCode
     * The price code for the children movie.
     */
    public ChildrenMovie(String title, int priceCode) {
        super(title, priceCode);
    }

    /**
     * @param thisAmount
     * the current amount,default is 0.0.
     * @param each
     * The current element of the customer's rentals.
     * @return
     * Return the amount.
     */
    @Override
    public double getAmount(double thisAmount, Rental each) {
        thisAmount += 1.5;
        if (each.getDaysRented() > 3) {
            thisAmount += (each.getDaysRented() - 3) * 1.5;
        }
        return thisAmount;
    }
}

