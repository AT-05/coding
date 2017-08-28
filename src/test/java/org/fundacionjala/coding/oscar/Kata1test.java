package org.fundacionjala.coding.oscar;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Oz64 on 17/08/2017.
 */
public class Kata1test {

    private Kata1 kata;

    /**
     * This method execute before each test.
     */
    @Before
    public void setUp() {
        kata = new Kata1();
    }

    /**
     * test for the function highAndLow.
     */
    @Test
    public void testHighAndLowPositiveNumbers() {
        assertEquals("5 1", kata.highAndLow("1 2 3 4 5"));
    }

    /**
     * test for the function highAndLow.
     */
    @Test
    public void testHighAndLowPositiveAndNegativeNumbers() {
        assertEquals("5 -3", kata.highAndLow("1 2 -3 4 5"));
    }

    /**
     * Test with some positives and negatives numbers.
     */
    @Test
    public void testHighAndLowSome() {
        assertEquals("542 -214", kata.highAndLow("4 5 29 54 4 0 -214 542 -64 1 -3 6 -6"));
    }

    /**
     * Test only with two numbers, positive and a negative.
     */
    @Test
    public void testHighAndLowPlusMinus() {
        assertEquals("1 -1", kata.highAndLow("1 -1"));
    }

    /**
     * Test with two numbers positives and the same value.
     */
    @Test
    public void testHighAndLowPlusPlus() {
        assertEquals("1 1", kata.highAndLow("1 1"));
    }

    /**
     * Test with two numbers negatives and the same value.
     */
    @Test
    public void testHighAndLowMinusMinus() {
        assertEquals("-1 -1", kata.highAndLow("-1 -1"));
    }

    /**
     * Test with three numbers, a positive, a negative and zero.
     */
    @Test
    public void testHighAndLowPlusMinusZero() {
        assertEquals("1 -1", kata.highAndLow("1 -1 0"));
    }

    /**
     * Test with three numbers, two positives of the same value and zero.
     */
    @Test
    public void testHighAndLowPlusPlusZero() {
        assertEquals("1 0", kata.highAndLow("1 1 0"));
    }

    /**
     * Test with three numbers, two negatives of the same value and zero.
     */
    @Test
    public void testHighAndLowMinusMinusZero() {
        assertEquals("0 -1", kata.highAndLow("-1 -1 0"));
    }

    /**
     * Test with only one number.
     */
    @Test
    public void testHighAndLowSingle() {
        assertEquals("42 42", kata.highAndLow("42"));
    }
}
