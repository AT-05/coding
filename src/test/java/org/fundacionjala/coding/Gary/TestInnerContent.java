package org.fundacionjala.coding.Gary;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Gary on 30/8/2017.
 */
public class TestInnerContent {
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

        String expectedResult = "srot the inner ctonnet in dsnnieedcg oredr";
        String actualResult = spin.innerSort("sort the inner content in descending order");
        assertEquals(expectedResult, actualResult);
    }

    /**
     * test second case.
     */
    @Test
    public void testInnerContentSecondCase() {

        String expectedResult = "wiat for me";
        String actualResult = spin.innerSort("wait for me");
        assertEquals(expectedResult, actualResult);
    }

    /**
     * test third case.
     */
    @Test
    public void testInnerContentThirdCase() {

        String expectedResult = "tihs ktaa is esay";
        String actualResult = spin.innerSort("this kata is easy");
        assertEquals(expectedResult, actualResult);
    }

    /**
     * test third case.
     */
    @Test
    public void testInnerContentFourthCase() {

        String expectedResult = "I am";
        String actualResult = spin.innerSort("I am");
        assertEquals(expectedResult, actualResult);
    }

}
