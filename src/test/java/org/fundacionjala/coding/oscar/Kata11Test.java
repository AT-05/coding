package org.fundacionjala.coding.oscar;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 9/15/2017.
 */
public class Kata11Test {
    private Kata11 kata11;

    /**
     * This method execute before all test.
     */
    @Before
    public void setUp() {
        kata11 = new Kata11();
    }

    /**
     * This test verify the digitalRoot method.
     */
    @Test
    public void test() {
        assertEquals(7, kata11.digitalRoot(16));
        assertEquals(6, kata11.digitalRoot(942));
        assertEquals(6, kata11.digitalRoot(132189));
        assertEquals(2, kata11.digitalRoot(493193));
    }
}
