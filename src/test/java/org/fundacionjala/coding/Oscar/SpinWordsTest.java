package org.fundacionjala.coding.Oscar;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Oz64 on 29/08/2017.
 */
public class SpinWordsTest {
    private SpinWords kata4;

    /**
     * This method execute before any unit test.
     */
    @Before
    public void setup() {
        kata4 = new SpinWords();
    }

    /**
     * This test verifies in a string of words, reversed two.
     */
    @Test
    public void testSpinTwoWords() {
        final String actualResult = kata4.spinWord("Hey fellow warriors");
        final String expectedResult = "Hey wollef sroirraw";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * This test verifies in a string of words, reversed one.
     */
    @Test
    public void testSpinOneWord() {
        final String actualResult = kata4.spinWord("This is another test");
        final String expectedResult = "This is rehtona test";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * This test verifies in a string of words, reversed none.
     */
    @Test
    public void testSpinNoneWord() {
        final String actualResult = kata4.spinWord("This is a test");
        final String expectedResult = "This is a test";
        assertEquals(expectedResult, actualResult);
    }
}
