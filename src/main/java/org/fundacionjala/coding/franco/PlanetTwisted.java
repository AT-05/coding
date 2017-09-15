package org.fundacionjala.coding.franco;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by Administrator on 9/14/2017.
 */
public class PlanetTwisted {
    private static final int CONS_THREE = 3;
    private static final int CONS_SEVEN = 7;

    /**
     * This method changes all 3 and 7 instances of a set of numbers.
     *
     * @param chainOfNumbers is a set of numbers.
     * @return the set of numbers with values 3 and 7 changed
     * by the other.
     */
    public Integer[] sort(Integer[] chainOfNumbers) {
        final int[] numbers = Arrays.stream(chainOfNumbers).mapToInt(Integer::intValue).toArray();
        equivalent(numbers);
        Arrays.sort(numbers);
        equivalent(numbers);
        Integer[] result = IntStream.of(numbers).boxed().toArray(Integer[]::new);
        return result;
    }

    /**
     * This method replaces number 3 for 7 and vice versa.
     *
     * @param number to work with.
     * @return the equivalent of the number if applies.
     */
    public int replace(int number) {
        String numbers = String.valueOf(number);

        String result = numbers.replace("7", "B")
                .replace("3", "A")
                .replace("B", "3")
                .replace("A", "7");
        return Integer.parseInt(result);
    }

    /**
     * This method replaces equivalents of numbers if apply.
     *
     * @param numbers is a set to work with.
     * @return the set of numbers with its updated equivalents.
     */
    public int[] equivalent(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = replace(numbers[i]);
        }
        return numbers;
    }
}
