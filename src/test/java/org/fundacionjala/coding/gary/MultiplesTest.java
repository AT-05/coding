package org.fundacionjala.coding.gary;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Gary on 17/8/2017.
 */
public class MultiplesTest {

    private Multiples multiples;

    /**
     * Setup.
     */
    @Before
    public void setUp() {
        multiples = new Multiples();
    }

    /**
     * Testing.
     */
    @Test
    public void testMultiplesScenario1() {
        final int number = 10;
        final int expectedResult = 23;
        assertEquals(expectedResult, multiples.multiplesSum(number));
    }

    /**
     * Testing.
     */
    @Test
    public void testMultiplesScenario2() {
        final int number = 20;
        final int expectedResult = 78;
        assertEquals(expectedResult, multiples.multiplesSum(number));
    }

    /**
     * Testing.
     */
    @Test
    public void testMultiplesScenario3() {
        final int number = 200;
        final int expectedResult = 9168;
        assertEquals(expectedResult, multiples.multiplesSum(number));
    }

}
