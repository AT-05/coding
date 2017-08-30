package org.fundacionjala.coding.Franco;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 8/30/2017.
 */
public class SortInnerContentTest {

    /**
     * This method tests sorting of the inner content of words
     * in descending order.
     */
    @Test
    public void testSortWordInnerContent() {
        SortInnerContent sortInnerContent1 = new SortInnerContent();

        final String expectedResult1 = "srot";
        final String actualResult1 = sortInnerContent1.sortWordsInnerContent("sort");
        assertEquals(expectedResult1, actualResult1);

        final String expectedResult2 = "mronnig";
        final String actualResult2 = sortInnerContent1.sortWordsInnerContent("morning");
        assertEquals(expectedResult2, actualResult2);

        final String expectedResult3 = "wiat for me";
        final String actualResult3 = sortInnerContent1.sortWordsInnerContent("wait for me");
        assertEquals(expectedResult3, actualResult3);

        final String expectedResult4 = "tihs ktaa is esay";
        final String actualResult4 = sortInnerContent1.sortWordsInnerContent("this kata is easy");
        assertEquals(expectedResult4, actualResult4);
    }
}
