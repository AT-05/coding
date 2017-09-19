package org.fundacionjala.coding.abner;

/**
 * This class calculate DigitalRoot root.
 */
public class DigitalRoot {
    /**
     * This function constructor.
     *
     * @param digits this is the code.
     * @return the new int.
     */
    public int digitalRoot(String digits) {

        int result = Integer.parseInt(digits);

        while (result > 10) {
            result = digitalSum(String.valueOf(result));

        }


        return result;
    }

    /**
     * Function DigitalRoot sum.
     *
     * @param s this is the code.
     * @return the new int.
     */
    private int digitalSum(String s) {
        int sum = 0;
        String[] arrInt = s.split("");
        for (String anArrInt : arrInt) {
            sum += Integer.parseInt(anArrInt);
        }
        return sum;
    }


}
