package org.fundacionjala.coding.franco;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by Administrator on 9/14/2017.
 */
public class PlanetTwisted {
    final static int CONS_THREE = 3;
    final static int CONS_SEVEN = 7;

    /**
     * This method changes all 3 and 7 instances of a set of numbers.
     *
     * @param chainOfNumbers is a set of numbers.
     * @return the set of numbers with values 3 and 7 changed
     * by the other.
     */
    public Integer[] sortNumbers(Integer[] chainOfNumbers) {
        final int[] numbers = Arrays.stream(chainOfNumbers).mapToInt(Integer::intValue).toArray();
        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] % 10 == CONS_THREE ? CONS_SEVEN : numbers[i] % 10 == CONS_SEVEN ? CONS_THREE : numbers[i];
        }
        Integer[] result = IntStream.of(numbers).boxed().toArray(Integer[]::new);
        return result;
    }
}
