package org.fundacionjala.coding.oscar;

/**
 * Created by Oz64 on 18/08/2017.
 */
public class Multiples {

    /**
     * This function sum the multiply of 3 and 5.
     *
     * @param number is a top of the list
     * @return sum of the multiply
     */
    public int multiplyOf3and5(int number) {

        int result = 0;
        for (int i = 1; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                result += i;
            }
        }
        return result;
    }
}
