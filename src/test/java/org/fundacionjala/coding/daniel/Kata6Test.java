package org.fundacionjala.coding.daniel;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


/**
 * Created by Administrator on 29/08/17.
 */
public class Kata6Test {
    /**
     * Test.
     */
    @Test
    public void validateEANCodeIfItIsNotDividable0() {
        Kata6 kata = new Kata6();
        String eanCode = "9783815820865";
        assertTrue(kata.validate(eanCode));
    }

    /**
     * Test.
     */
    @Test
    public void validateEANCodeIfItIsDividableBy0() {
        Kata6 kata = new Kata6();
        String eanCode = "9783815820864";
        assertFalse(kata.validate(eanCode));
    }

    /**
     * Test.
     */
    @Test
    public void validateEANCodeIfItIsNotDividableBy0() {
        Kata6 kata = new Kata6();
        String eanCode = "9783827317100";
        assertTrue(kata.validate(eanCode));
    }
}
