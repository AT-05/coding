package org.fundacionjala.coding.Gary;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Gary on 17/8/2017.
 */

/**
 * test.
 */
public class TestSort {
    /**
     * test for the first case.
     */
    @Test
    public void testFirstCase() {
        Sort sort = new Sort("1 2 3 4 5");
        assertEquals("5 1", sort.highAndLow());
    }

    /**
     * test for the second case.
     */
    @Test
    public void testSecondCase() {
        Sort sort = new Sort("1 2 -3 4 5");
        assertEquals("5 -3", sort.highAndLow());
    }

    /**
     * test for the third case.
     */
    @Test
    public void testThirdCase() {
        Sort sort = new Sort("1 9 3 4 -5");
        assertEquals("9 -5", sort.highAndLow());

    }

    /**
     * test fo multiplies.
     */
    @Test
    public void testaddmultiplies() {
        assertEquals(23, Sort.addMultiplies(10));
        assertEquals(78, Sort.addMultiplies(20));
        assertEquals(9168, Sort.addMultiplies(200));
    }
}
