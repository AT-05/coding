package org.fundacionjala.coding.german;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by German on 16/09/2017.
 */
public class PersistTest {
    private Persist persist;

    /**
     * This method executed before any test.
     */
    @Before
    public void setUp() {
        persist = new Persist();
    }

    /**
     * Verify persistence Method.
     */
    @Test
    public void testPersistenceMethodWithThirtyNine() {
        final int actualResult = persist.persistence(39);
        final int expectedResult = 3;
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Verify persistence Method.
     */
    @Test
    public void testPersistenceMethodWithFour() {
        final int actualResult = persist.persistence(4);
        final int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Verify persistence Method.
     */
    @Test
    public void testPersistenceMethodWithTwentyFive() {
        final int actualResult = persist.persistence(25);
        final int expectedResult = 2;
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Verify persistence Method.
     */
    @Test
    public void testPersistenceMethodWithNineHundredNinetyNine() {
        final int actualResult = persist.persistence(999);
        final int expectedResult = 4;
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Verify persistence Method.
     */
    @Test
    public void testPersistenceMethodWithFourHundredFortyFour() {
        final int actualResult = persist.persistence(444);
        final int expectedResult = 3;
        assertEquals(expectedResult, actualResult);
    }

}
