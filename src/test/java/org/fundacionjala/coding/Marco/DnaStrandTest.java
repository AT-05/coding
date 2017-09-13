package org.fundacionjala.coding.Marco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * These are Test for DnaStrand.
 */
public class DnaStrandTest {
    private  DnaStrand dna;
    @Before
    public void ini()
    {
      dna =new DnaStrand();
    }
    /**
     * Scenario 1.
     */
    @Test
    public void test01() {
        assertEquals("TTTT", dna.makeComplement("AAAA"));
    }

    /**
     * Scenario 2.
     */
    @Test
    public void test02() {
        assertEquals("TAACG", dna.makeComplement("ATTGC"));
    }

    /**
     * Scenario 3.
     */
    @Test
    public void test03() {
        assertEquals("CATA", dna.makeComplement("GTAT"));
    }

    /**
     * Scenario 4.
     */
    @Test
    public void test04() {
        assertEquals("TTCC", dna.makeComplement("AAGG"));
    }

    /**
     * Scenario 5.
     */
    @Test
    public void test05() {
        assertEquals("GCGC", dna.makeComplement("CGCG"));
    }

    /**
     * Scenario 6.
     */
    @Test
    public void test06() {
        assertEquals("TAACG", dna.makeComplement("ATTGC"));
    }

    /**
     * Scenario 7.
     */
    @Test
    public void test07() {
        assertEquals("CATAGCTAGCTAGCTAGCTAATATAAAAGCTGCTCTAAATTTATATATATATATGCTCTCTTATGTCTATCTGTCTAAT", dna.makeComplement("GTATCGATCGATCGATCGATTATATTTTCGACGAGATTTAAATATATATATATACGAGAGAATACAGATAGACAGATTA"));
    }
}
