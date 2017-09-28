package org.fundacionjala.coding.daniel;

/**
 * Created by Administrator on 15/09/17.
 */
class Kata10 {
    /**
     * Constructor class Kata 10.
     */
    protected Kata10() {

    }

    /**
     * @param n A long number.
     * @return returns its multiplicative persistence,
     * which is the number of times you must multiply the digits in num
     * until you reach a single digit.
     */
    public static int persistence(long n) {
        int times = 0;
        while (n >= 10) {
            n = Long.toString(n).chars().reduce(1, (r, i) -> r * (i - '0'));
            times++;
        }
        return times;
    }
}


