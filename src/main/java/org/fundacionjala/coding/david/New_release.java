package org.fundacionjala.coding.david;

/**
 * Created by Administrator on 9/12/2017.
 */
public class New_release extends Movie {


    /**
     * This method initialize constructor.
     *
     * @param title     and priceCode.
     * @param priceCode and title.
     */
    public New_release(String title, int priceCode) {
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
        return rental * 3;
    }


}
