package org.fundacionjala.coding.franco;

import java.util.stream.Stream;

/**
 * Created by Administrator on 9/15/2017.
 */
public class DigitalRoot {

    public static final int CONS_ONE = 1;
    private int lastSum = 0;

    /**
     * This method sums digits of a number until the
     * result is one digit.
     *
     * @param number to work with.
     * @return the last result of the sum of the
     * digits of the number.
     */
    public int sum(int number) {
        final int[] numbers = Stream.of(String.valueOf(number).split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        if (numbers.length <= CONS_ONE) {
            return lastSum;
        }
        int sum = 0;
        for (int number1 : numbers) {
            sum += number1;
        }
        lastSum = sum;
        return sum(lastSum);
    }
}
