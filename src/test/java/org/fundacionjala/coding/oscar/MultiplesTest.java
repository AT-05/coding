package org.fundacionjala.coding.oscar;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Oz64 on 18/08/2017.
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
     * Testing test For Three Numbers.
     */
    @Test
    public void testMultiplesScenario1() {
        final int number = 10;
        final int expectedResult = 23;
        assertEquals(expectedResult, multiples.multiplyOf3and5(number));
    }

    /**
     * Testing test For Three Numbers.
     */
    @Test
    public void testMultiplesScenario2() {
        final int number = 20;
        final int expectedResult = 78;
        assertEquals(expectedResult, multiples.multiplyOf3and5(number));
    }

    /**
     * Testing test For Three Numbers.
     */
    @Test
    public void testMultiplesScenario3() {
        final int number = 200;
        final int expectedResult = 9168;
        assertEquals(expectedResult, multiples.multiplyOf3and5(number));
    }

}
