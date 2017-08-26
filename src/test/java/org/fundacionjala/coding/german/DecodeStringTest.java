package org.fundacionjala.coding.german;

import org.fundacionjala.coding.Library;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by seus on 25/8/2017.
 */
public class DecodeStringTest {

    /**
     * Verify some library method.
     */
    @Test
    public void testSomeDivideStringMethod() {
        DecodeString decodeString = new DecodeString("AAA\n" +
                "BBB\n" +
                "CCC");
        String result[] = decodeString.divideString();
        assertEquals("AAA", result[0]);
        assertEquals("BBB", result[1]);
        assertEquals("CCC", result[2]);
    }
    @Test
    public void testnumeroMethod() {
        DecodeString decodeString = new DecodeString("");
        int result = decodeString.numero(" _ " +
                "|_|" +
                "|_|");
        assertEquals(8, result);

    }
    @Test
    public void testStoryOneMethod() {
        DecodeString decodeString = new DecodeString(
                "    _  _     _  _  _  _  _ \n" +
                          "  | _| _||_||_ |_   ||_||_|\n" +
                          "  ||_  _|  | _||_|  ||_| _|");

        String result = decodeString.storyOne();
        assertEquals("123456789", result);
    }
    @Test
    public void testIsValidMethod() {
        DecodeString decodeString = new DecodeString(
                "    _  _     _  _  _  _  _ \n" +
                          "  | _| _||_||_ |_   ||_||_|\n" +
                          "  ||_  _|  | _||_|  ||_| _|");

        boolean result = decodeString.isValid();
        assertEquals(false, result);
    }
    @Test
    public void testIsValidMethodIsTrue() {
        DecodeString decodeString = new DecodeString(
                " _  _  _  _  _  _  _  _  _ \n" +
                          "|_|| || || || || || || |  |\n" +
                          " _||_||_||_||_||_||_||_|  |");
        decodeString.storyOne();

        boolean result = decodeString.isValid();
        assertEquals(true, result);
    }
    @Test
    public void testStoryOneMethodIsModEleven() {
        DecodeString decodeString = new DecodeString(
                " _  _  _  _  _  _  _  _  _ \n" +
                        "|_|| || || || || || || |  |\n" +
                        " _||_||_||_||_||_||_||_|  |");


        String result = decodeString.storyOne();
        assertEquals("900000007", result);
    }
    @Test
    public void testStoryOneMethodIsErr() {
        DecodeString decodeString = new DecodeString(
                " _  _  _  _  _  _  _  _  _ \n" +
                          "|_|  || || || || || || |  |\n" +
                          " _||_||_||_||_||_||_||_|  |");


        String result = decodeString.storyOne();
        assertEquals("9?0000007", result);
    }
}