package org.fundacionjala.coding.german;

/**
 * Created by German on 8/29/2017.
 */
public class EANValidator {
    private static final int NUM_MOD = 10;

    /**
     * @param number String
     * @return boolean
     */
    public boolean validate(String number) {
        int sum = sumEO(number, 0, 1) + sumEO(number, 1, 3);
        int numericValue = Character.getNumericValue(number.charAt(12));
        int checkSum = sum % NUM_MOD == 0 ? 0 : NUM_MOD - sum % NUM_MOD;
        return numericValue == checkSum;
    }

    /**
     * @param number String
     * @param eo     int 0 for even , 1 por odd
     * @param mult   int for multiplier numeric value of char
     * @return int
     */
    private int sumEO(String number, int eo, int mult) {
        int res = 0;
        for (int i = eo; i < number.length() - 1; i += 2) {
            res = res + Character.getNumericValue(number.charAt(i)) * mult;
        }
        return res;
    }

}
