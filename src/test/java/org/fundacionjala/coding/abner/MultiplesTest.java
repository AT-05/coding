package org.fundacionjala.coding.abner;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * This class multiples Sum.
 * Created by Abner on 18/08/2017.
 */
public class MultiplesTest {
    /**
     * Testing test For Three Numbers.
     * By: Abner Mamani.
     */
    @Test
    public void testForTreeNumbers() {
        Multiples mu = new Multiples();

        assertEquals(23, mu.multiplesSum(10));
        assertEquals(78, mu.multiplesSum(20));
        assertEquals(9168, mu.multiplesSum(200));
    }

}
