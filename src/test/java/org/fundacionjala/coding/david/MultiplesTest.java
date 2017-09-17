package org.fundacionjala.coding.david;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This class is for test to class Multiples.
 */
public class MultiplesTest {

    /**
     * This method realize test to method of class Multiples.
     */
    @Test
    public void multipleThreeAndFive() {
        Multiples multiple = new Multiples();
        assertEquals(23, multiple.multipleThreeAndFive(10));
        assertEquals(78, multiple.multipleThreeAndFive(20));
        assertEquals(9168, multiple.multipleThreeAndFive(200));
    }

}
