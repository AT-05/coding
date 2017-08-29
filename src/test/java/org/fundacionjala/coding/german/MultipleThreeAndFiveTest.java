package org.fundacionjala.coding.german;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by Administrator on 8/18/2017.
 */
public class MultipleThreeAndFiveTest {
    /**
     *
     */

    @Test
    public void multipleThreeAndFive() {
        MultipleThreeAndFive multipleThreeAndFive = new MultipleThreeAndFive();
        assertEquals(23, multipleThreeAndFive.multipleThreeAndFive(10));
        assertEquals(78, multipleThreeAndFive.multipleThreeAndFive(20));
        assertEquals(9168, multipleThreeAndFive.multipleThreeAndFive(200));
    }

}
