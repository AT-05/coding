package org.fundacionjala.coding.german;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by seus on 25/8/2017.
 */
public class DecodeStringTest {
    private DecodeString decodeString;

    /**
     * This method execute before any test.
     */
    @Before
    public void setup() {
        decodeString = new DecodeString();
    }

    /**
     * Verify parseAccount Method.
     */
    @Test
    public void testParseAccountMethod() {
        final String result = decodeString.parseAccount(String.format("%s%s%s",
                "    _  _     _  _  _  _  _ \n",
                "  | _| _||_||_ |_   ||_||_|\n",
                "  ||_  _|  | _||_|  ||_| _|"));

        assertEquals("123456789", result);
    }

    /**
     * Verify  IsValidCheckSum Method return false.
     */
    @Test
    public void testIsValidCheckSumMethodIsFalse() {
        final boolean result = decodeString.isValidCheckSum(decodeString.parseAccount(String.format("%s%s%s",
                " _  _  _  _  _  _  _  _    \n",
                "|_|| || || || || || || |  |\n",
                " _||_||_||_||_||_||_||_|  |")));
        assertEquals(false, result);
    }

    /**
     * Verify  IsValidCheckSum return true Method.
     */
    @Test
    public void testIsValidCheckSumMethodIsTrue() {
        boolean result = decodeString.isValidCheckSum(decodeString.parseAccount(String.format("%s%s%s",
                " _  _  _  _  _  _  _  _  _ \n",
                "|_|| || || || || || || |  |\n",
                " _||_||_||_||_||_||_||_|  |")));

        assertEquals(true, result);
    }

    /**
     * Verify Status Method is OK.
     */
    @Test
    public void testStatusMethodIsOK() {
        String result = decodeString.status(decodeString.parseAccount(String.format("%s%s%s",
                " _  _  _  _  _  _  _  _  _ \n",
                "|_|| || || || || || || |  |\n",
                " _||_||_||_||_||_||_||_|  |")));
        assertEquals("900000007", result);
    }

    /**
     * Verify Status Method is ERR.
     */
    @Test
    public void testStatusMethodIsERR() {
        String result = decodeString.status(decodeString.parseAccount(String.format("%s%s%s",
                " _  _  _  _  _  _  _  _    \n",
                "|_|| || || || || || || |  |\n",
                " _||_||_||_||_||_||_||_|  |")));
        assertEquals("900000001 ERR", result);
    }

    /**
     * Verify Status Method is ILL.
     */
    @Test
    public void testStatusMethodIsILL() {
        String result = decodeString.status(decodeString.parseAccount(String.format("%s%s%s",
                " _  _  _  _  _  _  _  _  _ \n",
                "|_|  || || || || || || |  |\n",
                " _||_||_||_||_||_||_||_|  |")));
        assertEquals("9?0000007 ILL", result);
    }
}

