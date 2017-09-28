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
        final int number = 16;
        final int expectedResult = 7;
        assertEquals(expectedResult, digitalRoot.digitalRoot(number));
    }

    /**
     * this is the test.
     */
    @Test
    public void testDigitalRootWithThreeDigits() {
        final int number = 942;
        final int expectedResult = 6;
        assertEquals(expectedResult, digitalRoot.digitalRoot(number));
    }

    /**
     * this is the test.
     */
    @Test
    public void testDigitalRootWithSixDigits() {
        final int number = 493193;
        final int expectedResult = 2;
        assertEquals(expectedResult, digitalRoot.digitalRoot(number));
    }
}
