package org.fundacionjala.coding.david;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This Class realize test.
 */
public class DigitalRootTest {

    private DigitalRoot examenFinal;

    /**
     * This method initializa.
     */
    @Before
    public void setUp() {
        examenFinal = new DigitalRoot();
    }

    /**
     * This methos realize test case one.
     */
    @Test
    public void sunOfDigitsCaseOne() {
        final int actualResult = examenFinal.sunOfDigits("16");
        final int expectedResult = 7;
        assertEquals(expectedResult, actualResult);
    }

    /**
     * This methos realize test case two.
     */
    @Test
    public void sunOfDigitsCaseTwo() {
        final int actualResult = examenFinal.sunOfDigits("942");
        final int expectedResult = 6;
        assertEquals(expectedResult, actualResult);
    }

    /**
     * This methos realize test case three.
     */
    @Test
    public void sunOfDigitsCaseThree() {
        final int actualResult = examenFinal.sunOfDigits("132189");
        final int expectedResult = 6;
        assertEquals(expectedResult, actualResult);
    }

    /**
     * This methos realize test case Four.
     */
    @Test
    public void sunOfDigitsCaseFour() {
        final int actualResult = examenFinal.sunOfDigits("493193");
        final int expectedResult = 2;
        assertEquals(expectedResult, actualResult);
    }

}
