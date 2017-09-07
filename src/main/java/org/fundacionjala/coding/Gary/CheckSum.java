package org.fundacionjala.coding.Gary;

import java.util.stream.Stream;

/**
 * Created by Gary on 29/8/2017.
 */
public class CheckSum {
    private static final int NUMBER_SIZE = 1;
    private static final int NUMBER_EVEN = 3;
    private static final int NUMBER_MODULE = 10;

    /**
     * checkSum compare the numbers.
     *
     * @param chain1 chain.
     * @return checkSum boolean.
     */
    public boolean checkSum1(String chain1) {
        int result1 = 0;
        int[] numbers = Stream.of(chain1.split("")).mapToInt(Integer::parseInt).toArray();
        for (int position = 0; position < numbers.length - NUMBER_SIZE; position++) {
            result1 = position + NUMBER_SIZE % 2 == 0
                    ? result1 + numbers[position] * NUMBER_EVEN
                    : result1 + numbers[position];
        }
        int checksum = result1 % NUMBER_MODULE == 0 ? 0 : NUMBER_MODULE - (result1) % NUMBER_MODULE;
        return checksum == numbers[numbers.length - NUMBER_SIZE];
    }
}
