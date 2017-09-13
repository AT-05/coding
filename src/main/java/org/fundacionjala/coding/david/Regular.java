package org.fundacionjala.coding.david;

/**
 * Created by Administrator on 9/12/2017.
 */
public class Regular extends Movie {


    /**
     * This method initialize constructor.
     *
     * @param title     and priceCode.
     * @param priceCode and title.
     */
    public Regular(String title, int priceCode) {
        super(title, priceCode);
    }

    /**
     * This method calculate cost rental.
     *
     * @param rental is day rented.
     * @return value cost of rent.
     */
    @Override
    public double getAmount(int rental) {
        double thisAmount = 2;
        return (rental > 2) ? (thisAmount + (rental - 2) * 1.5) : thisAmount;

    }
}
