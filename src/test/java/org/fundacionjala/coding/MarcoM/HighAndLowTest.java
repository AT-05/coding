package org.fundacionjala.coding.MarcoM;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 8/22/2017.
 */
public class HighAndLowTest {

    /**
     * test.
     */
    @Test
    public void testHighAndLow() {
        HighAndLow objHighAndLow = new HighAndLow();
        assertEquals("5 1", objHighAndLow.highAndLow("1 2 3 4 5"));
        assertEquals("5 -3", objHighAndLow.highAndLow("1 2 -3 4 5"));
        assertEquals("9 -5", objHighAndLow.highAndLow("1 9 3 4 -5"));

    }

}
