package org.fundacionjala.coding.franco;

import java.util.stream.Stream;

/**
 * Created by Administrator on 9/14/2017.
 */
public class PersistentBugger {
    private int counter = 0;

    /**
     * This method calculates persistence aof a number.
     *
     * @param number is an integer number.
     * @return number of multiplications between the digits of the number.
     */
    public int persistence(int number) {
        final int[] numbers = Stream.of(String.valueOf(number).split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        if (numbers.length > 1) {
            int result = 1;
            for (int value : numbers) {
                result *= value;
            }
            counter++;
            return persistence(result);
        }
        return counter;
    }
}
