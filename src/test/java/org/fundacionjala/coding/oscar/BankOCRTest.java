package org.fundacionjala.coding.oscar;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Oz64 on 24/08/2017.
 */
public class BankOCRTest {
    private BankOCR ocr;

    /**
     * This method execute before any test.
     */
    @Before
    public void setup() {
        ocr = new BankOCR();
    }

    //region User Story 1

    /**
     * This test verifies the account 123456789.
     */
    @Test
    public void testMapEntryAccountToNumber() {
        String accountNumber = "    _  _     _  _  _  _  _ "
                + "  | _| _||_||_ |_   ||_||_|"
                + "  ||_  _|  | _||_|  ||_| _|";
        String actualResult = ocr.scanString(accountNumber);
        String expectResult = "123456789";
        assertEquals(expectResult, actualResult);
    }
    //endregion

    //region User Story 2

    /**
     * This test verifies correct checksum.
     */
    @Test
    public void testChecksumValidated() {
        String actualResult = ocr.checksum("123456789");
        String expectResult = "123456789";
        assertEquals(actualResult, expectResult);
    }

    /**
     * This test verifies incorrect checksum.
     */
    @Test
    public void testChecksumInvalidated() {
        String actualResult = ocr.checksum("664371495");
        String expectResult = "664371495 ERR";
        assertEquals(actualResult, expectResult);
    }
    //endregion

    //region User Story 3

    /**
     * This test verifies when in the account number one number is illegible.
     */
    @Test
    public void testMapEntryOneIncorrectNumberInAccount() {
        String expectResult = "49006771? ILL";

        assertEquals(ocr.accountIsInvalidOrIllegible("49006771?"), expectResult);
    }

    /**
     * This test verifies when in the account number two numbers is illegible.
     */
    @Test
    public void testMapEntryTwoIncorrectNumbersInAccount() {
        String expectResult = "1234?678? ILL";
        assertEquals(ocr.accountIsInvalidOrIllegible("1234?678?"), expectResult);
    }
    //endregion


}

