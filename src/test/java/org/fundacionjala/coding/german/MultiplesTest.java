package org.fundacionjala.coding.german;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 8/18/2017.
 */
public class MultiplesTest {
    /**
     *
     */

    @Test
    public void multipleThreeAndFive() {
        Multiples multiples = new Multiples();
        assertEquals(23, multiples.multipleThreeAndFive(10));
        assertEquals(78, multiples.multipleThreeAndFive(20));
        assertEquals(9168, multiples.multipleThreeAndFive(200));
    }

}
