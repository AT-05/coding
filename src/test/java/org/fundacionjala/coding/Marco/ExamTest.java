package org.fundacionjala.coding.Marco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This is my finish exam, this was made by marco mendez september 15, 2017
 */
public class _ExamTest {
    private Exam digital;

    /**
     * This start the object.
     */
    @Before
    public void ini() {
        digital = new Exam();
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
