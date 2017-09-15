package org.fundacionjala.coding.german;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 9/15/2017.
 */
public class DigitalRootTest {
    private DigitalRoot digitalRoot;

    /**
     * This method execute before any test.
     */
    @Before
    public void setUp() {
        digitalRoot = new DigitalRoot();
    }

    /**
     * Verify digitalRoot method.
     */
    @Test
    public void testDigitalRootWithTwoDigits() {
        final int expectedResult = 7;
        final int actualResul = digitalRoot.digitalRoot(16);
        assertEquals(expectedResult, actualResul);

    }

    /**
     * Verify digitalRoot method.
     */
    @Test
    public void testDigitalRootWithThreeDigits() {
        final int expectedResult = 6;
        final int actualResul = digitalRoot.digitalRoot(942);
        assertEquals(expectedResult, actualResul);

    }

    /**
     * Verify digitalRoot method.
     */
    @Test
    public void testDigitalRootWithSixDigits() {
        final int expectedResult = 6;
        final int actualResul = digitalRoot.digitalRoot(132189);
        assertEquals(expectedResult, actualResul);

    }

    /**
     * Verify digitalRoot method.
     */
    @Test
    public void testDigitalRootWithOthersSixDigits() {
        final int expectedResult = 2;
        final int actualResul = digitalRoot.digitalRoot(493193);
        assertEquals(expectedResult, actualResul);

    }
}
