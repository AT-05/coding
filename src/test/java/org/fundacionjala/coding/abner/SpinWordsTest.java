package org.fundacionjala.coding.abner;

import static junit.framework.TestCase.assertEquals;
import org.junit.Test;


/**
 * Created by Abner on 8/30/2017.
 */
public class SpinWordsTest {
    private SpinWord spinWord;

    /**
     * This test check the spin words.
     */
    @Test
    public void testSpinWords() {
        spinWord = new SpinWord();

        assertEquals("Hey wollef sroirraw", spinWord.spinWords("Hey fellow warriors"));
        assertEquals("This is a test", spinWord.spinWords("This is a test"));
        assertEquals("This is rehtona test", spinWord.spinWords("This is another test"));
    }


}
