package org.fundacionjala.coding.oscar;

import java.util.Arrays;

/**
 * Created by Oz64 on 17/08/2017.
 */
public class Kata1 {
    /**
     * This function return the mayor and minus numbers in a string.
     *
     * @param stringNumbers is a string of numbers
     * @return a string with the mayor and minor.
     */

    public String highAndLow(String stringNumbers) {
        String[] arrayNumbers = stringNumbers.split(" ");
        Arrays.sort(arrayNumbers);
        return String.format("%s %s", arrayNumbers[arrayNumbers.length - 1], arrayNumbers[0]);
    }
}
