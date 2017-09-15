package org.fundacionjala.coding.german;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;


/**
 * Created by German on 9/15/2017.
 */
public class DnaStrandTest {
    private DnaStrand dnaStrand;

    /**
     * This method execute before any test.
     */
    @Before
    public void setUp() {
        dnaStrand = new DnaStrand();
    }

    /**
     * Verify makeComplement Method.
     */
    @Test
    public void testmakeComplementMethodTAndAComplement() {
        final String expectedResult = "TTTT";
        final String actualResult = dnaStrand.makeComplement("AAAA");
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Verify makeComplement Method.
     */
    @Test
    public void testmakeComplementMethodAllComplmentent() {
        final String expectedResult = "TAACG";
        final String actualResult = dnaStrand.makeComplement("ATTGC");
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Verify makeComplement Method.
     */
    @Test
    public void testmakeComplementMethodWithCATA() {
        final String expectedResult = "CATA";
        final String actualResult = dnaStrand.makeComplement("GTAT");
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Verify makeComplement Method.
     */
    @Test
    public void testmakeComplementMethodWithTTCC() {
        final String expectedResult = "TTCC";
        final String actualResult = dnaStrand.makeComplement("AAGG");
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Verify makeComplement Method.
     */
    @Test
    public void testmakeComplementMethodWithGCGC() {
        final String expectedResult = "GCGC";
        final String actualResult = dnaStrand.makeComplement("CGCG");
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Verify makeComplement Method.
     */
    @Test
    public void testmakeComplementMethodWithTAACG() {
        final String expectedResult = "TAACG";
        final String actualResult = dnaStrand.makeComplement("ATTGC");
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Verify makeComplement Method.
     */
    @Test
    public void testmakeComplementMethodWithLongString() {
        final String expectedResult =
                "CATAGCTAGCTAGCTAGCTAATATAAAAGCTGCTCTAAATTTATATATATATATGCTCTCTTATGTCTATCTGTCTAAT";
        final String actualResult = dnaStrand.makeComplement(
                "GTATCGATCGATCGATCGATTATATTTTCGACGAGATTTAAATATATATATATACGAGAGAATACAGATAGACAGATTA");
        assertEquals(expectedResult, actualResult);
    }
}
