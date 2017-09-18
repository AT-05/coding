package org.fundacionjala.coding.david;

/**
 * Created by Maizman on 12/09/2017.
 */
public class Persist {


    private static final int CONSTANT_NUMBER_TEN = 10;
    private static final int CONSTANT_NUMBER_ONE = 1;

    /**
     * This method find persistence.
     *
     * @param number is value longer.
     * @return value int.
     */
    public int persistence(long number) {

        if (number < CONSTANT_NUMBER_TEN) {
            return 0;
        }

        long n2 = CONSTANT_NUMBER_ONE;
        while (number != 0) {
            n2 *= number % CONSTANT_NUMBER_TEN;
            number /= CONSTANT_NUMBER_TEN;
        }
        return CONSTANT_NUMBER_ONE + persistence(n2);


    }
}
