package org.fundacionjala.coding.oscar;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Oz64 on 18/08/2017.
 */
public class Kata2test {

    /**
     * for test the function multiplyOf3and5.
     */
    @Test
    public void sumOfMultiplesOf3and5() {
        Kata2 kata = new Kata2();
        assertEquals(23, kata.multiplyOf3and5(10));
        assertEquals(78, kata.multiplyOf3and5(20));
        assertEquals(9168, kata.multiplyOf3and5(200));
    }
}
