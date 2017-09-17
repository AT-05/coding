package org.fundacionjala.coding.oscar;

import java.util.Arrays;

/**
 * Created by Oz64 on 17/08/2017.
 */
public class HighAndLow {
    /**
     * This function return the mayor and minus numbers in a string.
     *
     * @param stringNumbers is a string of numbers
     * @return a string with the mayor and minor.
     */

    public String highAndLow(String stringNumbers) {
        int[] numbers = Arrays.stream(stringNumbers.split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(numbers);
        return String.format("%d %d", numbers[numbers.length - 1], numbers[0]);
    }
}
