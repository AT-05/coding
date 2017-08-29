package org.fundacionjala.coding.Gary;

import java.util.Arrays;

/**
 * test.
 * Created by Gary on 17/8/2017.
 */
public class Sort {
    private String chain;
    private String space;

    /**
     * constructor for Sort.
     * @param chain receives the string.
     *
     */
    public Sort(String chain) {
        this.chain = chain;
        space = "[ ]+";
    }


    /**
     * highAndLow.
     * @return numbers sorted.
     */
    public String highAndLow() {
        String[] chain1 = chain.split(space);
        int[] numbers = new int[chain1.length];
        for (int i = 0; i < chain1.length; i++) {
            numbers[i] = Integer.parseInt(chain1[i]);
        }
        Arrays.sort(numbers);
        return String.format("%s %s", numbers[numbers.length - 1], numbers[0]);


    }
}
