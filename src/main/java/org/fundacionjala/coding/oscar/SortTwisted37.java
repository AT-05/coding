package org.fundacionjala.coding.oscar;

import java.util.Arrays;

/**
 * Created by Oz64 on 14/09/2017.
 */
public class SortTwisted37 {

    /**
     * This method sort the array of numbers and call the method for change the numbers.
     * @param array of the numbers.
     * @return array numbers sort and twisted.
     */
    public Integer[] sortTwisted(Integer[] array) {
        Integer[] arrayNumbers = array.clone();
        Arrays.sort(arrayNumbers);
        for (int index = 0; index < arrayNumbers.length; index++) {
            arrayNumbers[index] = change3and7(arrayNumbers[index]);
        }
        return arrayNumbers;
    }

    /**
     * This method change if are a 3 for 7 and 7 for 3.
     * @param number as a integer.
     * @return the number as a integer.
     */
    public int change3and7(int number) {
        String num = String.valueOf(number);
        String[] list = num.split("");
        for (int index = 0; index < list.length; index++) {
            switch (list[index]) {
                case "3":
                    list[index] = "7";
                    break;
                case "7":
                    list[index] = "3";
                    break;
                default:
                    break;
            }
        }
        return Integer.parseInt(String.join("", list));
    }
}
