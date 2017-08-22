package org.fundacionjala.coding.abner;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Samuel on 18/08/2017.
 */
public class HighAndLowTest {
    /**
     * Testing high and low Test values.
     */
    @Test
    public void highAndLowTestForFiveValues() {
/**
 * "1 2 3 4 5" values a new line.
 */
        HighAndLow hi = new HighAndLow("1 2 3 4 5");

        assertEquals(5, hi.getHigh());
        assertEquals(1, hi.getLow());
    }

    /**
     * testing High And Low Test For Six Values.
     */
    @Test
    public void highAndLowTestForSixValues() {
/**
 * "1 2 3 4 5" values a new line.
 */
        HighAndLow hi = new HighAndLow("1 2 -3 4 5");

        assertEquals(5, hi.getHigh());
        assertEquals(-3, hi.getLow());
    }
}
