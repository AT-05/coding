package org.fundacionjala.coding.david;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This class realize word reverse.
 */
public class ReverseWordsTest {

    private ReverseWords reverseWordsTest;

    /**
     * This method initialize.
     */
    @Before
    public void setUp() {
        reverseWordsTest = new ReverseWords();
    }

    /**
     * This test realize one words case one.
     */
    @Test
    public void testReverseWordCaseOne() {

        final String actualResul = reverseWordsTest.reverseToStartInFivePosition("Hey fellow warriors");
        final String expectedResult = "Hey wollef sroirraw";
        assertEquals(expectedResult, actualResul);
    }

    /**
     * This test realize one words  case two.
     */
    @Test
    public void testReverseWordCaseTwo() {

        final String actualResul = reverseWordsTest.reverseToStartInFivePosition("This is a test");
        final String expectedResult = "This is a test";
        assertEquals(expectedResult, actualResul);

    }

    /**
     * This test realize one words  case three.
     */
    @Test
    public void testReverseWordCaseThree() {
        final String actualResul = reverseWordsTest.reverseToStartInFivePosition("This is another test");
        final String expectedResult = "This is rehtona test";
        assertEquals(expectedResult, actualResul);

    }
}
