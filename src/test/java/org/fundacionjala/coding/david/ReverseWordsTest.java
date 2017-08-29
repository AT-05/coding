package org.fundacionjala.coding.david;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * This class realize word reverse.
 */
public class ReverseWordsTest {

    /**
     * This test realize one words.
     */
    @Test
    public void reverseToStartInFivePositionTest() {
        ReverseWords reverseWordsTest = new ReverseWords();
        String actualResul = reverseWordsTest.reverseToStartInFivePosition("Hey fellow warriors");
        String expectedResult = "Hey wollef sroirraw";
        assertEquals(expectedResult, actualResul);

    }


}
