package org.fundacionjala.coding.oscar;

import java.util.Arrays;

/**
 * Created by Oz64 on 14/09/2017.
 */
public class PlanetTwisted {

    /**
     * This method sort the array of numbers and call the method for change the numbers.
     *
     * @param array of the numbers.
     * @return array numbers sort and twisted.
     */
    public Integer[] sort(Integer[] array) {
        Integer[] arrayNumbers = array.clone();
        iterateArray(arrayNumbers);
        Arrays.sort(arrayNumbers);
        iterateArray(arrayNumbers);
        return arrayNumbers;
    }

    /**
     * This method change if are a 3 for 7 and 7 for 3.
     *
     * @param number as a integer.
     * @return the number as a integer.
     */
    public int change3and7(int number) {
        String num = String.valueOf(number);
        String[] numString = num.split("");
        for (int x = 0; x < numString.length; x++) {
            numString[x] = numString[x].replace("7", "x")
                    .replace("3", "y")
                    .replace("x", "3")
                    .replace("y", "7");
        }
        num = String.join("", numString);
        return Integer.parseInt(num);
    }

    /**
     * This method iterate over the array of numbers.
     *
     * @param numbers numbers as a integer array.
     */
    public void iterateArray(Integer[] numbers) {
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = change3and7(numbers[index]);
        }
    }
}
