package org.fundacionjala.coding.Marco;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * This kata was made by marco mendez September 12, 2017.
 */
public class PlanetTwistedTest {
    /**
     * Test unChangedArrayTest.
     */
    @Test
    public void unChangedArrayTest() {
        PlanetTwisted twisted = new PlanetTwisted();
        final Integer[] array = new Integer[]{9, 2, 4, 7, 3};
        final Integer[] arrayCpy = new Integer[]{9, 2, 4, 7, 3};
        assertEquals(Arrays.toString(new Integer[]{2, 7, 4, 3, 9}), Arrays.toString(twisted.sortTwisted37(array)));
        assertEquals("You should not modify the input array!", Arrays.toString(arrayCpy), Arrays.toString(array));
    }
}

