package org.fundacionjala.coding.abner;

import java.util.Arrays;

/**
 * This class twisted.
 */
public class PlanetTwisted {

    /**
     * This function sort twisted.
     *
     * @param integers old value;
     * @return new twisted value;
     */
    public  Integer[] sort(Integer[] integers) {
        return Arrays.stream(integers)
                .map(new PlanetTwisted()::replaceThreeSeven)
                .sorted(Integer::compare)
                .map(new PlanetTwisted()::replaceThreeSeven)
                .toArray(Integer[]::new);

    }

    /**
     * This function remplase.
     *
     * @param integer old integer.
     * @return new array.
     */
    private  Integer replaceThreeSeven(Integer integer) {
        return Integer.valueOf(integer.toString()
                .replace("7", "_")
                .replace("3", "7")
                .replace("_", "3")
        );
    }
}
