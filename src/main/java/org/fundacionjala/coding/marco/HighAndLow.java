package org.fundacionjala.coding.marco;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Administrator on 8/23/2017.
 */
public class HighAndLow {

    /**
     * Gets high and low numbers.
     * @param valor string value.
     * @return a string.
     */
    public String highAndLow(String valor) {

        int[] vector = Stream.of(valor.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        Arrays.sort(vector);
        return String.format("%s %s", vector[vector.length - 1], vector[0]);
    }
}
