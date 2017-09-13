package org.fundacionjala.coding.david;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This class realize test to Persist.
 */
public class PersistTest {


    private Persist persist;

    /**
     * This method initialize variable.
     *
     * @throws Exception
     */
    @Before
    public void setUp() {
        persist = new Persist();
    }

    /**
     * This method realize test case one.
     */
    @Test
    public void testBasicTestsCaseOne() {
        final int actualResult = persist.persistence(39);
        final int expectedResult = 3;

        assertEquals(expectedResult, actualResult);
    }

    /**
     * This method realize test case two.
     */
    @Test
    public void testBasicTestsCaseTwo() {
        final int actualResult = persist.persistence(4);
        final int expectedResult = 0;

        assertEquals(expectedResult, actualResult);

    }

    /**
     * This method realize test case three.
     */
    @Test
    public void testBasicTestsCaseThree() {
        final int actualResult = persist.persistence(25);
        final int expectedResult = 2;

        assertEquals(expectedResult, actualResult);
    }

    /**
     * This method realize test case four.
     */
    @Test
    public void testBasicTestsCaseFour() {
        final int actualResult = persist.persistence(999);
        final int expectedResult = 4;
        assertEquals(expectedResult, actualResult);
    }

    /**
     * This method realize test case five.
     */
    @Test
    public void testBasicTestsCaseFive() {
        final int actualResult = persist.persistence(444);
        final int expectedResult = 3;

        assertEquals(expectedResult, actualResult);
    }

}
