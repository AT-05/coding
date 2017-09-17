package org.fundacionjala.coding.abner.digital;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 9/15/2017.
 */
public class DigitalTest {
    /**
     * this is the test.
     */
    @Test
    public void testDigitalRoot() {
        Digital digital = new Digital();

        assertEquals(7, digital.digitalRoot("16"));
        assertEquals(6, digital.digitalRoot("942"));
        assertEquals(2, digital.digitalRoot("493193"));


    }
}
