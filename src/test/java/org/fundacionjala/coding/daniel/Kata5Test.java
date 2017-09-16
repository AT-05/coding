package org.fundacionjala.coding.daniel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 15/09/17.
 */
public class Kata5Test {
    /**
     * Kata 5 tests.
     */
    @Test
    public void exampleTests() {
        assertEquals("srot the inner ctonnet in dsnnieedcg oredr",
                Kata5.sortTheInnerContent("sort the inner content in descending order"));
        assertEquals("wiat for me", Kata5.sortTheInnerContent("wait for me"));
        assertEquals("tihs ktaa is esay", Kata5.sortTheInnerContent("this kata is easy"));
    }
}
