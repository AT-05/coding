package org.fundacionjala.coding.german;


import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Administrator on 8/29/2017.
 */
public class EANValidatorTest {

    /**
     * Verify validate method.
     */
    @Test
    public void testValidateMethodIsTrue() {
        EANValidator eanValidatorTest = new EANValidator();
        boolean result = eanValidatorTest.validate("4003301018398");
        assertTrue("validate Method should return 'true'", result);
    }

    /**
     * Verify validate method.
     */
    @Test
    public void testValidateMethodIsFalse() {
        EANValidator eanValidatorTest = new EANValidator();
        boolean result = eanValidatorTest.validate("4003301018392");
        assertFalse("validate Method should return 'true'", result);
    }

}
