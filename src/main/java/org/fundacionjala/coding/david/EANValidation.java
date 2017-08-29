package org.fundacionjala.coding.david;

import java.util.stream.Stream;

/**
 * This class realize check number.
 */
public class EANValidation {

    private static final int NUMBER_ONE = 1;
    private static final int NUMBER_THREE = 3;

    /**
     * This method realize check sum .
     * @param number is number.
     * @return true or false.
     */
    public boolean checkSum(String number) {
        int[] listNumber = Stream.of(number.split("")).mapToInt(Integer::parseInt).toArray();
        int resultTotal = 0;
        for (int i = 0; i < listNumber.length - 1; i++) {
            resultTotal += ((i + 1) % 2 == 0) ? listNumber[i] * NUMBER_THREE : listNumber[i] * NUMBER_ONE;
        }
        int checkSum = (resultTotal % 10 == 0) ? 0 : 10 - (resultTotal % 10);
        int lastNumber = listNumber[12];
        return lastNumber == checkSum;
    }
}
