package org.fundacionjala.coding.Marco_Kata1and2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 8/23/2017.
 */
public class HighAndLowTest {

    private HighAndLow highAndLow;

    /**
     * test setUp.
     */
    @Before
    public void setUp() {
        highAndLow = new HighAndLow();
    }
    /**
     * test.
     */
    @Test
    public void testHighAndLow() {
        assertEquals("5 1", highAndLow.highAndLow("1 2 3 4 5"));
        assertEquals("5 -3", highAndLow.highAndLow("1 2 -3 4 5"));
        assertEquals("9 -5", highAndLow.highAndLow("1 9 3 4 -5"));

    }
    /**
     * test.
     */
    @Test
    public void testHighAndLowSome() {
        assertEquals("542 -214", highAndLow.highAndLow("4 5 29 54 4 0 -214 542 -64 1 -3 6 -6"));
    }

    /**
     * test.
     */
    @Test
    public void testHighAndLowPlusMinus() {
        assertEquals("1 -1", highAndLow.highAndLow("1 -1"));
    }
    /**
     * test.
     */
    @Test
    public void testHighAndLowPlusPlus() {
        assertEquals("1 1", highAndLow.highAndLow("1 1"));
    }
    /**
     * test.
     */
    @Test
    public void testHighAndLowMinusMinus() {
        assertEquals("-1 -1", highAndLow.highAndLow("-1 -1"));
    }
    /**
     * test.
     */
    @Test
    public void testHighAndLowPlusMinusZero() {
        assertEquals("1 -1", highAndLow.highAndLow("1 -1 0"));
    }
    /**
     * test.
     */
    @Test
    public void testHighAndLowPlusPlusZero() {
        assertEquals("1 0", highAndLow.highAndLow("1 1 0"));
    }
    /**
     * test.
     */
    @Test
    public void testHighAndLowMinusMinusZero() {
        assertEquals("0 -1", highAndLow.highAndLow("-1 -1 0"));
    }
    /**
     * test.
     */
    @Test
    public void testHighAndLowSingle() {
        assertEquals("42 42", highAndLow.highAndLow("42"));
    }
}
