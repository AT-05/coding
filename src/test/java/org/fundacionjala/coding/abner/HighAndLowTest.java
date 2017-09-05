package org.fundacionjala.coding.abner;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Abner on 18/08/2017.
 */
public class HighAndLowTest {

    private HighAndLow highAndLow;

    /**
     * Initializing values.
     */
    @Before
    public void setUp() {

        highAndLow = new HighAndLow();
    }

    /**
     * Testing high and low Test values.
     */
    @Test
    public void highAndLowTestForFiveValues() {
        assertEquals("5 1", highAndLow.highAndLowGet("1 2 3 4 5"));
    }

    /**
     * testing High And Low Test For Six Values.
     */
    @Test
    public void highAndLowTestForSixValues() {
        assertEquals("5 -3", highAndLow.highAndLowGet("1 2 -3 4 5"));
    }

    /**
     * Testing high and low Test values.
     */
    @Test
    public void testHighAndLowSome() {
        assertEquals("542 -214", highAndLow.highAndLowGet("4 5 29 54 4 0 -214 542 -64 1 -3 6 -6"));
    }

    /**
     * Testing high and low Test values.
     */
    @Test
    public void testHighAndLowPlusMinus() {
        assertEquals("1 -1", highAndLow.highAndLowGet("1 -1"));
    }

    /**
     * Testing high and low Test values.
     */
    @Test
    public void testHighAndLowPlusPlus() {
        assertEquals("1 1", highAndLow.highAndLowGet("1 1"));
    }

    /**
     * Testing high and low Test values.
     */
    @Test
    public void testHighAndLowMinusMinus() {
        assertEquals("-1 -1", highAndLow.highAndLowGet("-1 -1"));
    }

    /**
     * Testing high and low Test values.
     */
    @Test
    public void testHighAndLowPlusMinusZero() {
        assertEquals("1 -1", highAndLow.highAndLowGet("1 -1 0"));
    }

    /**
     * Testing high and low Test values.
     */
    @Test
    public void testHighAndLowPlusPlusZero() {
        assertEquals("1 0", highAndLow.highAndLowGet("1 1 0"));
    }

    /**
     * Testing high and low Test values.
     */
    @Test
    public void testHighAndLowMinusMinusZero() {
        assertEquals("0 -1", highAndLow.highAndLowGet("-1 -1 0"));
    }

    /**
     * Testing high and low Test values.
     */
    @Test
    public void testHighAndLowSingle() {
        assertEquals("42 42", highAndLow.highAndLowGet("42"));
    }

}
