package org.fundacionjala.coding.Franco;

import java.util.stream.Stream;

/**
 * Created by Administrator on 8/29/2017.
 */
public class EANValidation {

    public static final int CONST_TEN = 10;
    public static final int CONST_ONE = 1;
    public static final int COMPARATOR = 2;
    public static final int CONST_THREE = 3;
    public static final int CONST_ZERO = 0;

    /**
     * @param chainOfNumbers is an European Article Number.
     * @return whether the checksum of the first twelve numbers of this EAN number
     * is the same as its last digit.
     */
    public boolean checksumValidation(String chainOfNumbers) {
        final int[] numbers = Stream.of(chainOfNumbers.split("")).mapToInt(Integer::parseInt).toArray();
        int totalSum = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            totalSum += (i + CONST_ONE) % COMPARATOR == CONST_ZERO ? numbers[i] * CONST_THREE : numbers[i];
        }
        int checkSum = totalSum % CONST_TEN == CONST_ZERO ? CONST_ZERO : CONST_TEN - (totalSum % CONST_TEN);

        return numbers[numbers.length - 1] == checkSum;
    }
}
