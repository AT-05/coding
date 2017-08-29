package org.fundacionjala.coding.Gary; /**
 * Created by Gary on 29/8/2017.
 */


import org.junit.Test;


import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * TestCheckSum.
 */
public class TestCheckSum {
    /**
     * testCheckSum1.
     */
    @Test
    public void testCheckSumFirst() {
        String chain = "4003301018398";
        CheckSum checkSum = new CheckSum();
        assertTrue(checkSum.checkSum1(chain));

    }
    /**
     * testCheckSumOtherCase.
     */
    @Test
    public void testCheckSumSecond() {
        String chain = "4003301018392";
        CheckSum checkSum = new CheckSum();
        assertFalse(checkSum.checkSum1(chain));

    }


}
