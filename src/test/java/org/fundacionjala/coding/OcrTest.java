package org.fundacionjala.coding; /**
 * Created by Gary on 24/8/2017.
 */


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * test class of Ocr.
 */
public class OcrTest {
    private Ocr numbers;

    /**
     * setup.
     */
    @Before
    public void setup() {
        numbers = new Ocr();
    }

    /**
     * this test the first case of bankOcr.
     */
    @Test
    public void testBankOcrFirstCase() {
        String line1 = "    _  _     _  _  _  _  _ ";
        String line2 = "  | _| _||_||_ |_   ||_||_|";
        String line3 = "  ||_  _|  | _||_|  ||_| _|";


        String expectedResult = "123456789";
        String actualResult = numbers.bankOcr(line1, line2, line3);
        assertEquals(expectedResult, actualResult);
    }

    /**
     * this test the second case of bankOcr.
     */
    @Test
    public void testBankOcrSecondCase() {
        String line1 = "    _  _     _  _  _  _  _ ";
        String line2 = "|_| _| _||_||_ |_ |_||_||_|";
        String line3 = "  | _| _|  | _||_| _||_| _|";

        String actualResult = numbers.bankOcr(line1, line2, line3);
        assertEquals("433456989", actualResult);

    }

    /**
     * this test the first case of bankOcr-story_2.
     */
    @Test
    public void testcheckSum() {
        boolean check;
        String result = "";
        String line1 = "    _  _     _  _  _  _  _ ";
        String line2 = "|_| _| _||_||_ |_ |_||_||_|";
        String line3 = "  | _| _|  | _||_| _||_| _|";

        result = numbers.bankOcr(line1, line2, line3);
        check = numbers.checkSum(result);
        assertFalse(check);

    }

    /**
     * this test the second case of bankOcr-story_2.
     */
    @Test
    public void testcheckSumCase2() {
        boolean check;
        String result = "";
        String line1 = " _     _  _  _  _  _  _  _ ";
        String line2 = " _||_||_ |_||_| _||_||_ |_ ";
        String line3 = " _|  | _||_||_||_ |_||_| _|";

        result = numbers.bankOcr(line1, line2, line3);
        check = numbers.checkSum(result);
        assertTrue(check);

    }


}
