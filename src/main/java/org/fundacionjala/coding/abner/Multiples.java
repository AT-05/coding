package org.fundacionjala.coding.abner;

/**
 * Created by Samuel on 18/08/2017.
 */
public class Multiples {

    private int mult1, mult2;

    /**
     *Initializing values.
     */
    public Multiples() {
        mult1 = 3;
        mult2 = 5;
    }

    /**
     *
     * @param numMax  Multiplier numbers.
     * @return the sum total.
     */
    public int multiplesSum(int numMax) {
        int sum = 0;
        for (int i = 1; i < numMax; i++) {
            if (i % mult1 == 0 || i % mult2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
