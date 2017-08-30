package org.fundacionjala.coding.marco;

import org.junit.Test;


import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * this is my test.
 */
public class EANValidatorTest {
    /**
     * Test answer false true.
     */
    @Test
    public void testEANTrue() {
        EANValidator validator = new EANValidator();
        String valor = "4003301018398";
        assertTrue(validator.validator(valor)); // True
    }

    /**
     * Test answer false.
     */
    @Test
    public void testEANFalse() {
        EANValidator validator = new EANValidator();
        String valor = "4003301018392";
        assertFalse(validator.validator(valor)); // False
    }

}
