package org.fundacionjala.coding.franco;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 8/21/2017.
 */
public class MultiplesTest {
    /**
     * This method test Multiples Class.
     */
    @Test
    public void testMultiplesOf3And5() {
        Multiples multiples1 = new Multiples();

        assertEquals(23, multiples1.multiplesOf3And5(10));
        assertEquals(78, multiples1.multiplesOf3And5(20));
        assertEquals(9168, multiples1.multiplesOf3And5(200));
    }
}
