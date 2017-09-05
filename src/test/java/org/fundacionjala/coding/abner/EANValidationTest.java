package org.fundacionjala.coding.abner;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Abner on 8/29/2017.
 */
public class EANValidationTest {
    /**
     * The var to all class.
     */
    private EANValidation eanValidation;

    /**
     * Setup de var for all class.
     */
    @Before
    public void setup() {
        eanValidation = new EANValidation();
    }

    /**
     * The function testing the number  4003301018398.
     */
    @Test
    public void testChecksumTrue() {

        assertTrue(eanValidation.checkCodeBar("4003301018398"));
    }

    /**
     * The function testing the number  4003301018398.
     */

    @Test
    public void testChecksumFalse() {

        assertFalse(eanValidation.checkCodeBar("4003301018392"));
    }


    /**
     * The function testing the number  4003301018390.
     */

    @Test
    public void testChecksumFalseWitZero() {

        assertFalse(eanValidation.checkCodeBar("4003301018390"));
    }

}
