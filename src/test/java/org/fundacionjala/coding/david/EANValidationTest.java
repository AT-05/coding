package org.fundacionjala.coding.david;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * This class is for test check number.
 */
public class EANValidationTest {

  private  EANValidation eanValidation;

    /**
     * This method is initialize value eanValidation.
     */
    @Before
    public void setUp() {
        eanValidation = new EANValidation();
    }

    /**
     * this method realize test of number.
     */
    @Test
    public void checkSumTest() {

        final boolean actualResult = eanValidation.checkSum("4003301018398");
        assertTrue(actualResult);
    }

    /**
     * this method realize test of number 0.
     */
    @Test
    public void checkSumWithValueZero() {

        final boolean actualResult2 = eanValidation.checkSum("4003301018392");
        assertFalse(actualResult2);

    }

}
