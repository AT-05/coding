package org.fundacionjala.coding.abner;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * This class test the numbers.
 */
public class BankOCRTest {

    /**
     * This bar set for all class.
     */
    private BankOCR bankOCR;

    /**
     * this function setup de var for all class.
     */
    @Before
    public void setup() {
        bankOCR = new BankOCR();
    }

    /**
     * This test check whit nine value.
     */
    @Test
    public void testMapNumberCheckValue() {
        final String stringLine1 = "    _  _     _  _  _  _  _ ";
        final String stringLine2 = "  | _| _||_||_ |_   ||_||_|";
        final String stringLine3 = "  ||_  _|  | _||_|  ||_| _|";
        final String expectedResult = "123456789";

        assertEquals(expectedResult, bankOCR.checkValue(stringLine1, stringLine2, stringLine3));
    }

    /**
     * This test check whit three.
     */
    @Test
    public void testMapNumberWithThree() {
        final String stringLine1 = " _  _  _  _  _  _  _  _  _ ";
        final String stringLine2 = " _| _| _| _| _| _| _| _| _|";
        final String stringLine3 = " _| _| _| _| _| _| _| _| _|";
        final String expectedResult = "333333333";
        assertEquals(expectedResult, bankOCR.checkValue(stringLine1, stringLine2, stringLine3));
    }

    /**
     * This test check whit one value.
     */
    @Test
    public void testMapNumberWithOneValue() {
        final String stringLine1 = "   ";
        final String stringLine2 = "  |";
        final String stringLine3 = "  |";
        final String expectedResult = "1";
        assertEquals(expectedResult, bankOCR.checkValue(stringLine1, stringLine2, stringLine3));
    }

    /**
     * This test check is credit car is valid.
     */
    @Test
    public void testCheckSumCalculation() {
        final int entryNumber = 345882865;
        final boolean actualResult = bankOCR.checkSumCalculation(entryNumber);
        assertTrue(actualResult);
    }

    /**
     * This test check is credit car is not valid.
     */
    @Test
    public void testCheckSumCalculationFalse() {
        final int entryNumber = 900000000;
        final boolean actualResult = bankOCR.checkSumCalculation(entryNumber);
        assertFalse(actualResult);
    }

    /**
     * This tes for Story 3.
     */
    @Test
    public void testCheckFileAssertResult() {
        final String expectedResult = "457508000";
        assertEquals(expectedResult, bankOCR.checkFile("457508000"));
    }

    /**
     * This tes for Story 3.
     */
    @Test
    public void testCheckFileErrorResult() {
        final String expectedResult = "664371495 ERR";
        assertEquals(expectedResult, bankOCR.checkFile("664371495"));
    }

    /**
     * This tes for Story 3.
     */
    @Test
    public void testCheckFileUnreadableResult() {
        final String expectedResult = "86110??36 ILL";
        assertEquals(expectedResult, bankOCR.checkFile("86110??36"));
    }
}
