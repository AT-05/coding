package org.fundacionjala.coding.abner;

/**
 * This class Persist.
 */
public class Persist {

    private static final int MAX_DIGITS = 10;

    /**
     * This function constructor.
     *
     * @param digits this is the code.
     * @return the new int.
     */
    public int persistence(String digits) {
        int result = Integer.parseInt(digits);
        int counter = 0;
        while (result > MAX_DIGITS) {
            result = digitalMultiply((String.valueOf(result)));
            counter++;
        }
        return counter;
    }

    /**
     * Function  multiply.
     *
     * @param s this is the code.
     * @return the counter int.
     */
    private int digitalMultiply(String s) {
        int sum = 1;
        String[] arrInt = s.split("");
        for (String anArrInt : arrInt) {
            sum *= Integer.parseInt(anArrInt);
        }
        return sum;
    }
}
