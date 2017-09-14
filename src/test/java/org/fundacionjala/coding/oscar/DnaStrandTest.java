package org.fundacionjala.coding.oscar;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Oz64 on 14/09/2017.
 */
public class DnaStrandTest {
    /**
     * Test 01.
     */
   @Test
    public void test01() {
        assertEquals("TTTT", DnaStrand.makeComplement("AAAA"));
    }

    /**
     * Test 02.
     */
    @Test
    public void test02() {
        assertEquals("TAACG", DnaStrand.makeComplement("ATTGC"));
    }

    /**
     * Test 03.
     */
    @Test
    public void test03() {
        assertEquals("CATA", DnaStrand.makeComplement("GTAT"));
    }

    /**
     * Test 04.
     */
    @Test
    public void test04() {
        assertEquals("TTCC", DnaStrand.makeComplement("AAGG"));
    }

    /**
     * Test 05.
     */
    @Test
    public void test05() {
        assertEquals("GCGC", DnaStrand.makeComplement("CGCG"));
    }

    /**
     * Test 06.
     */
    @Test
    public void test06() {
        assertEquals("TAACG", DnaStrand.makeComplement("ATTGC"));
    }

    /**
     * Test 07.
     */
    @Test
    public void test07() {
        String expectedResult = "CATAGCTAGCTAGCTAGCTAATATAAAAGCTGCTCTAAATTTATATATATATATGCTCTCTTATGTCTATCTGTCTAAT";
        String actualResult = "GTATCGATCGATCGATCGATTATATTTTCGACGAGATTTAAATATATATATATACGAGAGAATACAGATAGACAGATTA";
        assertEquals(expectedResult, DnaStrand.makeComplement(actualResult));
    }

}
