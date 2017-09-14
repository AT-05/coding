package org.fundacionjala.coding.oscar;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Oz64 on 14/09/2017.
 */
public class ComplementaryDNATest {
    @Test
    public void testComplement() {
        assertEquals("TAACG", ComplementaryDNA.makeComplement("ATTGC"));
    }

    @Test
    public void testComplement2() {
        String expectedResult = "CATA";
        String actualResult = ComplementaryDNA.makeComplement("GTAT");
        expectedResult.equals(actualResult);
    }

}
