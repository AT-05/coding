package org.fundacionjala.coding.Franco;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
        AccountNumber accountNumber = new AccountNumber();

        List<String> lines1 = new ArrayList<>();
        lines1.add("    _  _     _  _  _  _  _ ");
        lines1.add("  | _| _||_||_ |_   ||_||_|");
        lines1.add("  ||_  _|  | _||_|  ||_| _|");

        final String actualResult1 = accountNumber.mapEntryOCRToNumber(lines1);
        final String expectedResult1 = "123456789";
        assertEquals(expectedResult1, actualResult1);

        List<String> lines2 = new ArrayList<>();
        lines2.add("    _  _     _  _  _  _  _ ");
        lines2.add("  | _| _||_||_  _    |_||_|");
        lines2.add("  ||_  _|  | _||_|  ||_| _|");

        final String actualResult2 = accountNumber.mapEntryOCRToNumber(lines2);
        final String expectedResult2 = "12345-1-189";
        assertEquals(expectedResult2, actualResult2);
    }

    /**
     * This method tests validation of account number.
     */
    @Test
    public void testCheckSumAccountNumberValidation() {
        String accountNumber1 = "345882865";
        String accountNumber2 = "664371495";
        AccountNumber accountNumber = new AccountNumber();

        final boolean actualResult1 = accountNumber.checkSum(accountNumber1);
        assertTrue(actualResult1);

        final boolean actualResult2 = accountNumber.checkSum(accountNumber2);
        assertFalse(actualResult2);
    }

    /**
     *
     */
    @Test
    public void testFinding() {
        AccountNumber accountNumber = new AccountNumber();

        List<String> lines1 = new ArrayList<>();
        lines1.add("    _  _     _  _  _  _  _ ");
        lines1.add("  | _| _||_||_  _    |_||_|");
        lines1.add("  ||_  _|  | _||_|  ||_| _|");

        final String actualResult1 = accountNumber.finding(accountNumber.mapEntryOCRToNumber(lines1));
        final String expectedResult1 = "12345??89 ILL";
        assertEquals(expectedResult1, actualResult1);

        List<String> lines2 = new ArrayList<>();
        lines2.add("    _  _     _  _  _  _  _ ");
        lines2.add("  | _| _||_||_ |_   ||_||_|");
        lines2.add("  ||_  _|  | _||_|  ||_| _|");

        final String actualResult2 = accountNumber.finding(accountNumber.mapEntryOCRToNumber(lines2));
        final String expectedResult2 = "123456789";
        assertEquals(expectedResult2, actualResult2);

        List<String> lines3 = new ArrayList<>();
        lines3.add("    _  _     _  _     _  _ ");
        lines3.add("  | _| _||_||_ |_   ||_||_|");
        lines3.add("  ||_  _|  | _||_|  ||_| _|");

        final String actualResult3 = accountNumber.finding(accountNumber.mapEntryOCRToNumber(lines3));
        final String expectedResult3 = "123456189 ERR";
        assertEquals(expectedResult3, actualResult3);
    }
}
