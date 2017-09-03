package org.fundacionjala.coding.franco;

import java.util.stream.Stream;

/**
 * Created by Administrator on 8/29/2017.
 */
public class EANValidation {

    private static final int CONST_TEN = 10;
    private static final int CONST_ONE = 1;
    private static final int COMPARATOR = 2;
    private static final int CONST_THREE = 3;
    private static final int CONST_ZERO = 0;

    /**
     * @param chainOfNumbers is an European Article Number.
     * @return whether the checksum of the first twelve numbers of this EAN number
     * is the same as its last digit.
     */
    public boolean checksumValidation(String chainOfNumbers) {
        final int[] numbers = Stream.of(chainOfNumbers.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
        int totalSum = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            totalSum += (i + CONST_ONE) % COMPARATOR == CONST_ZERO ? numbers[i] * CONST_THREE : numbers[i];
        }
        int checkSum = totalSum % CONST_TEN == CONST_ZERO ? CONST_ZERO : CONST_TEN - (totalSum % CONST_TEN);

        return numbers[numbers.length - 1] == checkSum;
    }
}
