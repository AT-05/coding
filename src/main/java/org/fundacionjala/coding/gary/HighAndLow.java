package org.fundacionjala.coding.gary;

import java.util.Arrays;

/**
 * test.
 */
public class HighAndLow {

    private String chain;

    private static final String SPACE = "[ ]+";

    /**
     * constructor for HighAndLow.
     *
     * @param chain receives the string.
     */
    public HighAndLow(String chain) {
        this.chain = chain;
    }

    /**
     * highAndLow.
     *
     * @return numbers sorted.
     */
    public String highAndLow() {
        String[] chain1 = chain.split(SPACE);
        int[] numbers = new int[chain1.length];
        for (int i = 0; i < chain1.length; i++) {
            numbers[i] = Integer.parseInt(chain1[i]);
        }
        Arrays.sort(numbers);
        return String.format("%s %s", numbers[numbers.length - 1], numbers[0]);
    }

}
