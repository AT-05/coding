package org.fundacionjala.coding.marco;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Administrator on 8/22/2017.
 */
public class BankOCRTest {
    /**
     * test.
     */
    @Test
    public void testStoryOne() {
        BankOCR story = new BankOCR();
        String entryLineCode1 = "    _  _     _  _  _  _  _ ";
        String entryLineCode2 = "  | _| _||_||_ |_   ||_||_|";
        String entryLineCode3 = "  ||_  _|  | _||_|  ||_| _|";
        String actualResult = story.storyOne(entryLineCode1, entryLineCode2, entryLineCode3);
        String expectedResult = "123456789";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test answer True.
     */
    @Test
    public void testStoryTwoExampleTrue() {
        BankOCR story = new BankOCR();
        String number = "123456789";
        assertTrue(story.storyTwo(number));
    }

    /**
     * Test answer false.
     */
    @Test
    public void testStoryTwoExampleFalse() {
        BankOCR story = new BankOCR();
        String number = "345882865";
        assertFalse(story.storyTwo(number));
    }
}
