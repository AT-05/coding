package org.fundacionjala.coding.marco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This was made by Marco Mendez September 15, 2017.
 */
public class PersistentBuggerTest {

    private PersistentBugger persistence;

    /**
     * this method start the object.
     */
    @Before
    public void ini() {
        persistence = new PersistentBugger();
    }

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        final int expectResult = 3;
        final int actualResult = 39;
        assertEquals(expectResult, persistence.persistence(actualResult));
    }

    /**
     * Test 2.
     */
    @Test
    public void test2() {
        final int expectResult = 2;
        final int actualResult = 25;
        assertEquals(expectResult, persistence.persistence(actualResult));

    }

    /**
     * Test 3.
     */
    @Test
    public void test3() {
        final int expectResult = 4;
        final int actualResult = 999;
        assertEquals(expectResult, persistence.persistence(actualResult));

    }

    /**
     * Test 4.
     */
    @Test
    public void test4() {
        final int expectResult = 3;
        final int actualResult = 444;
        assertEquals(expectResult, persistence.persistence(actualResult));
    }

    /**
     * Test 5.
     */
    @Test
    public void test5() {
        final int expectResult = 0;
        final int actualResult = 4;
        assertEquals(expectResult, persistence.persistence(actualResult));
    }
}
