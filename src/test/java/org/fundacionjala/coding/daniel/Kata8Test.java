package org.fundacionjala.coding.daniel;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Administrator on 13/09/17.
 */
public class Kata8Test {
    /**
     * Test 1.
     */
    @Test
    public void theComplementOfDnaAisT() {
        assertEquals("TTTT", Kata8.makeComplement("AAAA"));
    }

    /**
     * Test 2.
     */
    @Test
    public void theComplementsOfAandCAreTAndG() {
        assertEquals("TAACG", Kata8.makeComplement("ATTGC"));
    }

    /**
     * Test 3.
     */
    @Test
    public void theComplementsOfCisGAndTheComplementOfAisT() {
        assertEquals("CATA", Kata8.makeComplement("GTAT"));
    }

}
