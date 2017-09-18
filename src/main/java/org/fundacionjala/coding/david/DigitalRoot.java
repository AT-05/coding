package org.fundacionjala.coding.david;

import java.util.stream.Stream;

/**
 * This class is is exam final.
 */
public class DigitalRoot {

    /**
     * This method realize sum od digits.
     * @param number is value string.
     * @return a number.
     */
    public int sunOfDigits(String number) {
        int[] listNumber = Stream.of(number.split("")).mapToInt(Integer::parseInt).toArray();
        int sumResult = 0;
        while (listNumber.length > 1) {
            sumResult = 0;
            for (int item : listNumber) {
                sumResult += item;
            }
            String newNumber = String.valueOf(sumResult);
            listNumber = Stream.of(newNumber.split("")).mapToInt(Integer::parseInt).toArray();
        }
        return sumResult;
    }
}
