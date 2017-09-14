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

    @Test
    public void sortNumbersBasicCase() {
        assertEquals(Arrays.toString(new Integer[] {1,2,7,4,5,6,3,8,9}), Arrays.toString(planetTwisted.sortNumbers(new Integer[] {1,2,3,4,5,6,7,8,9})));
    }

    @Test
    public void sortNumbers() {
        assertEquals(Arrays.toString(new Integer[] {12,14,13}), Arrays.toString(planetTwisted.sortNumbers(new Integer[] {12,13,14})));
    }
}
