package org.fundacionjala.coding.oscar;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by Oz64 on 14/09/2017.
 */
public class SortTwisted37Test {
    /**
     * Test basic.
     */
    @Test
    public void basicTests() {
        SortTwisted37 sortTwisted37 = new SortTwisted37();
        assertEquals(Arrays.toString(new Integer[]{1, 2, 7, 4, 5, 6, 3, 8, 9}),
                Arrays.toString(sortTwisted37
                        .sortTwisted(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9})));
        /*assertEquals(Arrays.toString(new Integer[]{12, 14, 13}),
                Arrays.toString(sortTwisted37
                        .sortTwisted((new Integer[]{12, 13, 14}))));*/
        assertEquals(Arrays.toString(new Integer[]{2, 7, 4, 3, 9}),
                Arrays.toString(sortTwisted37
                        .sortTwisted(new Integer[]{9, 2, 4, 7, 3})));
    }

    /**
     * Test array.
     */
    @Test
    public void unChangedArrayTest() {
        SortTwisted37 sortTwisted37 = new SortTwisted37();
        Integer[] array = new Integer[]{9, 2, 4, 7, 3};
        Integer[] arrayCpy = new Integer[]{9, 2, 4, 7, 3};
        assertEquals(Arrays.toString(new Integer[]{2, 7, 4, 3, 9}), Arrays.toString(sortTwisted37.sortTwisted(array)));
        assertEquals("You should not modify the input array!", Arrays.toString(arrayCpy), Arrays.toString(array));
    }
}
