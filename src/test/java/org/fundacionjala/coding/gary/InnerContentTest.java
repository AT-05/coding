package org.fundacionjala.coding.Gary;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Gary on 30/8/2017.
 */
public class InnerContentTest {
    private InnerContent spin;

    /**
     * setup.
     */
    @Before
    public void setup() {
        spin = new InnerContent();
    }

    /**
     * test first case.
     */
    @Test
    public void testInnerContentCaseOne() {

        final String expectedResult = "srot the inner ctonnet in dsnnieedcg oredr";
        final String actualResult = spin.innerSort("sort the inner content in descending order");
        assertEquals(expectedResult, actualResult);
    }

    /**
     * test second case.
     */
    @Test
    public void testInnerContentSecondCase() {

        final String expectedResult = "wiat for me";
        final String actualResult = spin.innerSort("wait for me");
        assertEquals(expectedResult, actualResult);
    }

    /**
     * test third case.
     */
    @Test
    public void testInnerContentThirdCase() {

        final String expectedResult = "tihs ktaa is esay";
        final String actualResult = spin.innerSort("this kata is easy");
        assertEquals(expectedResult, actualResult);
    }

    /**
     * test third case.
     */
    @Test
    public void testInnerContentFourthCase() {

        final String expectedResult = "I am";
        final String actualResult = spin.innerSort("I am");
        assertEquals(expectedResult, actualResult);
    }

}
