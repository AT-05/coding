package org.fundacionjala.coding.david;

import java.util.stream.Stream;

/**
 * This class realize check number.
 */
public class EANValidation {

    private static final int NUMBER_ONE = 1;
    private static final int NUMBER_THREE = 3;
    private static final int NUMBER_TEM = 10;
    private static final int NUMBER_TWO = 2;
    private static final int NUMBER_ZERO = 0;

    /**
     * This method realize check sum .
     * @param number is number.
     * @return true or false.
     */
    public boolean checkSum(String number) {
        int[] listNumber = Stream.of(number.split("")).mapToInt(Integer::parseInt).toArray();
        int resultTotal = 0;
        for (int i = 0; i < listNumber.length - 1; i++) {
            resultTotal += ((i + NUMBER_ONE) % NUMBER_TWO == 0)
                    ? listNumber[i] * NUMBER_THREE : listNumber[i] * NUMBER_ONE;
        }
        int checkSum = (resultTotal % NUMBER_TEM == 0) ? NUMBER_ZERO : NUMBER_TEM - (resultTotal % NUMBER_TEM);
        int lastNumber = listNumber[12];
        return lastNumber == checkSum;
    }
}
