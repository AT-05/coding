package org.fundacionjala.coding.marco;

import java.util.Arrays;

/**
 * This was made by Marco Mendez September 18, 2017.
 */
public class PlanetTwisted {

    /**
     * This is the method main.
     * @param array test.
     * @return test.
     */
    public Integer[] sortTwisted(Integer[] array) {
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
