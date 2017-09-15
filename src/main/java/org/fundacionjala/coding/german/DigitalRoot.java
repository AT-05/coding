package org.fundacionjala.coding.german;

/**
 * Created by Administrator on 9/15/2017.
 */
public class DigitalRoot {
    /**
     * This method calculates root is the recursive sum of all the digits in a number.
     *
     * @param number int
     * @return int sum digits
     */

    public int digitalRoot(int number) {
        int res = number;
        if (res > 10) {

            res = digitalRoot(sumDig(res));
        }
        return res;
    }

    /**
     * This method return sum of all the digits in a number.
     *
     * @param dig number
     * @return int sum digits
     */
    private int sumDig(int dig) {
        int res = 0;
        Integer interge = dig;
        String s = interge.toString();
        for (int i = 0; i < s.length(); i++) {
            res += Character.getNumericValue(s.charAt(i));
        }
        return res;


    }
}
