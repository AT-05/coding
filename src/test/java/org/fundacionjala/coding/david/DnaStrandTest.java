package org.fundacionjala.coding.david;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Class test Dna.
 */
public class DnaStrandTest {

    private DnaStrand dnaStrand;
    /**
     * This method initialize dnaStrand.
     */
    @Before
    public void setUp() {
        dnaStrand = new DnaStrand();
    }

    /**
     * This method realize test change word.
     */
    @Test
    public void test01() {
        final String actualResult = dnaStrand.makeComplement("AAAA");
        final String expectedResult = "TTTT";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * This method realize test change word.
     */
    @Test
    public void test02() {
        final String actualResult = dnaStrand.makeComplement("ATTGC");
        final String expectedResult = "TAACG";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * This method realize test change word.
     */
    @Test
    public void test03() {
        final String actualResult = dnaStrand.makeComplement("GTAT");
        final String expectedResult = "CATA";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * This method realize test change word.
     */
    @Test
    public void test04() {
        final String actualResult = dnaStrand.makeComplement("AAGG");
        final String expectedResult = "TTCC";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * This method realize test change word.
     */
    @Test
    public void test05() {
        final String actualResult = dnaStrand.makeComplement("CGCG");
        final String expectedResult = "GCGC";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * This method realize test change word.
     */
    @Test
    public void test06() {
        final String actualResult = dnaStrand.makeComplement("ATTGC");
        final String expectedResult = "TAACG";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * This method realize test change word.
     */
    @Test
    public void test07() {
        final String actualResult = dnaStrand.makeComplement(
                "GTATCGATCGATCGATCGATTATATTTTCGACGAGATTTAAATATATATATATACGAGAGAATACAGATAGACAGATTA");
        final String expectedResult = "CATAGCTAGCTAGCTAGCTAATATAAAAGCTGCTCTAAATTTATATATATATATGCTCTCTTATGTCTATCTGTCTAAT";
        assertEquals(expectedResult, actualResult);
    }

}
