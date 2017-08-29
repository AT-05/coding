package org.fundacionjala.coding.oscar;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Administrator on 8/29/2017.
 */
public class Kata6Test {
    private Kata6 eanValidator;

    /**
     * This method execute before any test.
     */
    @Before
    public void setup() {
        eanValidator = new Kata6();
    }

    /**
     * This test validates a correct number.
     */
    @Test
    public void testValidateEAN() {
        boolean expectResult = eanValidator.validate("4003301018398");
        assertTrue(expectResult);
    }

    /**
     * This test validates when a number is incorrect.
     */
    @Test
    public void testInvalidateEAN() {
        boolean expectResult = eanValidator.validate("4003301018392");
        assertFalse(expectResult);
    }

    /**
     * This test validates a number with 12 twelve numbers of length.
     */
    @Test
    public void testWithTwelveNumbersInvalidateEAN() {
        boolean expectResult = eanValidator.validate("400330101839");
        assertFalse(expectResult);
    }
}
