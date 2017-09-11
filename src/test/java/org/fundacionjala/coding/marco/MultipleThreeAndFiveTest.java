package org.fundacionjala.coding.marco;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 8/22/2017.
 */
public class MultipleThreeAndFiveTest {
    /**
     * test.
     */
    @Test
    public void testMultipleThreeAndFive() {
        MultipleThreeAndFive objMultipleThreeAndFive = new MultipleThreeAndFive();
        assertEquals(23, objMultipleThreeAndFive.multipleThreeAndFive(10));
        assertEquals(78, objMultipleThreeAndFive.multipleThreeAndFive(20));
        assertEquals(9168, objMultipleThreeAndFive.multipleThreeAndFive(200));
    }


}
