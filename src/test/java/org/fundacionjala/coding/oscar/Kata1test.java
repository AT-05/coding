package org.fundacionjala.coding.oscar;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Oz64 on 17/08/2017.
 */
public class Kata1test {

    /**
     *  test for the function highAndLow.
     */
    @Test
    public void return5And1ofStringOfNumbers12345() {
        Kata1 kata = new Kata1();
        String stringNumbers = "1 2 3 4 5";
        String result = kata.highAndLow(stringNumbers);
        assertEquals("5 1", result);
    }

    /**
     *  test for the function highAndLow.
     */
    @Test
    public void return5AndMinus3ofStringOfNumbers12minus345() {
        Kata1 kata = new Kata1();
        String stringNumbers = "1 2 -3 4 5";
        String result = kata.highAndLow(stringNumbers);
        assertEquals("5 -3", result);
    }

    /**
     *  test for the function highAndLow.
     */
    @Test
    public void return9AndMinus5ofStringOfNumbers1934minus5() {
        Kata1 kata = new Kata1();
        String stringNumbers = "1 9 3 4 -5";
        String result = kata.highAndLow(stringNumbers);
        assertEquals("9 -5", result);
    }


}
