package org.fundacionjala.coding.marco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This was made by Marco Mendez September 15, 2017.
 */
public class DigitalRootTest {

    private DigitalRoot digital;
    /**
     * This start the object.
     */
    @Before
    public void ini() {
        digital = new DigitalRoot();
    }

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        final int expectedResult = 7;
        final int actualResult = 16;
        assertEquals(expectedResult, digital.root(actualResult));
    }

    /**
     * Test 2.
     */
    @Test
    public void test2() {
        final int expectedResult = 6;
        final int actualResult = 942;
        assertEquals(expectedResult, digital.root(actualResult));
    }

    /**
     * Test 3.
     */
    @Test
    public void test3() {
        final int expectedResult = 6;
        final int actualResult = 132189;
        assertEquals(expectedResult, digital.root(actualResult));
    }

    /**
     * Test 4.
     */
    @Test
    public void test4() {
        final int expectedResult = 2;
        final int actualResult = 493193;
        assertEquals(expectedResult, digital.root(actualResult));
    }
}
