package org.fundacionjala.coding.franco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 8/29/2017.
 */
public class SpinWordsTest {
    private SpinWords spinWords;

    /**
     * This method tests instancing of HighAndLow Class.
     */
    @Before
    public void setUp() {
        spinWords = new SpinWords();
    }

    /**
     * This method tests sentence with longer than 5 letters.
     */
    @Test
    public void testSpinWordWithGreaterThan5LettersWords() {
        final String expectedResult = "Hey wollef sroirraw";
        final String actualResult = spinWords.spinWord("Hey fellow warriors");
        assertEquals(expectedResult, actualResult);
    }

    /**
     * This method tests sentence with shorter than 5 letters.
     */
    @Test
    public void testSpinWordWithSmallerThan5LettersWords() {
        final String expectedResult = "This is a test";
        final String actualResult = spinWords.spinWord("This is a test");
        assertEquals(expectedResult, actualResult);

        final String expectedResult2 = "This is rehtona test";
        final String actualResult2 = spinWords.spinWord("This is another test");
        assertEquals(expectedResult2, actualResult2);
    }
}
