package org.fundacionjala.coding.marco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This was made by Marco Mendez September 15, 2015.
 */
public class DnaStrandTest {
    private DnaStrand dna;

    /**
     * Method ini.
     */
    @Before
    public void ini() {
        dna = new DnaStrand();
    }

    /**
     * Scenario 1.
     */
    @Test
    public void test01() {
        final String expectResult = "TTTT";
        final String actualResult = "AAAA";
        assertEquals(expectResult, dna.makeComplement(actualResult));
    }

    /**
     * Scenario 2.
     */
    @Test
    public void test02() {
        final String expectResult = "TAACG";
        final String actualResult = "ATTGC";
        assertEquals(expectResult, dna.makeComplement(actualResult));
    }

    /**
     * Scenario 3.
     */
    @Test
    public void test03() {
        final String expectResult = "CATA";
        final String actualResult = "GTAT";
        assertEquals(expectResult, dna.makeComplement(actualResult));
    }

    /**
     * Scenario 4.
     */
    @Test
    public void test04() {
        final String expectResult = "TTCC";
        final String actualResult = "AAGG";
        assertEquals(expectResult, dna.makeComplement(actualResult));
    }

    /**
     * Scenario5.
     */
    @Test
    public void test05() {
        final String expect = "GCGC";
        final String actualResult = "CGCG";
        assertEquals(expect, dna.makeComplement(actualResult));
    }

    /**
     * Scenario6.
     */
    @Test
    public void test06() {
        final String expectResult = "TAACG";
        final String actualResult = "ATTGC";
        assertEquals(expectResult, dna.makeComplement(actualResult));
    }

    /**
     * Scenario 7.
     */
    @Test
    public void test07() {
        final String expectResult = "CATAGCTAGCTAGCTAGCTAATATAAAAGCTGCTCTAAATTTATATATATATATGCTCTCTTATGTCTATCTGTCTAAT";
        final String actualResult = "GTATCGATCGATCGATCGATTATATTTTCGACGAGATTTAAATATATATATATACGAGAGAATACAGATAGACAGATTA";
        assertEquals(expectResult, dna.makeComplement(actualResult));
    }
}
