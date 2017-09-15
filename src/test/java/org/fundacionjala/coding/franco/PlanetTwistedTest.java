package org.fundacionjala.coding.franco;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

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
        final String actualResult = Arrays.toString(planetTwisted.sort(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
        final String expectedResult = Arrays.toString(new Integer[]{1, 2, 7, 4, 5, 6, 3, 8, 9});
        assertEquals(expectedResult, actualResult);
    }

    /*@Test
    public void sortNumbersBasicCase2() {
        assertEquals(Arrays.toString(new Integer[]{12, 13, 14})
        ,Arrays.toString(planetTwisted.sort(new Integer[]{12, 13, 14})));
    }*/

    /**
     * This method test output of sorting numbers 9, 2, 4, 7, 3.
     */
    @Test
    public void sortNumbersBasicCase3() {
        final String actualResult = Arrays.toString(planetTwisted.sort(new Integer[]{9, 2, 4, 7, 3}));
        final String expectedResult = Arrays.toString(new Integer[]{2, 7, 4, 3, 9});
        assertEquals(expectedResult, actualResult);
    }

    /**
     * This method test output of sorting numbers 9, 2, 4, 7, 3.
     */
    @Test
    public void unChangedArrayTest() {
        Integer[] array = new Integer[]{9, 2, 4, 7, 3};
        Integer[] arrayCpy = new Integer[]{9, 2, 4, 7, 3};

        final String actualResult1 = Arrays.toString(planetTwisted.sort(array));
        final String expectedResult1 = Arrays.toString(new Integer[]{2, 7, 4, 3, 9});
        assertEquals(expectedResult1, actualResult1);

        final String actualResult2 = Arrays.toString(array);
        final String expectedResult2 = Arrays.toString(arrayCpy);
        assertEquals("You should not modify the input array!", expectedResult2, actualResult2);
    }
}
