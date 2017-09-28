package org.fundacionjala.coding.daniel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 04/09/17.
 */
public class Kata2Test {
    /**
     * Tests for Kata2.
     */
    @Test
    public void test() {
        assertEquals(23, Kata2.solution(10));
        assertEquals(78, Kata2.solution(20));
        assertEquals(9168, Kata2.solution(200));
    }

}
