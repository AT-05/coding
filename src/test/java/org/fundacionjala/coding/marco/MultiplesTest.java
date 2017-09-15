package org.fundacionjala.coding.marco;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 8/22/2017.
 */
public class MultiplesTest {
    /**
     * test.
     */
    @Test
    public void testMultipleThreeAndFive() {
        Multiples objMultiples = new Multiples();
        assertEquals(23, objMultiples.multipleThreeAndFive(10));
        assertEquals(78, objMultiples.multipleThreeAndFive(20));
        assertEquals(9168, objMultiples.multipleThreeAndFive(200));
    }


}
