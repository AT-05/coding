package org.fundacionjala.coding.abner;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * this class persist.
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
        final int expectedResult = 0;
        assertEquals(expectedResult, persist.persistence("4"));
    }

    /**
     * this is the test.
     */
    @Test
    public void testPersistenceScenario2() {
        final int expectedResult = 3;
        assertEquals(expectedResult, persist.persistence("39"));
    }

    /**
     * this is the test.
     */
    @Test
    public void testPersistenceScenario3() {
        final int expectedResult = 3;
        assertEquals(expectedResult, persist.persistence("444"));
    }

    /**
     * this is the test.
     */
    @Test
    public void testPersistenceScenario4() {
        final int expectedResult = 4;
        assertEquals(expectedResult, persist.persistence("999"));
    }

}
