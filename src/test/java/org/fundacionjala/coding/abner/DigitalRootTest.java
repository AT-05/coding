package org.fundacionjala.coding.abner;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 9/15/2017.
 */
public class DigitalRootTest {

    private DigitalRoot digitalRoot;

    /**
     * Setup.
     */
    @Before
    public void setUp() {
        digitalRoot = new DigitalRoot();
    }

    /**
     * this is the test.
     */
    @Test
    public void testDigitalRootWithTwoDigits() {
        final int expectedResult = 7;
        assertEquals(expectedResult, digitalRoot.digitalRoot("16"));
    }

    /**
     * this is the test.
     */
    @Test
    public void testDigitalRootWithThreeDigits() {
        final int expectedResult = 6;
        assertEquals(expectedResult, digitalRoot.digitalRoot("942"));
    }

    /**
     * this is the test.
     */
    @Test
    public void testDigitalRootWithSixDigits() {
        final int expectedResult = 2;
        assertEquals(expectedResult, digitalRoot.digitalRoot("493193"));
    }
}
