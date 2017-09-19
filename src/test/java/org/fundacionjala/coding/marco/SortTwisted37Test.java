package org.fundacionjala.coding.marco;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * This was made by Marco Mendez September 18, 2017.
 */
public class SortTwisted37Test {

    private SortTwisted37 sortTwisted37;

    /**
     * This executed before all test.
     */
    @Before
    public void setUp() {
        sortTwisted37 = new SortTwisted37();
    }

    /**
     * Test basic.
     */
    @Test
    public void basicTests() {
        assertEquals(Arrays.toString(new Integer[]{1, 2, 7, 4, 5, 6, 3, 8, 9}),
                Arrays.toString(sortTwisted37.sortTwisted(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9})));
        assertEquals(Arrays.toString(new Integer[]{12, 14, 13}),
                Arrays.toString(sortTwisted37.sortTwisted((new Integer[]{12, 13, 14}))));
        assertEquals(Arrays.toString(new Integer[]{2, 7, 4, 3, 9}),
                Arrays.toString(sortTwisted37.sortTwisted(new Integer[]{9, 2, 4, 7, 3})));
    }

    /**
     * Test array.
     */
    @Test
    public void unChangedArrayTest() {
        Integer[] array = new Integer[]{9, 2, 4, 7, 3};
        Integer[] arrayCpy = new Integer[]{9, 2, 4, 7, 3};
        assertEquals(Arrays.toString(new Integer[]{2, 7, 4, 3, 9}), Arrays.toString(sortTwisted37.sortTwisted(array)));
        assertEquals("You should not modify the input array!", Arrays.toString(arrayCpy), Arrays.toString(array));
    }
}
