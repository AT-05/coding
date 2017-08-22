package org.fundacionjala.coding.franco;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 8/22/2017.
 */
public class HighAndLowTest {
    /**
     * This method test HighAndLow Class.
     */
    @Test
    public void testHighAndLow() {
        HighAndLow highAndLow1 = new HighAndLow();

        assertEquals("5 1", highAndLow1.highAndLowNumbers("1 2 3 4 5"));
        assertEquals("5 -3", highAndLow1.highAndLowNumbers("1 2 -3 4 5"));
        assertEquals("9 -5", highAndLow1.highAndLowNumbers("1 9 3 4 -5"));
    }
}
