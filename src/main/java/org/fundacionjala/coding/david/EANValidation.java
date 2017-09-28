package org.fundacionjala.coding.david;

/**
 * This class realize check number.
 */
public class EANValidation {

    private static final int NUMBER_TWO = 2;

    private static final int NUMBER_THREE = 3;

    private static final int NUMBER_TEN = 10;

    /**
     * This method realize check sum.
     *
     * @param number is number.
     * @return true or false.
     */
    public boolean checkSum(String number) {
        String[] listNumber = number.split("");
        int sum = 0;
        for (int i = 0; i < listNumber.length - 1; i++) {
            int n = Integer.parseInt(listNumber[i]);
            sum += (i + 1) % NUMBER_TWO == 0 ? n * NUMBER_THREE : n;
        }
        int checkSum = (sum % NUMBER_TEN == 0) ? 0 : NUMBER_TEN - (sum % NUMBER_TEN);
        int lastNumber = Integer.parseInt(listNumber[listNumber.length - 1]);
        return lastNumber == checkSum;
    }
}
