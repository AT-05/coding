package org.fundacionjala.coding.abner.digital;

/**
 * This class calculate Digital root.
 * Created by Administrator on 9/15/2017.
 */
public class Digital {
    /**
     * This function constructor.
     *
     * @param digits this is the code.
     * @return the new int.
     */
    public int digitalRoot(String digits) {

        int result = Integer.parseInt(digits);

        while (result > 10) {
            result = digitalSum((String.valueOf(result)));

        }


        return result;
    }

    /**
     * Function Digital sum.
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
