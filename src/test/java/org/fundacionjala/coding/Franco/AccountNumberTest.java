package org.fundacionjala.coding.Franco;

import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 8/25/2017.
 */
public class AccountNumberTest {
    /**
     * This method tests mapping of a number given
     * in pipes and underscores to string of digits.
     */
    @Test
    public void testMapEntryOCRToNumber() {
        List<String> lines = new ArrayList<>();
        lines.add("    _  _     _  _  _  _  _ ");
        lines.add("  | _| _||_||_ |_   ||_||_|");
        lines.add("  ||_  _|  | _||_|  ||_| _|");

        AccountNumber accountNumber1 = new AccountNumber();

        final String actualResult = accountNumber1.mapEntryOCRToNumber(lines);

        final String expectedResult = "123456789";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * This method tests validation of account number.
     */
    @Test
    public void testCheckSumAccountNumberValidation() {
        String accountNumber1 = "345882865";
        String accountNumber2 = "664371495";
        AccountNumber accountNumber = new AccountNumber();

        final boolean expectedResult1 = true;
        final boolean actualResult1 = accountNumber.checkSumAccountNumberValidation(accountNumber1);
        assertEquals(expectedResult1, actualResult1);

        final boolean expectedResult2 = false;
        final boolean actualResult2 = accountNumber.checkSumAccountNumberValidation(accountNumber2);
        assertEquals(expectedResult2, actualResult2);
    }

    /**
     * This method tests parsing of an account number in a file to a list
     * and a string account number.
     * @throws IOException in case of wrong reading of file.
     */
    @Test
    public void testParsedAccountNumber() throws IOException {
        String fileName = "C:\\Users\\Administrator\\Desktop\\AccountNumbers.txt";
        ArrayList<String> lines = new ArrayList<String>();

        AccountNumber accountNumber1 = new AccountNumber();

        String result = accountNumber1.mapEntryOCRToNumber(accountNumber1.parseFile(fileName));

        assertEquals("490067715", result);
    }
}
