package org.fundacionjala.coding.franco;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 9/14/2017.
 */
public class PlanetTwistedTest {
    private PlanetTwisted planetTwisted;

    /**
     * This method tests instancing of Class PlanetTwisted.
     */
    @Before
    public void setUp() {
        planetTwisted = new PlanetTwisted();
    }

    /**
     * This method test output of sorting numbers 1, 2, 3, 4, 5, 6, 7, 8, 9.
     */
    @Test
    public void sortNumbersBasicCase1() {
        assertEquals(Arrays.toString(new Integer[]{1, 2, 7, 4, 5, 6, 3, 8, 9}), Arrays.toString(planetTwisted.sortNumbers(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9})));
    }

    /*@Test
    public void sortNumbersBasicCase2() {
        assertEquals(Arrays.toString(new Integer[]{12, 13, 14}), Arrays.toString(planetTwisted.sortNumbers(new Integer[]{12, 13, 14})));
    }*/

    /**
     * This method test output of sorting numbers 9, 2, 4, 7, 3.
     */
    @Test
    public void sortNumbersBasicCase3() {
        assertEquals(Arrays.toString(new Integer[]{2, 7, 4, 3, 9}), Arrays.toString(planetTwisted.sortNumbers(new Integer[]{9, 2, 4, 7, 3})));
    }

    /**
     * This method test output of sorting numbers 9, 2, 4, 7, 3.
     */
    @Test
    public void unChangedArrayTest() {
        Integer[] array = new Integer[]{9, 2, 4, 7, 3};
        Integer[] arrayCpy = new Integer[]{9, 2, 4, 7, 3};
        assertEquals(Arrays.toString(new Integer[]{2, 7, 4, 3, 9}), Arrays.toString(planetTwisted.sortNumbers(array)));
        assertEquals("You should not modify the input array!", Arrays.toString(arrayCpy), Arrays.toString(array));
    }
}
