package org.fundacionjala.coding.Abner;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * This class test the numbers.
 * Created by Samuel on 24/08/2017.
 */
public class NumberMapTest {
    /**
     * This test check whit nine value.
     */
    @Test
    public void testMapNumberCheckValue() {
        NumberMap map = new NumberMap();

        String stringCodeOne = "    _  _     _  _  _  _  _ ";
        String stringCodeTwo = "  | _| _||_||_ |_   ||_||_|";
        String stringCodeThree = "  ||_  _|  | _||_|  ||_| _|";

        assertEquals("123456789", map.checkValue(stringCodeOne, stringCodeTwo, stringCodeThree));

    }

    /**
     * This test check whit seven value.
     */

    @Test
    public void testMapNumberCheckValueWithSeven() {
        NumberMap map = new NumberMap();

        String stringCodeOne = "    _  _     _  _  _ ";
        String stringCodeTwo = "  | _| _||_||_ |_   |";
        String stringCodeThree = "  ||_  _|  | _||_|  |";

        assertEquals("1234567", map.checkValue(stringCodeOne, stringCodeTwo, stringCodeThree));

    }

    /**
     * This test check whit three.
     */
    @Test
    public void testMapNumberWithThree() {
        NumberMap map = new NumberMap();

        String stringLine1 = " _  _  _  _  _  _  _  _  _ ";
        String stringLine2 = " _| _| _| _| _| _| _| _| _|";
        String stringLine3 = " _| _| _| _| _| _| _| _| _|";

        assertEquals("333333333", map.checkValue(stringLine1, stringLine2, stringLine3));

    }

    /**
     * This test check whit one value.
     */
    @Test
    public void testMapNumberWithOneValue() {
        NumberMap map = new NumberMap();

        String stringCodeOne = "   ";
        String stringCodeTwo = "  |";
        String stringCodeThree = "  |";

        assertEquals("1", map.checkValue(stringCodeOne, stringCodeTwo, stringCodeThree));

    }

    /**
     * This test check is credit car is valid.
     */
    @Test
    public void testCheckSumCalculation() {
        NumberMap map = new NumberMap();
        assertEquals(true, map.checkSumCalculation(900000007));
        assertEquals(true, map.checkSumCalculation(345882865));
    }

    /**
     * This test check is credit car is not valid.
     */
    @Test
    public void testCheckSumCalculationFalse() {
        NumberMap map = new NumberMap();


        assertEquals(false, map.checkSumCalculation(900000000));
    }
}
