package org.fundacionjala.coding.abner.twisted;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * This class testing twisted.
 * Created by Administrator on 9/15/2017.
 */
public class TwistedTest {

    private Twisted twisted;

    /**
     * This is a start the vars.
     */
    @Before
    public void setUp() {
        twisted = new Twisted();
    }

    /**
     * This first test twisted.
     */
    @Test
    public void basicTests() {
        Integer[] actual = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer[] expected = new Integer[]{1, 2, 7, 4, 5, 6, 3, 8, 9};
        assertEquals(Arrays.toString(expected), Arrays.toString(twisted.sortTwisted(actual)));

        Integer[] actual1 = new Integer[]{12, 13, 14};
        Integer[] expected1 = new Integer[]{12, 14, 13};
        assertEquals(Arrays.toString(expected1), Arrays.toString(twisted.sortTwisted(actual1)));

        Integer[] actual2 = new Integer[]{9, 2, 4, 7, 3};
        Integer[] expected2 = new Integer[]{2, 7, 4, 3, 9};

        assertEquals(Arrays.toString(expected2), Arrays.toString(twisted.sortTwisted(actual2)));
    }

    /**
     * This test second twisted.
     */
    @Test
    public void unChangedArrayTest() {
        Integer[] array = new Integer[]{9, 2, 4, 7, 3};
        Integer[] arrayCpy = new Integer[]{9, 2, 4, 7, 3};
        assertEquals(Arrays.toString(new Integer[]{2, 7, 4, 3, 9}), Arrays.toString(twisted.sortTwisted(array)));
        assertEquals("You should not modify the input array!", Arrays.toString(arrayCpy), Arrays.toString(array));
    }
}
