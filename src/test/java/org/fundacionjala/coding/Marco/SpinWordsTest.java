package org.fundacionjala.coding.Marco;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * test.
 */
public class SpinWordsTest {

    private SpinWords story;

    /**
     * This method ini.
     */
    @Before
    public void ini() {
        story = new SpinWords();
    }

    /**
     * Test example 1.
     */
    @Test
    public void testSpinWorld1() {

        String expectResult = "Hey wollef sroirraw";
        String actualResult = "Hey fellow warriors";
        assertEquals(expectResult, story.spinWords(actualResult));

    }

    /**
     * Test example 2.
     */
    @Test
    public void testSpinWorld2() {

        String expectResult = "This is a test";
        String actualResult = "This is a test";
        assertEquals(expectResult, story.spinWords(actualResult));

    }

    /**
     * Test example 3.
     */
    @Test
    public void testSpinWorld3() {

        String expectResult = "This is rehtona test";
        String actualResult = "This is another test";
        assertEquals(expectResult, story.spinWords(actualResult));

    }
}
