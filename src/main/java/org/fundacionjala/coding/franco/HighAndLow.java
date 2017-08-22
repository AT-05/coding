package org.fundacionjala.coding.franco;

import java.util.Arrays;

public class Calculator {

    /**
     *
     * @param
     * @return
     */
    public String highAndLow(String numbers) {
        String[] arrayNumbers = numbers.split("\\s+");
        int[] arrayOfIntNumbers = new int[arrayNumbers.length];
        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayOfIntNumbers[i] = Integer.parseInt(arrayNumbers[i]);
        }
        Arrays.sort(arrayOfIntNumbers);
        int first = arrayOfIntNumbers[0];
        int last = arrayOfIntNumbers[arrayOfIntNumbers.length - 1];

        return String.format("%s %s", last, first);
    }
}
