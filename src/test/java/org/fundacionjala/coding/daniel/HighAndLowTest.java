package org.fundacionjala.coding.daniel;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Class HighAndLowTest.
 */
public class HighAndLowTest {

    private HighAndLow kata = new HighAndLow();

    /**
     * Test1.
     */
    @Test
    public void someTest() {
        assertThat(kata.highAndLow("4 5 29 54 4 0 -214 542 -64 1 -3 6 -6"), is("542 -214"));
    }

    /**
     * Test2.
     */
    @Test
    public void plusMinusTest() {
        assertThat(kata.highAndLow("1 -1"), is("1 -1"));
    }

    /**
     * Test3.
     */
    @Test
    public void plusPlusTest() {
        assertThat(kata.highAndLow("1 1"), is("1 1"));
    }

    /**
     * Test4.
     */
    @Test
    public void minusMinusTest() {
        assertThat(kata.highAndLow("-1 -1"), is("-1 -1"));
    }

    /**
     * Test5.
     */
    @Test
    public void plusMinusZeroTest() {
        assertThat(kata.highAndLow("1 -1 0"), is("1 -1"));
    }

    /**
     * Test6.
     */
    @Test
    public void plusPlusZeroTest() {
        assertThat(kata.highAndLow("1 1 0"), is("1 0"));
    }

    /**
     * Test7.
     */
    @Test
    public void minusMinusZeroTest() {
        assertThat(kata.highAndLow("-1 -1 0"), is("0 -1"));
    }

    /**
     * Test8.
     */
    @Test
    public void singleTest() {
        assertThat(kata.highAndLow("42"), is("42 42"));
    }

}

