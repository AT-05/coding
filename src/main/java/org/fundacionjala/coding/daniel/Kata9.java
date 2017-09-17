package org.fundacionjala.coding.daniel;

import java.util.Arrays;

/**
 * Created by Administrator on 13/09/17.
 */
final class Kata9 {

    /**
     * Kata9 Constructor.
     */
    private Kata9() {
    }

    /**
     * @param i A integer.
     * @return A integer Twisted-3-7.
     */
    static Integer swap37(Integer i) {
        return Integer.valueOf(i.toString()
                .replace("7", "_")
                .replace("3", "7")
                .replace("_", "3")
        );
    }

    /**
     * @param array An array of Integers.
     * @return An array the way it would be sorted on Twisted-3-7.
     */
    static Integer[] sortTwisted37(Integer[] array) {
        return Arrays.stream(array)
                .map(Kata9::swap37)
                .sorted(Integer::compare)
                .map(Kata9::swap37)
                .toArray(Integer[]::new);
    }
}

