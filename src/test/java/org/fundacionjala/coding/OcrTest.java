package org.fundacionjala.coding; /**
 * Created by Gary on 24/8/2017.
 */



import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * test class of Ocr.
 */
public class OcrTest {


    /**
     * this test the first case of bankOcr.
     */
    @Test
    public void testBankOcrFirstCase() {
        String result = "";
        String line1 = "    _  _     _  _  _  _  _ ";
        String line2 = "  | _| _||_||_ |_   ||_||_|";
        String line3 = "  ||_  _|  | _||_|  ||_| _|";

        Ocr numbers = new Ocr();
        String expectedResult = "123456789";
        String actualResult = numbers.bankOcr(line1, line2, line3);
        assertEquals(expectedResult, actualResult);
    }
    /**
     * this test the second case of bankOcr.
     */
    @Test
    public void testBankOcrSecondCase() {
        String result = "";
        String line1 = "    _  _     _  _  _  _  _ ";
        String line2 = "|_| _| _||_||_ |_ |_||_||_|";
        String line3 = "  | _| _|  | _||_| _||_| _|";

        Ocr numbers = new Ocr();
        assertEquals("433456989", numbers.bankOcr(line1, line2, line3));

    }

    /**
     * this test the first case of bankOcr-story_2.
     */
    @Test
    public void testcheckSum() {
        int check;
        String result = "";
        String line1 = "    _  _     _  _  _  _  _ ";
        String line2 = "|_| _| _||_||_ |_ |_||_||_|";
        String line3 = "  | _| _|  | _||_| _||_| _|";

        Ocr numbers = new Ocr();
        result = numbers.bankOcr(line1, line2, line3);
        check = numbers.checkSum(result);
        assertEquals(8, check);

    }
    /**
     * this test the second case of bankOcr-story_2.
     */
    @Test
    public void testcheckSumCase2() {
        int check;
        String result = "";
        String line1 = " _     _  _  _  _  _  _  _ ";
        String line2 = " _||_||_ |_||_| _||_||_ |_ ";
        String line3 = " _|  | _||_||_||_ |_||_| _|";

        Ocr numbers = new Ocr();
        result = numbers.bankOcr(line1, line2, line3);
        check = numbers.checkSum(result);
        assertEquals(0, check);

    }


}
