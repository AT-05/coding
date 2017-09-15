package org.fundacionjala.coding.oscar;

/**
 * Created by Administrator on 9/15/2017.
 */
public class Kata11 {
    /**
     * This method sum all numbers of the integer.
     *
     * @param number as a integer.
     * @return total sum as a integer.
     */
    public int digitalRoot(int number) {
        int total = 0;
        String[] numbers = String.valueOf(number).split("");
        int resp = Integer.parseInt(numbers[0]);
        for (int index = 1; index < numbers.length; index++) {
            resp += Integer.parseInt(numbers[index]);
            total = resp;
        }
        if (total > 10) {
            return digitalRoot(total);
        }
        return total;
    }
}
