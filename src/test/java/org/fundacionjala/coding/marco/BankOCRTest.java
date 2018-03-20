package org.fundacionjala.coding.marco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Administrator on 8/22/2017.
 */
public class BankOCRTest {

    private BankOCR story;

    /**
     * This method start the object.
     */
    @Before
    public void ini() {
        story = new BankOCR();
    }

    /**
     * test.
     */
    @Test
    public void testStoryOne() {
        final String entryLineCode1 = "    _  _     _  _  _  _  _ ";
        final String entryLineCode2 = "  | _| _||_||_ |_   ||_||_|";
        final String entryLineCode3 = "  ||_  _|  | _||_|  ||_| _|";
        final String actualResult = story.mapStringToNumbers(entryLineCode1, entryLineCode2, entryLineCode3);
        final String expectedResult = "123456789";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test answer True.
     */
    @Test
    public void testStoryTwoExampleTrue() {
        final String number = "123456789";
        assertTrue(story.checkSum(number));
    }

    /**
     * Test answer false.
     */
    @Test
    public void testStoryTwoExampleFalse() {
        final String number = "345882866";
        assertFalse(story.checkSum(number));
    }

    /**
     * This test return a code true.
     */
    @Test
    public void testStoryThreeTrueCode() {
        final String actualResult = story.finding("123456789");
        final String expectedResult = "123456789";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * This test return a code ILL.
     */
    @Test
    public void testStoryThreeCodeIll() {
        final String actualResult = story.finding("12??56789");
        final String expectedResult = "12??56789 ILL";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * This test return a code error.
     */
    @Test
    public void testStoryThreeCodeError() {
        final String actualResult = story.finding("345882866");
        final String expectedResult = "345882866 ERR";
        assertEquals(expectedResult, actualResult);
    }
}
