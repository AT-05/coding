package org.fundacionjala.coding.david;

/**
 * Created by Administrator on 9/12/2017.
 */
public class Childrens extends Movie {

    /**
     * This method initialize constructor.
     *
     * @param title     and priceCode.
     * @param priceCode and title.
     */
    public Childrens(String title, int priceCode) {
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

        double thisAmount = 1.5;
        return (rental > 3) ? (thisAmount + (rental - 3) * 1.5) : thisAmount;
    }

}
