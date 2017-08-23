package org.fundacionjala.coding.Marco_Kata1and2;

import java.util.Arrays;

/**
 * Created by Administrator on 8/23/2017.
 */
public class HighAndLow {
    /**
     * test.
     * @param stringNumber
     * @return test.
     */
    public String highAndLow(String stringNumber) {
        int[] vector = Arrays.stream(stringNumber.split(" ")).
                filter(word -> !word.isEmpty()).
                mapToInt(Integer::parseInt).
                toArray();
        Arrays.sort(vector);
        return String.format("%s %s", vector[vector.length - 1], vector[0]);
    }
}
