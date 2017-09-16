package org.fundacionjala.coding;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 15/09/17.
 */
public class Kata10Test {

    /**
     * Unit tests.
     */
    @Test
    public void basicTests() {
        assertEquals(3, Kata10.persistence(39));
        assertEquals(0, Kata10.persistence(4));
        assertEquals(2, Kata10.persistence(25));
        assertEquals(4, Kata10.persistence(999));
    }

}
