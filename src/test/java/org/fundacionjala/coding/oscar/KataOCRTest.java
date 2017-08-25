package org.fundacionjala.coding.oscar;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Oz64 on 24/08/2017.
 */
public class KataOCRTest {
    /**
     * This test verifies the account 123456789.
     */
    @Test
    //public void testWhenScanAccount123456789ShoulBeReturnStringNumber(){
    public void testMapEntryToNumberTheAccount123456789() {
        String accountNumber = "    _  _     _  _  _  _  _ "
                + "  | _| _||_||_ |_   ||_||_|"
                + "  ||_  _|  | _||_|  ||_| _|";

        KataOCR ocr = new KataOCR();
        String actualResult = "123456789";
        String expectedResult = ocr.scanString(accountNumber);
        assertEquals(expectedResult, actualResult);
    }

    /**
     * This test verifies the account 490067715.
     */
    @Test
    public void testMapEntryToNumberTheAccount490067715() {
        String accountNumber = "    _  _  _  _  _  _     _ "
                + "|_||_|| || ||_   |  |  ||_ "
                + "  | _||_||_||_|  |  |  | _|";

        KataOCR ocr = new KataOCR();
        String actualResult = "490067715";
        String expectedResult = ocr.scanString(accountNumber);
        assertEquals(expectedResult, actualResult);
    }

    /**
     * This test verifies the checksum.
     */
    @Test
    public void testChecksumValidated() {
        KataOCR ocr = new KataOCR();
        String stringAccount = "123456789";
        assertTrue(ocr.isValidatedWithChecksum(stringAccount));
    }
}
