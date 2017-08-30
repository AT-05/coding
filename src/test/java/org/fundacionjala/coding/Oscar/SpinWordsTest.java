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
        String expectResult = kata4.spindWord("Hey fellow warriors");
        assertEquals("Hey wollef sroirraw", expectResult);
    }

    /**
     * This test verifies in a string of words, reversed one.
     */
    @Test
    public void testSpinOneWord() {
        String expectResult = kata4.spindWord("This is another test");
        assertEquals("This is rehtona test", expectResult);
    }

    /**
     * This test verifies in a string of words, reversed none.
     */
    @Test
    public void testSpinNoneWord() {
        String expectResult = kata4.spindWord("This is a test");
        assertEquals("This is a test", expectResult);
    }
}
