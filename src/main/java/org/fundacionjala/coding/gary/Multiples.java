package org.fundacionjala.coding.gary;

/**
 * test.
 */
public class Multiples {

    private static final int MULTI_5 = 5;

    private static final int MULTI_3 = 3;

    /**
     * add numbers.
     *
     * @param numbers below.
     * @return the total below param.
     */
    public int multiplesSum(int numbers) {
        int add = 0;

        for (int number = 0; number < numbers; number++) {
            add = (number % MULTI_3 == 0 || number % MULTI_5 == 0) ? add + number : add;
        }

        return add;
    }
}
