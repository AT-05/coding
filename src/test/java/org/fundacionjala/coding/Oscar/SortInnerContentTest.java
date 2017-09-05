package org.fundacionjala.coding.Oscar;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Oz64 on 30/08/2017.
 */
public class SortInnerContentTest {
    private SortInnerContent kata5;

    /**
     * This method execute before any unit test.
     */
    @Before
    public void setup() {
        kata5 = new SortInnerContent();
    }

    /**
     * Sort inner content with five words for changing.
     */
    @Test
    public void testSortInnerContentOfFiveWords() {
        String actualResult = kata5.sortInnerContent("sort the inner content in descending order");
        String expectedResult = "srot the inner ctonnet in dsnnieedcg oredr";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Sort inner content with one word for changing.
     */
    @Test
    public void testSortInnerContentOfOneWord() {
        String actualResult = kata5.sortInnerContent("wait for me");
        String expectedResult = "wiat for me";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Sort inner content with three words for changing.
     */
    @Test
    public void testSortInnerContentOfThreeWords() {
        String actualResult = kata5.sortInnerContent("this kata is easy");
        String expectResult = "tihs ktaa is esay";
        assertEquals(expectResult, actualResult);
    }

    /**
     * Sort inner content with none words for changing.
     */
    @Test
    public void testSortInnerContentOfNoneWords() {
        String actualResult = kata5.sortInnerContent("I am");
        String expedtedResult = "I am";
        assertEquals(expedtedResult, actualResult);
    }
}
