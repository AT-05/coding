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
    private BankOCR map;

    /**
     * this function setup de var for all class.
     */
    @Before
    public void setup() {
        map = new BankOCR();
    }

    /**
     * This test check whit nine value.
     */
    @Test
    public void testMapNumberCheckValue() {
        String stringCodeOne = "    _  _     _  _  _  _  _ ";
        String stringCodeTwo = "  | _| _||_||_ |_   ||_||_|";
        String stringCodeThree = "  ||_  _|  | _||_|  ||_| _|";
        final String expectedResult = "123456789";

        assertEquals(expectedResult, map.checkValue(stringCodeOne, stringCodeTwo, stringCodeThree));
    }

    /**
     * This test check whit seven value.
     */

    @Test
    public void testMapNumberCheckValueWithSeven() {

        String stringCodeOne = "    _  _     _  _  _ ";
        String stringCodeTwo = "  | _| _||_||_ |_   |";
        String stringCodeThree = "  ||_  _|  | _||_|  |";
        final String expectedResult = "1234567";

        assertEquals(expectedResult, map.checkValue(stringCodeOne, stringCodeTwo, stringCodeThree));

    }

    /**
     * This test check whit three.
     */
    @Test
    public void testMapNumberWithThree() {
        String stringLine1 = " _  _  _  _  _  _  _  _  _ ";
        String stringLine2 = " _| _| _| _| _| _| _| _| _|";
        String stringLine3 = " _| _| _| _| _| _| _| _| _|";
        final String expectedResult = "333333333";
        assertEquals(expectedResult, map.checkValue(stringLine1, stringLine2, stringLine3));

    }

    /**
     * This test check whit one value.
     */
    @Test
    public void testMapNumberWithOneValue() {
        String stringCodeOne = "   ";
        String stringCodeTwo = "  |";
        String stringCodeThree = "  |";
        final String expectedResult = "1";
        assertEquals(expectedResult, map.checkValue(stringCodeOne, stringCodeTwo, stringCodeThree));

    }

    /**
     * This test check is credit car is valid.
     */
    @Test
    public void testCheckSumCalculation() {
        assertTrue(map.checkSumCalculation(900000007));
        assertTrue(map.checkSumCalculation(345882865));
    }

    /**
     * This test check is credit car is not valid.
     */
    @Test
    public void testCheckSumCalculationFalse() {
        boolean actualResult = map.checkSumCalculation(900000000);
        assertFalse(actualResult);
    }

    /**
     * This tes for Story 3.
     */
    @Test
    public void testCheckFileAssertResult() {
        final String expectedResult = "457508000";
        assertEquals(expectedResult, map.checkFile("457508000"));
    }

    /**
     * This tes for Story 3.
     */
    @Test
    public void testCheckFileErrorResult() {
        final String expectedResult = "664371495 ERR";
        assertEquals(expectedResult, map.checkFile("664371495"));
    }

    /**
     * This tes for Story 3.
     */
    @Test
    public void testCheckFileUnreadableResult() {
        final String expectedResult = "86110??36 ILL";
        assertEquals(expectedResult, map.checkFile("86110??36"));
    }
}
