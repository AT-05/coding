package org.fundacionjala.coding.david;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This class realize test word reverse.
 */
public class SortInnerContentTest {

    /**
     * This method word reserve.
     */
    @Test
    public void reverseToStartInFivePosition() {
        SortInnerContent sortInnerContent = new SortInnerContent();

        final String actualResult = sortInnerContent.sortInnerReverse("sort the inner content in descending order");
        final String actualResul2 = sortInnerContent.sortInnerReverse("wait for me");
        final String actualResul3 = sortInnerContent.sortInnerReverse("I am");

        final String expectResult = sortInnerContent.sortInnerReverse("srot the inner ctonnet in dsnnieedcg oredr");
        final String expectResult2 = sortInnerContent.sortInnerReverse("wiat for me");
        final String expectResult3 = sortInnerContent.sortInnerReverse("I am");

        assertEquals(expectResult, actualResult);
        assertEquals(expectResult2, sortInnerContent.sortInnerReverse(actualResul2));
        assertEquals(expectResult3, sortInnerContent.sortInnerReverse(actualResul3));

    }


}
