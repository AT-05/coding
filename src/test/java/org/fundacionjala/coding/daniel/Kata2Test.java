package org.fundacionjala.coding.daniel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 04/09/17.
 */
public class Kata2Test {

    private Kata2 kata = new Kata2();

    /**
     * Tests for Kata2.
     */
    @Test
    public void test() {
        assertEquals(23, kata.solution(10));
        assertEquals(78, kata.solution(20));
        assertEquals(9168, kata.solution(200));
    }

}
