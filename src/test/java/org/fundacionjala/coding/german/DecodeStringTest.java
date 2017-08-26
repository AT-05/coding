package org.fundacionjala.coding.german;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by seus on 25/8/2017.
 */
public class DecodeStringTest {

    /**
     * Verify some divideString Method.
     */
    @Test
    public void testSomeDivideStringMethod() {
        DecodeString decodeString = new DecodeString(String.format("%s%s%s",
                "AAA\n",
                "BBB\n",
                "CCC"));
        String[] result = decodeString.divideString();
        assertEquals("AAA", result[0]);
        assertEquals("BBB", result[1]);
        assertEquals("CCC", result[2]);
    }

    /**
     * Verify some numero Method.
     */
    @Test
    public void testnumeroMethod() {
        DecodeString decodeString = new DecodeString("");
        int result = decodeString.numero(String.format("%s%s%s", " _ ",
                "|_|",
                "|_|"));
        assertEquals(8, result);

    }

    /**
     * Verify parseAccount Method.
     */
    @Test
    public void testParseAccountMethod() {
        DecodeString decodeString = new DecodeString(String.format("%s%s%s",
                "    _  _     _  _  _  _  _ \n",
                "  | _| _||_||_ |_   ||_||_|\n",
                "  ||_  _|  | _||_|  ||_| _|"));

        String result = decodeString.parseAccount();
        assertEquals("123456789", result);
    }

    /**
     * Verify  IsValidCheckSum Method return false.
     */
    @Test
    public void testIsValidCheckSumMethodIsFalse() {
        DecodeString decodeString = new DecodeString(String.format("%s%s%s",
                "    _  _     _  _  _  _  _ \n",
                "  | _| _||_||_ |_   ||_||_|\n",
                "  ||_  _|  | _||_|  ||_| _|"));

        boolean result = decodeString.isValidChekSum();
        assertEquals(false, result);
    }

    /**
     * Verify  IsValidCheckSum return true Method.
     */
    @Test
    public void testIsValidCheckSumMethodIsTrue() {
        DecodeString decodeString = new DecodeString(String.format("%s%s%s",
                " _  _  _  _  _  _  _  _  _ \n",
                "|_|| || || || || || || |  |\n",
                " _||_||_||_||_||_||_||_|  |"));
        decodeString.parseAccount();

        boolean result = decodeString.isValidChekSum();
        assertEquals(true, result);
    }

    /**
     * Verify Status Method is OK.
     */
    @Test
    public void testStatusMethodIsOK() {
        DecodeString decodeString = new DecodeString(String.format("%s%s%s",
                " _  _  _  _  _  _  _  _  _ \n",
                "|_|| || || || || || || |  |\n",
                " _||_||_||_||_||_||_||_|  |"));

        decodeString.parseAccount();
        String result = decodeString.status();
        assertEquals("900000007", result);
    }
      /**
     * Verify Status Method is ERR.
     */
    @Test
    public void testStatusMethodIsERR() {
        DecodeString decodeString = new DecodeString(String.format("%s%s%s",
                " _     _  _  _  _  _  _  _ \n",
                "|_|  || || || || || || |  |\n",
                " _|  ||_||_||_||_||_||_|  |"));

        decodeString.parseAccount();
        String result = decodeString.status();
        assertEquals("910000007 ERR", result);
    }
    /**
     * Verify Status Method is ILL.
     */
    @Test
    public void testStatusMethodIsILL() {
        DecodeString decodeString = new DecodeString(String.format("%s%s%s",
                " _  _  _  _  _  _  _  _  _ \n",
                "|_|  || || || || || || |  |\n",
                " _||_||_||_||_||_||_||_|  |"));

        decodeString.parseAccount();
        String result = decodeString.status();
        assertEquals("9?0000007 ILL", result);
    }
}

