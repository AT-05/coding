import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Class test Dna.
 */
public class DnaStrandTest {

    /**
     * This method realize test change word.
     */
    @Test
    public void test01() {
        assertEquals("TTTT", DnaStrand.makeComplement("AAAA"));
    }
    /**
     * This method realize test change word.
     */
    @Test
    public void test02() {
        assertEquals("TAACG", DnaStrand.makeComplement("ATTGC"));
    }
    /**
     * This method realize test change word.
     */
    @Test
    public void test03() {
        assertEquals("CATA", DnaStrand.makeComplement("GTAT"));
    }
    /**
     * This method realize test change word.
     */
    @Test
    public void test04() {
        assertEquals("TTCC", DnaStrand.makeComplement("AAGG"));
    }
    /**
     * This method realize test change word.
     */
    @Test
    public void test05() {
        assertEquals("GCGC", DnaStrand.makeComplement("CGCG"));
    }
    /**
     * This method realize test change word.
     */
    @Test
    public void test06() {
        assertEquals("TAACG", DnaStrand.makeComplement("ATTGC"));
    }
    /**
     * This method realize test change word.
     */
    @Test
    public void test07() {
        assertEquals("CATAGCTAGCTAGCTAGCTAATATAAAAGCTGCTCTAAATTTATATATATATATGCTCTCTTATGTCTATCTGTCTAAT", DnaStrand.makeComplement("GTATCGATCGATCGATCGATTATATTTTCGACGAGATTTAAATATATATATATACGAGAGAATACAGATAGACAGATTA"));
    }

}