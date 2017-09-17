package org.fundacionjala.coding.david;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * This method realize test to Kata.
 */
public class KataTest {

  private   Kata kata;

    /**
     * This method initialize.
     */
    @Before
    public void setUp() {
        kata = new Kata();
    }

    /**
     * This method realize case one.
     */
    @Test
    public void basicTestsCaseOne() {
        final String actualResult = Arrays.toString(kata.sortTwisted37(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
        final String expectedResult = Arrays.toString(new Integer[]{1, 2, 7, 4, 5, 6, 3, 8, 9});
        assertEquals(expectedResult, actualResult);
    }

    /**
     * This method realize case two.
     */
    @Test
    public void basicTestsCaseTwo() {

        final String actualResult = Arrays.toString(kata.sortTwisted37(new Integer[]{12, 13, 14}));
        final String expectedResult = Arrays.toString(new Integer[]{12, 14, 13});
        assertEquals(expectedResult, actualResult);
    }

    /**
     * This method realize case three.
     */
    @Test
    public void basicTestsCaseThree() {

        final String actualResult = Arrays.toString(kata.sortTwisted37(new Integer[]{9, 2, 4, 7, 3}));
        final String expectedResult = Arrays.toString(new Integer[]{2, 7, 4, 3, 9});
        assertEquals(expectedResult, actualResult);
    }


}
