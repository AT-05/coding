package org.fundacionjala.coding.marco;

import org.junit.Before;
import org.junit.Test;


import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * this is my test.
 */
public class EANValidatorTest {

    private EANValidator validator;

    /**
     * This method begin my object.
     */
    @Before
    public void ini() {
        validator = new EANValidator();
    }

    /**
     * Test answer false true.
     */
    @Test
    public void testEANTrue() {
        final String valor = "4003301018398";
        assertTrue(validator.validator(valor)); // True
    }

    /**
     * Test answer false.
     */
    @Test
    public void testEANFalse() {
        final String valor = "4003301018392";
        assertFalse(validator.validator(valor)); // False
    }

    /**
     * Test value Zero.
     */
    @Test
    public void testEANTrueZero() {
        final String valor = "9783827317100";
        assertTrue(validator.validator(valor));
    }

}
