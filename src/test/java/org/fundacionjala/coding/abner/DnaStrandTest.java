package org.fundacionjala.coding.abner;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * This class test DNA.
 */
public class DnaStrandTest {
    private DnaStrand dnaStrand;

    /**
     * Set up the var.
     */
    @Before
    public void setUp() {
        dnaStrand = new DnaStrand();
    }

    /**
     * This function testing.
     */
    @Test
    public void test01() {
        assertEquals("TTTT", dnaStrand.makeComplement("AAAA"));
        assertEquals("TAACG", dnaStrand.makeComplement("ATTGC"));
        assertEquals("TTCC", dnaStrand.makeComplement("AAGG"));
        assertEquals("GCGC", dnaStrand.makeComplement("CGCG"));

        String expectedResult = "CATAGCTAGCTAGCTAGCTAATATAAAAGCTGCTCTAAATTTATATATATATATGCTCTCTTATGTCTATCTGTCTAAT";
        String dna = "GTATCGATCGATCGATCGATTATATTTTCGACGAGATTTAAATATATATATATACGAGAGAATACAGATAGACAGATTA";
        String actualResult = dnaStrand.makeComplement(dna);

        assertEquals(expectedResult, actualResult);
    }

}

