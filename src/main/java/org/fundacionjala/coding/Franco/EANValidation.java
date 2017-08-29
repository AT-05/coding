package org.fundacionjala.coding.Franco;

import java.util.stream.Stream;

/**
 * Created by Administrator on 8/29/2017.
 */
public class EANValidation {
    /**
     *
     * @param chainOfNumbers is an European Article Number.
     * @return if the checksum of the first twelve numbers of this EAN number
     * is the same as its last digit.
     */
    public boolean checksumValidation(String chainOfNumbers) {
        final int[] numbers = Stream.of(chainOfNumbers.split("")).mapToInt(Integer::parseInt).toArray();
        int totalSum = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            totalSum += ((i + 1) % 2 == 0) ? (numbers[i] * 3) : (numbers[i]);
        }
        int checkSum = (totalSum % 10 == 0) ? 0 : 10 - (totalSum % 10);
        return numbers[numbers.length - 1] == checkSum;
    }
}
