package org.fundacionjala.coding.david;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tthis Class realize test.
 */
public class Examen_finalTest {

    Examen_final examenFinal;
    /**
     * This method initializa.
     */
    @Before
    public void setUp()
    {
        examenFinal = new Examen_final();
    }
    /**
     * This methos realize test case one.
     */
    @Test
    public void sunOfDigitsCaseOne() {

        final int actualResult = examenFinal.sunOfDigits("16");
        final int expectedresult = 7;
        assertEquals(expectedresult, actualResult);
    }
    /**
     * This methos realize test case two.
     */
    @Test
    public void sunOfDigitsCaseTwo() {

        final int actualResult = examenFinal.sunOfDigits("942");
        final int expectedresult = 6;
        assertEquals(expectedresult, actualResult);
    }
    /**
     * This methos realize test case three.
     */
    @Test
    public void sunOfDigitsCaseThree() {

        final int actualResult = examenFinal.sunOfDigits("132189");
        final int expectedresult = 6;
        assertEquals(expectedresult, actualResult);
    }
    /**
     * This methos realize test case Four.
     */
    @Test
    public void sunOfDigitsCaseFour() {

        final int actualResult = examenFinal.sunOfDigits("493193");
        final int expectedresult = 2;
        assertEquals(expectedresult, actualResult);
    }
}