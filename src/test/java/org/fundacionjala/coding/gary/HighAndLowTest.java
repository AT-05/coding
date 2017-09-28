package org.fundacionjala.coding.gary;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Gary on 17/8/2017.
 */
public class HighAndLowTest {
    /**
     * test for the first case.
     */
    @Test
    public void testFirstCase() {
        HighAndLow highAndLow = new HighAndLow("1 2 3 4 5");
        assertEquals("5 1", highAndLow.highAndLow());
    }

    /**
     * test for the second case.
     */
    @Test
    public void testSecondCase() {
        HighAndLow highAndLow = new HighAndLow("1 2 -3 4 5");
        assertEquals("5 -3", highAndLow.highAndLow());
    }

    /**
     * test for the third case.
     */
    @Test
    public void testThirdCase() {
        HighAndLow highAndLow = new HighAndLow("1 9 3 4 -5");
        assertEquals("9 -5", highAndLow.highAndLow());

    }
}
