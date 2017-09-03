package org.fundacionjala.coding.Franco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Administrator on 8/29/2017.
 */
public class EANValidationTest {

    private EANValidation eanValidation;

    /**
     * This method tests creation ob Object eanValidation.
     */
    @Before
    public void setUp() {
        eanValidation = new EANValidation();
    }

    /**
     * This method tests for invalid EAN checksum.
     */
    @Test
    public void testChecksumValidationIsFalse() {

        final boolean actualResult = eanValidation.checksumValidation("4003301018392");
        assertFalse(actualResult);
    }

    /**
     * This method tests for valid EAN checksum.
     */
    @Test
    public void testChecksumValidationIsTrue() {

        final boolean actualResult = eanValidation.checksumValidation("4003301018398");
        assertTrue(actualResult);
    }

    /**
     * This method tests for valid EAN checksum equals Zero.
     */
    @Test
    public void testChecksumValidationIsTrueOnZeroChecksumValue() {

        final boolean actualResult = eanValidation.checksumValidation("9783827317100");
        assertTrue(actualResult);
    }
}
