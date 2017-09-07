package org.fundacionjala.coding.Gary; /**
 * Created by Gary on 29/8/2017.
 */


import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

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
        String chain = "4003301018398";
        assertTrue(checkSum.checkSum1(chain));

    }

    /**
     * testCheckSumOtherCase.
     */
    @Test
    public void testCheckSumSecond() {
        String chain = "4003301018392";
        assertFalse(checkSum.checkSum1(chain));

    }


    /**
     * testCheckSumOtherCase.
     */
    @Test
    public void testCheckSumThird() {
        String chain = "978382731700";
        assertFalse(checkSum.checkSum1(chain));

    }


}
