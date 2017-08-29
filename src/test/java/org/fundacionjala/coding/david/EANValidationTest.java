package org.fundacionjala.coding.david;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * This class is for test check number.
 */
public class EANValidationTest {

    /**
     * this method realize test of number.
     */
    @Test
    public void checkSumTest() {
       EANValidation eanValidation = new EANValidation();
       final boolean actualResult = eanValidation.checkSum("4003301018398");
       assertTrue(actualResult);

       final boolean actualResult2 = eanValidation.checkSum("4003301018392");
       assertFalse(actualResult2);

    }
}
