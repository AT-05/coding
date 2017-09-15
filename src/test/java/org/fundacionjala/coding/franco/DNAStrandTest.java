package org.fundacionjala.coding.franco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 9/14/2017.
 */
public class DNAStrandTest {
    private DNAStrand dnaStrand;

    /**
     * This method test instancing of Class DNAStrand.
     */
    @Before
    public void setUp() {
        dnaStrand = new DNAStrand();
    }

    /**
     * This method tests output complement of AAAA DNAStrand.
     */
    @Test
    public void makeComplementOfAAAA() {
        final String actualResult = dnaStrand.makeComplement("AAAA");
        final String expectedResult = "TTTT";

        assertEquals(expectedResult, actualResult);
    }

    /**
     * This method tests output complement of ATTGC DNAStrand.
     */
    @Test
    public void makeComplementOfATTGC() {
        final String actualResult = dnaStrand.makeComplement("ATTGC");
        final String expectedResult = "TAACG";

        assertEquals(expectedResult, actualResult);
    }

    /**
     * This method tests output complement of GTAT DNAStrand.
     */
    @Test
    public void makeComplementOfGTAT() {
        final String actualResult = dnaStrand.makeComplement("GTAT");
        final String expectedResult = "CATA";

        assertEquals(expectedResult, actualResult);
    }

    /**
     * This method tests output complement of AAGG DNAStrand.
     */
    @Test
    public void makeComplementOfAAGG() {
        final String actualResult = dnaStrand.makeComplement("AAGG");
        final String expectedResult = "TTCC";

        assertEquals(expectedResult, actualResult);
    }

    /**
     * This method tests output complement of CGCG DNAStrand.
     */
    @Test
    public void makeComplementOfCGCG() {
        final String actualResult = dnaStrand.makeComplement("CGCG");
        final String expectedResult = "GCGC";

        assertEquals(expectedResult, actualResult);
    }

    /**
     * This method tests output complement of a long DNAStrand chain.
     */
    @Test
    public void makeComplementOfLongChain() {
        final StringBuilder chain = new StringBuilder("GTATCGATCGATCGATCGATTATATTTTCGACGAGATTTAAA");
        chain.append("TATATATATATACGAGAGAATACAGATAGACAGATTA");
        final String actualResult = dnaStrand.makeComplement(chain.toString());
        final String expectedResult = "CATAGCTAGCTAGCTAGCTAATATAAAAGCTGCTCTAAATTTATATATATATATGCTCTCTTATGTCTATCTGTCTAAT";

        assertEquals(expectedResult, actualResult);
    }
}
