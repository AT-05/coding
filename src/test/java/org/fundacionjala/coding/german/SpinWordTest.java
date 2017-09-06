package org.fundacionjala.coding.german;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;


/**
 * Created by German on 8/29/2017.
 */
public class SpinWordTest {
    private SpinWords spinWord;

    /**
     * This method execute before any test.
     */
    @Before
    public void setUp() {
        spinWord = new SpinWords();
    }

    /**
     * Verify spinWords method.
     */
    @Test
    public void testSpinWordMethodTwoReverseWords() {
        assertEquals("Hey wollef sroirraw", spinWord.spinWords("Hey fellow warriors"));
    }

    /**
     * Verify spinWords method.
     */
    @Test
    public void testSpinWordMethodZeroReveseWord() {
        assertEquals("This is a test", spinWord.spinWords("This is a test"));
    }

    /**
     * Verify spinWords method.
     */
    @Test
    public void testSpinWordMethodOneReveseWord() {
        assertEquals("This is rehtona test", spinWord.spinWords("This is another test"));
    }

    /**
     * Verify spinWords method.
     */
    @Test
    public void testSpinWordMethodOnlyOneNotReveseWord() {
        assertEquals("word", spinWord.spinWords("word"));
    }

    /**
     * Verify spinWords method.
     */
    @Test
    public void testSpinWordMethodOnlyOneReveseWord() {
        assertEquals("sdrow", spinWord.spinWords("words"));
    }


}
