package org.fundacionjala.coding.gary;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * TestCheckSum.
 */
public class TestCheckSum {

    private CheckSum checkSum;

    /**
     * setup.
     */
    @Before
    public void setup() {
        checkSum = new CheckSum();
    }

    /**
     * testCheckSum1.
     */
    @Test
    public void testCheckSumFirst() {
        final String chain = "4003301018398";
        assertTrue(checkSum.checkSum1(chain));

    }

    /**
     * testCheckSumOtherCase.
     */
    @Test
    public void testCheckSumSecond() {
        final String chain = "4003301018392";
        assertFalse(checkSum.checkSum1(chain));

    }


    /**
     * testCheckSumOtherCase.
     */
    @Test
    public void testCheckSumThird() {
        final String chain = "9783827317100";
        assertTrue(checkSum.checkSum1(chain));

    }


}
