package org.fundacionjala.coding.Gary;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Gary on 17/8/2017.
 */

/**
 *  test.
 */
public class TestSort {
    /**
     * test.
     */
    @Test
    public void testFirstCase() {
        Sort sort = new Sort("1 2 3 4 5");
        Assert.assertEquals("5 1", sort.highAndLow());
    }

    /**
     * test.
     */
    @Test
    public void testSecondCase() {
        Sort sort = new Sort("1 2 -3 4 5");
        Assert.assertEquals("5 -3", sort.highAndLow());
    }

    /**
     * test.
     */
    @Test
    public void testThirdCase() {
        Sort sort = new Sort("1 9 3 4 -5");
        Assert.assertEquals("9 -5", sort.highAndLow());

    }
}
