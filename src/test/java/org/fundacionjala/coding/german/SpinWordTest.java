package org.fundacionjala.coding.german;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by Administrator on 8/29/2017.
 */
public class SpinWordTest {
    /**
     * Verify spinWords method.
     */
    @Test
    public void testSpinWordMethodTwoReverseWords() {
        SpinWords spinWord = new SpinWords();
        assertEquals("Hey wollef sroirraw", spinWord.spinWords("Hey fellow warriors"));
    }

    /**
     * Verify spinWords method.
     */
    @Test
    public void testSpinWordMethodZeroReveseWord() {
        SpinWords spinWord = new SpinWords();
        assertEquals("This is a test", spinWord.spinWords("This is a test"));
    }

    /**
     * Verify spinWords method.
     */
    @Test
    public void testSpinWordMethodOneReveseWord() {
        SpinWords spinWord = new SpinWords();
        assertEquals("This is rehtona test", spinWord.spinWords("This is another test"));
    }

    /**
     * Verify spinWords method.
     */
    @Test
    public void testSpinWordMethodOnlyOneNotReveseWord() {
        SpinWords spinWord = new SpinWords();
        assertEquals("word", spinWord.spinWords("word"));
    }

    /**
     * Verify spinWords method.
     */
    @Test
    public void testSpinWordMethodOnlyOneReveseWord() {
        SpinWords spinWord = new SpinWords();
        assertEquals("sdrow", spinWord.spinWords("words"));
    }


}
