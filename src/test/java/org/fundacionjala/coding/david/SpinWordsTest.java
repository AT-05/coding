package org.fundacionjala.coding.david;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This class realize word reverse.
 */
public class SpinWordsTest {

    private SpinWords spinWordsTest;

    /**
     * This method initialize.
     */
    @Before
    public void setUp() {
        spinWordsTest = new SpinWords();
    }

    /**
     * This test realize one words case one.
     */
    @Test
    public void testReverseWordCaseOne() {

        final String actualResul = spinWordsTest.reverseToStartInFivePosition("Hey fellow warriors");
        final String expectedResult = "Hey wollef sroirraw";
        assertEquals(expectedResult, actualResul);
    }

    /**
     * This test realize one words  case two.
     */
    @Test
    public void testReverseWordCaseTwo() {

        final String actualResul = spinWordsTest.reverseToStartInFivePosition("This is a test");
        final String expectedResult = "This is a test";
        assertEquals(expectedResult, actualResul);

    }

    /**
     * This test realize one words  case three.
     */
    @Test
    public void testReverseWordCaseThree() {
        final String actualResul = spinWordsTest.reverseToStartInFivePosition("This is another test");
        final String expectedResult = "This is rehtona test";
        assertEquals(expectedResult, actualResul);

    }
}
