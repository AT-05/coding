package org.fundacionjala.coding.german;


import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by German on 8/29/2017.
 */
public class EANValidatorTest {
    private EANValidator eanValidatorTest;
    private boolean result;

    /**
     * This method execute before any test.
     */
    @Before
    public void setUp() {
        eanValidatorTest = new EANValidator();
    }

    /**
     * Verify validate method.
     */
    @Test
    public void testValidateMethodIsTrue() {

        result = eanValidatorTest.validate("4003301018398");
        assertTrue("validate Method should return 'true'", result);
    }

    /**
     * Verify validate method.
     */
    @Test
    public void testValidateMethodIsFalse() {
        result = eanValidatorTest.validate("4003301018392");
        assertFalse("validate Method should return 'true'", result);
    }

    /**
     * Verify validate method.
     */
    @Test
    public void testValidateMethodIsCheckSumZero() {
        assertTrue(eanValidatorTest.validate("9783827317100"));
    }

}
