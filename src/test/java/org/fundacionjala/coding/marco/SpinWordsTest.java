package org.fundacionjala.coding.marco;

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
        final String expectResult = "Hey wollef sroirraw";
        final String actualResult = "Hey fellow warriors";
        assertEquals(expectResult, story.spinWords(actualResult));

    }

    /**
     * Test example 2.
     */
    @Test
    public void testSpinWorld2() {
        final String expectResult = "This is a test";
        final String actualResult = "This is a test";
        assertEquals(expectResult, story.spinWords(actualResult));

    }

    /**
     * Test example 3.
     */
    @Test
    public void testSpinWorld3() {
        final String expectResult = "This is rehtona test";
        final String actualResult = "This is another test";
        assertEquals(expectResult, story.spinWords(actualResult));

    }
}
