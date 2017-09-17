package org.fundacionjala.coding.german;


import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 9/15/2017.
 */
public class SortedOnTwistedTest {
    private SortedOnTwisted sortedOnTwisted;

    /**
     * This method execute before any test.
     */
    @Before
    public void setUp() {
        sortedOnTwisted = new SortedOnTwisted();
    }

    /**
     * Verify sortTwistedThreeSeven.
     */
    @Test
    public void testSortTwistedThreeSevenMethod() {
        final String actualResult = Arrays.toString(
                sortedOnTwisted.sortTwistedThreeSeven(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
        final String expectedResult = Arrays.toString(new Integer[]{1, 2, 7, 4, 5, 6, 3, 8, 9});
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Verify sortTwistedThreeSeven.
     */
    @Test
    public void testSortTwistedThreeSevenMethodSecond() {
        final String actualResult = Arrays.toString(
                sortedOnTwisted.sortTwistedThreeSeven(new Integer[]{12, 13, 14}));
        final String expectedResult = Arrays.toString(new Integer[]{12, 14, 13});
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Verify sortTwistedThreeSeven.
     */
    @Test
    public void testSortTwistedThreeSevenMethodThird() {
        final String actualResult = Arrays.toString(
                sortedOnTwisted.sortTwistedThreeSeven(new Integer[]{9, 2, 4, 7, 3}));
        final String expectedResult = Arrays.toString(new Integer[]{2, 7, 4, 3, 9});
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Verify sortTwistedThreeSeven.
     */
    @Test
    public void testSortTwistedThreeSevenMethodUnchangedArray() {
        Integer[] array = new Integer[]{9, 2, 4, 7, 3};
        Integer[] arrayCpy = new Integer[]{9, 2, 4, 7, 3};
        assertEquals(Arrays.toString(new Integer[]{2, 7, 4, 3, 9}),
                Arrays.toString(sortedOnTwisted.sortTwistedThreeSeven(array)));
        assertEquals("You should not modify the input array!", Arrays.toString(arrayCpy),
                Arrays.toString(array));
    }

}

