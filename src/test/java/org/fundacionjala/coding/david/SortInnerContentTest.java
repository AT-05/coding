package org.fundacionjala.coding.david;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This class realize test word reverse.
 */
public class SortInnerContentTest {
    private SortInnerContent sortInnerContent;

    /**
     * This method initialize softInnserContent.
     */
    @Before
    public void setUp() {
        sortInnerContent = new SortInnerContent();
    }

    /**
     * This method word reserve.
     */
    @Test
    public void testReverseToStartInFivePositionCaseOne() {

        final String actualResult = sortInnerContent.sortInnerReverse("sort the inner content in descending order");
        final String expectResult = "srot the inner ctonnet in dsnnieedcg oredr";
        assertEquals(expectResult, actualResult);

    }

    /**
     * This method word reserve.
     */
    @Test
    public void testReverseToStartInFivePositionCaseTwo() {

        final String actualResult = sortInnerContent.sortInnerReverse("wiat for me");
        final String expectResult = "wiat for me";
        assertEquals(expectResult, actualResult);

    }

    /**
     * This method word reserve.
     */
    @Test
    public void testReverseToStartInFivePositionCaseThree() {

        final String actualResult = sortInnerContent.sortInnerReverse("I am");
        final String expectResult = "I am";

        assertEquals(expectResult, actualResult);

    }



}
