package org.fundacionjala.coding.german;

import java.util.Arrays;

/**
 * Created by Administrator on 9/15/2017.
 */
public class PlanetTwisted {
    /**
     * This method swap three seven.
     *
     * @param integer to swap
     * @return Integer
     */
    private Integer swapThreeSeven(Integer integer) {
        return Integer.valueOf(integer.toString()
                .replace("7", "_")
                .replace("3", "7")
                .replace("_", "3")
        );
    }

    /**
     * This method sorted on PlanetTwisted-3-7.
     *
     * @param array sorted
     * @return Interger array
     */
    public Integer[] sort(Integer[] array) {
        return Arrays.stream(array)
                .map(new PlanetTwisted()::swapThreeSeven)
                .sorted(Integer::compare)
                .map(new PlanetTwisted()::swapThreeSeven)
                .toArray(Integer[]::new);
    }

}
