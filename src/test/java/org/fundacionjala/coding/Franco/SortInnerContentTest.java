package org.fundacionjala.coding.Franco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 8/30/2017.
 */
public class SortInnerContentTest {
    private SortInnerContent sortInnerContent;

    /**
     * This method tests instancing of Class SortInnerContent.
     */
    @Before
    public void setUp() {
        sortInnerContent = new SortInnerContent();
    }

    /**
     * This method tests sorting of the inner content of a single word
     * in descending order.
     */
    @Test
    public void testSortInnerContentOfOneWord() {
        final String expectedResult = "srot";
        final String actualResult = sortInnerContent.sortWordsInnerContent("sort");
        assertEquals(expectedResult, actualResult);

        final String expectedResult2 = "mronnig";
        final String actualResult2 = sortInnerContent.sortWordsInnerContent("morning");
        assertEquals(expectedResult2, actualResult2);
    }

    /**
     * This method tests sorting of the inner content of several
     * words in descending order.
     */
    @Test
    public void testSortInnerContentOfMoreThanOneWords() {
        final String expectedResult = "wiat for me";
        final String actualResult = sortInnerContent.sortWordsInnerContent("wait for me");
        assertEquals(expectedResult, actualResult);

        final String expectedResult2 = "tihs ktaa is esay";
        final String actualResult2 = sortInnerContent.sortWordsInnerContent("this kata is easy");
        assertEquals(expectedResult2, actualResult2);
    }
}
