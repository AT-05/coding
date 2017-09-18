package org.fundacionjala.coding.gary;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Gary on 30/8/2017.
 */
public class SortInnerContentTest {
    private SortInnerContent sortInnerContent;

    /**
     * setup.
     */
    @Before
    public void setup() {
        sortInnerContent = new SortInnerContent();
    }

    /**
     * test first case.
     */
    @Test
    public void testInnerContentCaseOne() {

        final String expectedResult = "srot the inner ctonnet in dsnnieedcg oredr";
        final String actualResult = sortInnerContent.innerSort("sort the inner content in descending order");
        assertEquals(expectedResult, actualResult);
    }

    /**
     * test second case.
     */
    @Test
    public void testInnerContentSecondCase() {

        final String expectedResult = "wiat for me";
        final String actualResult = sortInnerContent.innerSort("wait for me");
        assertEquals(expectedResult, actualResult);
    }

    /**
     * test third case.
     */
    @Test
    public void testInnerContentThirdCase() {

        final String expectedResult = "tihs ktaa is esay";
        final String actualResult = sortInnerContent.innerSort("this kata is easy");
        assertEquals(expectedResult, actualResult);
    }

    /**
     * test third case.
     */
    @Test
    public void testInnerContentFourthCase() {

        final String expectedResult = "I am";
        final String actualResult = sortInnerContent.innerSort("I am");
        assertEquals(expectedResult, actualResult);
    }

}
