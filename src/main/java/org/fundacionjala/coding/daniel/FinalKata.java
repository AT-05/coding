package org.fundacionjala.coding.daniel;

/**
 * Created by Administrator on 15/09/17.
 */
class FinalKata {

    /**
     * Constructor class FinalKata.
     */
    protected FinalKata() {
    }

    /**
     * @param n A number.
     * @return The digital root of n,
     * digital root is the recursive sum of all the digits in a number.
     */
    public static int digitalroot(int n) {
        while (n > 9) {
            n = n / 10 + n % 10;
        }
        return (n);
    }
}
