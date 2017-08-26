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
        String stringNumbers = "1 2 3 4 5";
        String result = kata.highAndLow(stringNumbers);
        assertEquals("5 1", result);
    }

    /**
     * test for the function highAndLow.
     */
    @Test
    public void testHighAndLowPositiveAndNegativeNumbers() {
        String stringNumbers = "1 2 -3 4 5";
        String result = kata.highAndLow(stringNumbers);
        assertEquals("5 -3", result);
    }
}
