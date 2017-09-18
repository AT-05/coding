package org.fundacionjala.coding.gary;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Gary on 29/8/2017.
 */
public class SpinWordTest {

    private SpinWord spinWord;

    /**
     * setup.
     */
    @Before
    public void setup() {
        spinWord = new SpinWord();
    }

    /**
     * test first case.
     */
    @Test
    public void testSpinWordsCaseOne() {

        final String expectedResult = "Hey wollef sroirraw";
        final String actualResult = spinWord.spinWords("Hey fellow warriors");
        assertEquals(expectedResult, actualResult);
    }

    /**
     * test second case.
     */
    @Test
    public void testSpinWordsSecondCase() {

        final String expectedResult = "This is a test";
        final String actualResult = spinWord.spinWords("This is a test");
        assertEquals(expectedResult, actualResult);
    }

    /**
     * test third case.
     */
    @Test
    public void testSpinWordsThirdCase() {

        final String expectedResult = "This is rehtona test";
        final String actualResult = spinWord.spinWords("This is another test");
        assertEquals(expectedResult, actualResult);
    }

}
