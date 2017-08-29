package org.fundacionjala.coding.marco;

import org.junit.Test;


import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * this is my test.
 */
public class EANValidatorTest {
    /**
     * Test.
     */
    @Test
    public void testEAN() {
        EANValidator validator = new EANValidator();
        assertTrue(validator.validator("4003301018398")); // True
        assertFalse(validator.validator("4003301018392")); // False

    }


}
