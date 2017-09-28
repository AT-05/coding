package org.fundacionjala.coding.daniel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 15/09/17.
 */
public class Kata5Test {
    private Kata5 kata;

    /**
     * new Kata5.
     */
    @Before
    public void setUp() {
        kata = new Kata5();
    }

    /**
     * Kata 5 tests.
     */
    @Test
    public void exampleTests() {
        assertEquals("srot the inner ctonnet in dsnnieedcg oredr",
                kata.sortTheInnerContent("sort the inner content in descending order"));
        assertEquals("wiat for me", kata.sortTheInnerContent("wait for me"));
        assertEquals("tihs ktaa is esay", kata.sortTheInnerContent("this kata is easy"));
    }
}
