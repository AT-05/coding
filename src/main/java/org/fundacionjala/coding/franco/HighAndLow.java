package org.fundacionjala.coding.franco;

import java.util.Arrays;

/**
 * The purpose of this class is to calculate High and Low Numbers of a list.
 */
public class HighAndLow {
    /**
     * @param numbers Is a string that contains a set of numbers separated by a space.
     * @return Highest and Lowest numbers of the set.
     */
    public String highAndLowNumbers(String numbers) {
        int first, last;
        String[] arrayNumbers = numbers.split("\\s+");
        int[] arrayOfIntNumbers = new int[arrayNumbers.length];
        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayOfIntNumbers[i] = Integer.parseInt(arrayNumbers[i]);
        }
        Arrays.sort(arrayOfIntNumbers);
        first = arrayOfIntNumbers[0];
        last = arrayOfIntNumbers[arrayOfIntNumbers.length - 1];

        return String.format("%s %s", last, first);
    }
}
