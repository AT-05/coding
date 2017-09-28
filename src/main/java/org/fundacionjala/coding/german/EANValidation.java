package org.fundacionjala.coding.german;

/**
 * Created by German on 8/29/2017.
 */
public class EANValidation {

    private static final int NUM_MOD = 10;

    private static final int MULTIPLE_THREE = 3;

    /**
     * Validates the checksum.
     *
     * @param number String
     * @return boolean
     */
    public boolean validate(String number) {
        int sum = sumEO(number, 0, 1) + sumEO(number, 1, MULTIPLE_THREE);
        int lastNumber = Character.getNumericValue(number.charAt(number.length() - 1));
        int checkSum = sum % NUM_MOD == 0 ? 0 : NUM_MOD - sum % NUM_MOD;
        return lastNumber == checkSum;
    }

    /**
     * @param number   String
     * @param eo       int 0 for even , 1 por odd
     * @param multiple int for multiplier numeric value of char
     * @return int
     */
    private int sumEO(String number, int eo, int multiple) {
        int res = 0;
        for (int i = eo; i < number.length() - 1; i += 2) {
            res += Character.getNumericValue(number.charAt(i)) * multiple;
        }
        return res;
    }

}
