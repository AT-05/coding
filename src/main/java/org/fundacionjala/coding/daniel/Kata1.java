package org.fundacionjala.coding.daniel;

import java.util.Arrays;

/**
 * Created by Administrator on 10/09/17.
 */

public class Kata1 {

    /**
     * Constructor Kata1.
     */
    public Kata1() {

    }

    /**
     * @param numbers A set of numbers.
     * @return Calculates the high and low values of these numbers.
     */
    public String highAndLow(String numbers) {

        int min = Arrays.stream(numbers.split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .min()
                .getAsInt();

        int max = Arrays.stream(numbers.split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .max()
                .getAsInt();

        return String.format("%d %d", max, min);
    }
}
