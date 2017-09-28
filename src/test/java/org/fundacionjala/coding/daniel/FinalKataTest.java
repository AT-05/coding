package org.fundacionjala.coding.daniel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 15/09/17.
 */


public class FinalKataTest {
    /**
     * Test 1.
     */
    @Test
    public void theSumOfDigitsOfDigitalRootOfSixteenIsSeven() {
        assertEquals("", FinalKata.digitalroot(16), 7);
    }

    /**
     * Test 2.
     */
    @Test
    public void theSumOfDigitsOfDigitalRootOf942Is6() {
        assertEquals("", FinalKata.digitalroot(942), 6);
    }

    /**
     * Test 3.
     */
    @Test
    public void theSumOfDigitsOfDigitalRootOf132189Is6() {
        assertEquals("", FinalKata.digitalroot(132189), 6);
    }

    /**
     * Test 4.
     */
    @Test
    public void theSumOfDigitsOfDifgitalRootOf493193Is2() {
        assertEquals("", FinalKata.digitalroot(493193), 2);
    }
}
