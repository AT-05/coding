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
     * test.
     * @param chain test.
     *              test.
     */
    public Sort(String chain) {
        this.chain = chain;
        space = "[ ]+";
    }


    /**
     *test.
     * @return test.
     */
    public String highAndLow() {
        String[] chain1 = chain.split(space);
        int[] numbers = new int[chain1.length];
        for (int i = 0; i < chain1.length; i++) {
            numbers[i] = Integer.parseInt(chain1[i]);
        }
        Arrays.sort(numbers);
        return numbers[numbers.length - 1] + " " + numbers[0];

    }
}
