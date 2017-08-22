package org.fundacionjala.coding.german;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by Administrator on 8/18/2017.
 */

public class HighAndLowTest {
    /**
     *
     */

    @Test
    public void testHighAndLow() {
        HighAndLow highAndLow = new HighAndLow();
        assertEquals("5 1", highAndLow.highAndLow("1 2 3 4 5"));
        assertEquals("5 -3", highAndLow.highAndLow("1 2 -3 4 5"));
        assertEquals("4 -5", highAndLow.highAndLow("1 2 3 4 -5"));
    }


}
