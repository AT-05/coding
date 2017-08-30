package org.fundacionjala.coding.Franco;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 8/29/2017.
 */
public class SpinWordsTest {
    /**
     * This method tests results of spinWord method.
     */
    @Test
    public void testSpinWord() {
        SpinWords spinWords1 = new SpinWords();

        final String expectedResult1 = "Hey wollef sroirraw";
        final String actualResult1 = spinWords1.fillString(spinWords1.spinWord("Hey fellow warriors"));
        assertEquals(expectedResult1, actualResult1);

        final String expectedResult2 = "This is a test";
        final String actualResult2 = spinWords1.fillString(spinWords1.spinWord("This is a test"));
        assertEquals(expectedResult2, actualResult2);

        final String expectedResult3 = "This is rehtona test";
        final String actualResult3 = spinWords1.fillString(spinWords1.spinWord("This is another test"));
        assertEquals(expectedResult3, actualResult3);
    }
}
