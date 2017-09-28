package org.fundacionjala.coding.franco;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Administrator on 8/25/2017.
 */
public class BankOCRTest {
    private BankOCR bankOCR;

    /**
     * This method test instancing of Class BankOCR.
     */
    @Before
    public void setUp() {
        bankOCR = new BankOCR();
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

        final String actualResult = bankOCR.mapEntryOCRToNumber(lines);
        final String expectedResult = "123456789";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * This method tests when checksum validation of account number is True.
     */
    @Test
    public void testCheckSumAccountNumberIsTrue() {
        String accountNumber = "345882865";

        final boolean actualResult = this.bankOCR.checkSum(accountNumber);
        assertTrue(actualResult);
    }

    /**
     * TThis method tests when checksum validation of account number is False.
     */
    @Test
    public void testCheckSumAccountNumberIsFalse() {
        String accountNumber = "345882866";

        final boolean actualResult = this.bankOCR.checkSum(accountNumber);
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

        final String actualResult = bankOCR.mapEntryOCRToNumber(lines);
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

        final String actualResult = bankOCR.finding(bankOCR.mapEntryOCRToNumber(lines));
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

        final String actualResult = bankOCR.finding(bankOCR.mapEntryOCRToNumber(lines));
        final String expectedResult = "12345??89 ILL";
        assertEquals(expectedResult, actualResult);
    }
}
