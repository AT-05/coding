package org.fundacionjala.coding.Gary;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Gary on 29/8/2017.
 */
public class TestSpin {
    private Spin spin;

    /**
     * setup.
     */
    @Before
    public void setup() {
        spin = new Spin();
    }


    /**
     * test first case.
     */
    @Test
    public void testSpindWordsCaseOne() {

        String expectedResult = "Hey wollef sroirraw";
        String actualResult = spin.spinWords("Hey fellow warriors");
        assertEquals(expectedResult, actualResult);
    }

    /**
     * test second case.
     */
    @Test
    public void testSpindWordsSecondCase() {

        String expectedResult = "This is a test";
        String actualResult = spin.spinWords("This is a test");
        assertEquals(expectedResult, actualResult);
    }

    /**
     * test third case.
     */
    @Test
    public void testSpindWordsThirdCase() {

        String expectedResult = "This is rehtona test";
        String actualResult = spin.spinWords("This is another test");
        assertEquals(expectedResult, actualResult);
    }


}



