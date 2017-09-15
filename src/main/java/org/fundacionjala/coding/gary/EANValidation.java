package org.fundacionjala.coding.gary;

import java.util.stream.Stream;

/**
 * Created by Gary on 29/8/2017.
 */
public class EANValidation {
    private static final int NUMBER_ONE = 1;
    private static final int NUMBER_EVEN = 3;
    private static final int NUMBER_MODULE = 10;

    /**
     * checkSum compare the numbers.
     *
     * @param chain1 chain.
     * @return checkSum boolean.
     */
    public boolean checkSum1(String chain1) {
        int result = 0;
        int[] numbers = Stream.of(chain1.split(""))
                .mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < numbers.length - NUMBER_ONE; i++) {
            result += (i + NUMBER_ONE) % 2 == 0
                    ? numbers[i] * NUMBER_EVEN
                    : numbers[i];
        }
        int checksum = result % NUMBER_MODULE == 0 ? 0 : NUMBER_MODULE - (result) % NUMBER_MODULE;
        return checksum == numbers[numbers.length - NUMBER_ONE];
    }
}
