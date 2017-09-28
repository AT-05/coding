package org.fundacionjala.coding.oscar;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Oz64 on 15/09/2017.
 */
public class PersistTest {

    private Persist persist;

    /**
     * Setup.
     */
    @Before
    public void setUp() {
        persist = new Persist();
    }

    /**
     * this is the test.
     */
    @Test
    public void testPersistenceScenario1() {
        final int number = 4;
        final int expectedResult = 0;
        assertEquals(expectedResult, persist.persistence(number));
    }

    /**
     * this is the test.
     */
    @Test
    public void testPersistenceScenario2() {
        final int number = 39;
        final int expectedResult = 3;
        assertEquals(expectedResult, persist.persistence(number));
    }

    /**
     * this is the test.
     */
    @Test
    public void testPersistenceScenario3() {
        final int number = 444;
        final int expectedResult = 3;
        assertEquals(expectedResult, persist.persistence(number));
    }

    /**
     * this is the test.
     */
    @Test
    public void testPersistenceScenario4() {
        final int number = 999;
        final int expectedResult = 4;
        assertEquals(expectedResult, persist.persistence(number));
    }

}
