package org.fundacionjala.coding.Franco;

import org.junit.Before;
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
    private AccountNumber accountNumber;

    /**
     * This method test instancing of Class AccountNumber.
     */
    @Before
    public void setUp() {
        accountNumber = new AccountNumber();
    }

    /**
     * This method tests mapping of an account number given
     * in pipes and underscores to string of digits.
     */
    @Test
    public void testMapEntryOCRToNumber() {
        List<String> lines = new ArrayList<>();
        lines.add("    _  _     _  _  _  _  _ ");
        lines.add("  | _| _||_||_ |_   ||_||_|");
        lines.add("  ||_  _|  | _||_|  ||_| _|");

        final String actualResult = accountNumber.mapEntryOCRToNumber(lines);
        final String expectedResult = "123456789";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * This method tests when checksum validation of account number is True.
     */
    @Test
    public void testCheckSumAccountNumberIsTrue() {
        String accountNumber = "345882865";

        final boolean actualResult = this.accountNumber.checkSum(accountNumber);
        assertTrue(actualResult);
    }

    /**
     * TThis method tests when checksum validation of account number is False.
     */
    @Test
    public void testCheckSumAccountNumberIsFalse() {
        String accountNumber = "664371495";

        final boolean actualResult = this.accountNumber.checkSum(accountNumber);
        assertFalse(actualResult);
    }

    /**
     * This method test Finding result of a Legible account number.
     */
    @Test
    public void testFindingLegibleAccountNumber() {
        List<String> lines = new ArrayList<>();
        lines.add("    _  _     _  _  _  _  _ ");
        lines.add("  | _| _||_||_ |_   ||_||_|");
        lines.add("  ||_  _|  | _||_|  ||_| _|");

        final String actualResult = accountNumber.mapEntryOCRToNumber(lines);
        final String expectedResult = "123456789";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * This method test Finding result of an false checksum account number.
     */
    @Test
    public void testFindingChecksumErrorAccountNumber() {
        List<String> lines = new ArrayList<>();
        lines.add("    _  _     _  _     _  _ ");
        lines.add("  | _| _||_||_ |_   ||_||_|");
        lines.add("  ||_  _|  | _||_|  ||_| _|");

        final String actualResult = accountNumber.finding(accountNumber.mapEntryOCRToNumber(lines));
        final String expectedResult = "123456189 ERR";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * This method test Finding result of an Illegible account number.
     */
    @Test
    public void testFindingIllegibleAccountNumber() {
        List<String> lines = new ArrayList<>();
        lines.add("    _  _     _  _  _  _  _ ");
        lines.add("  | _| _||_||_  _    |_||_|");
        lines.add("  ||_  _|  | _||_|  ||_| _|");

        final String actualResult = accountNumber.finding(accountNumber.mapEntryOCRToNumber(lines));
        final String expectedResult = "12345??89 ILL";
        assertEquals(expectedResult, actualResult);
    }
}
