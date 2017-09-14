package org.fundacionjala.coding.franco;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by Administrator on 9/14/2017.
 */
public class PlanetTwisted {
    final static int CONS_THREE = 3;
    final static int CONS_SEVEN = 7;

    public Integer[] sortNumbers(Integer[] chainOfNumbers) {
        final int[] numbers = Arrays.stream(chainOfNumbers).mapToInt(Integer::intValue).toArray();
        final int[] sortedNumbers = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            sortedNumbers[i] = numbers[i] == CONS_THREE ? CONS_SEVEN : numbers[i] == CONS_SEVEN ? CONS_THREE : numbers[i];
        }
        //Arrays.sort(sortedNumbers);
        Integer[] result = IntStream.of(sortedNumbers).boxed().toArray( Integer[]::new );

        return result;
    }
}
