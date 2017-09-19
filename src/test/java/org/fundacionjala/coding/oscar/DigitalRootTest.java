package org.fundacionjala.coding.oscar;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 9/15/2017.
 */
public class DigitalRootTest {

    private DigitalRoot digitalRoot;

    /**
     * This method execute before all test.
     */
    @Before
    public void setUp() {
        digitalRoot = new DigitalRoot();
    }

    /**
     * This test verify the digitalRoot method.
     */
    @Test
    public void test() {
        assertEquals(7, digitalRoot.digitalRoot(16));
        assertEquals(6, digitalRoot.digitalRoot(942));
        assertEquals(6, digitalRoot.digitalRoot(132189));
        assertEquals(2, digitalRoot.digitalRoot(493193));
    }
}
