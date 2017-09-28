package org.fundacionjala.coding.daniel;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 13/09/17.
 */
public class Kata9Test {
    /**
     * Basic unit tests for Kata9.
     */
    public void kata9Tests() {
        assertEquals(Arrays.toString(new Integer[]{1, 2, 7, 4, 5, 6, 3, 8, 9}),
                Arrays.toString(Kata9.sortTwisted37(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9})));
        assertEquals(Arrays.toString(new Integer[]{12, 14, 13}),
                Arrays.toString(Kata9.sortTwisted37(new Integer[]{12, 13, 14})));
        assertEquals(Arrays.toString(new Integer[]{2, 7, 4, 3, 9}),
                Arrays.toString(Kata9.sortTwisted37(new Integer[]{9, 2, 4, 7, 3})));
    }
}
