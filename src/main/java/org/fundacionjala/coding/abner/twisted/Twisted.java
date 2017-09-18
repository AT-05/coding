package org.fundacionjala.coding.abner.twisted;

import java.util.Arrays;

/**
 * This class twisted.
 * Created by Administrator on 9/15/2017.
 */
public class Twisted {


    /**
     * This function sort twisted.
     *
     * @param integers old value;
     * @return new twsted value;
     */
    public  Integer[] sortTwisted(Integer[] integers) {
        return Arrays.stream(integers)
                .map(new Twisted()::replaceThreeSeven)
                .sorted(Integer::compare)
                .map(new Twisted()::replaceThreeSeven)
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
