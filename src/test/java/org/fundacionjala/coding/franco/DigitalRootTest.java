package org.fundacionjala.coding.franco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 9/15/2017.
 */
public class DigitalRootTest {
    private DigitalRoot digitalRoot;

    /**
     * This method tests instancing of Class DigitalRoot.
     */
    @Before
    public void setDigitalRoot() {
        digitalRoot = new DigitalRoot();
    }

    /**
     * This method tests output of sum of digits of number 16.
     */
    @Test
    public void sumWithInput16() {
        final int actualResult = digitalRoot.sum(16);
        final int expectedResult = 7;
        assertEquals(expectedResult, actualResult);
    }

    /**
     * This method tests output of sum of digits of number 942.
     */
    @Test
    public void sumWithInput942() {
        final int actualResult = digitalRoot.sum(942);
        final int expectedResult = 6;
        assertEquals(expectedResult, actualResult);
    }

    /**
     * This method tests output of sum of digits of number 132189.
     */
    @Test
    public void sumWithInput132189() {
        final int actualResult = digitalRoot.sum(132189);
        final int expectedResult = 6;
        assertEquals(expectedResult, actualResult);
    }

    /**
     * This method tests output of sum of digits of number 493193.
     */
    @Test
    public void sumWithInput493193() {
        final int actualResult = digitalRoot.sum(493193);
        final int expectedResult = 2;
        assertEquals(expectedResult, actualResult);
    }
}
