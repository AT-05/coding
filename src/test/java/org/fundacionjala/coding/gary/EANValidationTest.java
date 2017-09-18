package org.fundacionjala.coding.gary;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * EANValidationTest.
 */
public class EANValidationTest {

    private EANValidation eanValidation;

    /**
     * setup.
     */
    @Before
    public void setup() {
        eanValidation = new EANValidation();
    }

    /**
     * testCheckSum1.
     */
    @Test
    public void testCheckSumFirst() {
        final String chain = "4003301018398";
        assertTrue(eanValidation.checkSum1(chain));

    }

    /**
     * testCheckSumOtherCase.
     */
    @Test
    public void testCheckSumSecond() {
        final String chain = "4003301018392";
        assertFalse(eanValidation.checkSum1(chain));

    }


    /**
     * testCheckSumOtherCase.
     */
    @Test
    public void testCheckSumThird() {
        final String chain = "9783827317100";
        assertTrue(eanValidation.checkSum1(chain));

    }


}
