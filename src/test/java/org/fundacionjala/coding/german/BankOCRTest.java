package org.fundacionjala.coding.german;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by seus on 25/8/2017.
 */
public class BankOCRTest {
    private BankOCR bankOCR;

    /**
     * This method execute before any test.
     */
    @Before
    public void setup() {
        bankOCR = new BankOCR();
    }

    /**
     * Verify parseAccount Method.
     */
    @Test
    public void testParseAccountMethod() {
        final String actualResult = bankOCR.parseAccount(String.format("%s%s%s",
                "    _  _     _  _  _  _  _ \n",
                "  | _| _||_||_ |_   ||_||_|\n",
                "  ||_  _|  | _||_|  ||_| _|"));
        final String expectedResult = "123456789";

        assertEquals(expectedResult, actualResult);
    }

    /**
     * Verify  IsValidCheckSum Method return false.
     */
    @Test
    public void testIsValidCheckSumMethodIsFalse() {
        final boolean actualResult = bankOCR.isValidCheckSum(bankOCR.parseAccount(String.format("%s%s%s",
                " _  _  _  _  _  _  _  _    \n",
                "|_|| || || || || || || |  |\n",
                " _||_||_||_||_||_||_||_|  |")));
        assertFalse("expected result False", actualResult);
    }

    /**
     * Verify  IsValidCheckSum return true Method.
     */
    @Test
    public void testIsValidCheckSumMethodIsTrue() {
        boolean result = bankOCR.isValidCheckSum(bankOCR.parseAccount(String.format("%s%s%s",
                " _  _  _  _  _  _  _  _  _ \n",
                "|_|| || || || || || || |  |\n",
                " _||_||_||_||_||_||_||_|  |")));

        assertTrue("expected result True", result);
    }

    /**
     * Verify Status Method is OK.
     */
    @Test
    public void testStatusMethodIsOK() {
        final String actualResult = bankOCR.status(bankOCR.parseAccount(String.format("%s%s%s",
                " _  _  _  _  _  _  _  _  _ \n",
                "|_|| || || || || || || |  |\n",
                " _||_||_||_||_||_||_||_|  |")));
        final String expectedResult = "900000007";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Verify Status Method is ERR.
     */
    @Test
    public void testStatusMethodIsERR() {
        final String actualResult = bankOCR.status(bankOCR.parseAccount(String.format("%s%s%s",
                " _  _  _  _  _  _  _  _    \n",
                "|_|| || || || || || || |  |\n",
                " _||_||_||_||_||_||_||_|  |")));
        final String expectedResult = "900000001 ERR";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Verify Status Method is ILL.
     */
    @Test
    public void testStatusMethodIsILL() {
        final String actualResult = bankOCR.status(bankOCR.parseAccount(String.format("%s%s%s",
                " _  _  _  _  _  _  _  _  _ \n",
                "|_|  || || || || || || |  |\n",
                " _||_||_||_||_||_||_||_|  |")));
        final String expectedResult = "9?0000007 ILL";
        assertEquals(expectedResult, actualResult);
    }
}

