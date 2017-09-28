package org.fundacionjala.coding.oscar;

/**
 * Created by Administrator on 9/15/2017.
 */
public class DigitalRoot {

    private static final int MAX_DIGITS = 10;

    /**
     * This method sum all numbers of the integer.
     *
     * @param number as a integer.
     * @return total sum as a integer.
     */
    public int digitalRoot(int number) {
        int total = 0;
        String[] numbers = String.valueOf(number).split("");
        for (String num : numbers) {
            total += Integer.parseInt(num);
        }
        if (total > MAX_DIGITS) {
            return digitalRoot(total);
        }
        return total;
    }
}
