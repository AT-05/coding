package org.fundacionjala.coding.Gary;

import java.util.Arrays;

/**
 * test.
 * Created by Gary on 17/8/2017.
 */
public class Sort {
    private String chain;
    private String space;
    private static final int MULTI_5 = 5;
    private static final int MULTI_3 = 3;

    /**
     * constructor for Sort.
     *
     * @param chain receives the string.
     */
    public Sort(String chain) {
        this.chain = chain;
        space = "[ ]+";
    }


    /**
     * highAndLow.
     *
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

    /**
     * add numbers.
     *
     * @param numbers below.
     * @return the total below param.
     */
    public static int addMultiplies(int numbers) {
        int add = 0;

        for (int number = 0; number < numbers; number++) {
            add = (number % MULTI_3 == 0 || number % MULTI_5 == 0) ? add + number : add;
        }

        return add;
    }
}
