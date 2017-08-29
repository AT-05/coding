package org.fundacionjala.coding.Franco;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Administrator on 8/29/2017.
 */
public class EANValidationTest {
    /**
     * This method test outputs of checksumValidation method.
     */
    @Test
    public void testChecksumValidation() {
        EANValidation eanValidation = new EANValidation();

        final boolean actualResult1 = eanValidation.checksumValidation("4003301018392");
        assertFalse(actualResult1);

        final boolean actualResult2 = eanValidation.checksumValidation("4003301018398");
        assertTrue(actualResult2);
    }
}
