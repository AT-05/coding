package org.fundacionjala.coding.Abner;

import org.fundacionjala.coding.BarCode;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Abner on 8/29/2017.
 */
public class TestBarCode {
    /**
     * The var to all class.
     */
    private BarCode barCode;

    /**
     * Setup de var for all class.
     */
    @Before
    public void setup() {
        barCode = new BarCode();
    }

    /**
     * The function testing the number  4003301018398.
     */
    @Test
    public void testChecksumTrue() {

        assertEquals(true, barCode.checkCodeBar("4003301018398"));
    }

    /**
     * The function testing the number  4003301018398.
     */

    @Test
    public void testChecksumFalse() {

        assertEquals(false, barCode.checkCodeBar("4003301018392"));
    }


    /**
     * The function testing the number  4003301018390.
     */

    @Test
    public void testChecksumFalseWitZero() {

        assertEquals(false, barCode.checkCodeBar("4003301018390"));
    }

}
