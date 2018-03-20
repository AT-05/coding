package org.fundacionjala.coding.abner;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Abner on 8/30/2017.
 */
public class SpinWordsTest {

    /**
     * This test check the spin words.
     */
    @Test
    public void testSpinWords() {
        SpinWord spinWord = new SpinWord();

        assertEquals("Hey wollef sroirraw", spinWord.spinWords("Hey fellow warriors"));
        assertEquals("This is a test", spinWord.spinWords("This is a test"));
        assertEquals("This is rehtona test", spinWord.spinWords("This is another test"));
    }
}
