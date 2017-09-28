package org.fundacionjala.coding.german;

/**
 * Created by German on 9/15/2017.
 */
public class DigitalRoot {

    private static final int MAX_DIGITS = 10;

    /**
     * This method calculates root is the recursive sum of all the digits in a number.
     *
     * @param number int
     * @return int sum digits
     */

    public int digitalRoot(int number) {
        return number >= MAX_DIGITS ? digitalRoot(sumDig(number)) : number;
    }

    /**
     * This method return sum of all the digits in a number.
     *
     * @param dig number
     * @return int sum digits
     */
    private int sumDig(int dig) {
        int res = 0;
        String s = Integer.toString(dig);
        for (int i = 0; i < s.length(); i++) {
            res += Character.getNumericValue(s.charAt(i));
        }
        return res;
    }
}

