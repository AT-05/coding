package org.fundacionjala.coding.abner;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 9/15/2017.
 */
public class DigitalRootTest {
    /**
     * this is the test.
     */
    @Test
    public void testDigitalRoot() {
        DigitalRoot digitalRoot = new DigitalRoot();

        assertEquals(7, digitalRoot.digitalRoot("16"));
        assertEquals(6, digitalRoot.digitalRoot("942"));
        assertEquals(2, digitalRoot.digitalRoot("493193"));
    }
}
