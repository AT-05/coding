package org.fundacionjala.coding.german;

/**
 * Created by German on 9/15/2017.
 */
public class DnaStrand {
    private static final String DOT = ".";

    /**
     * This method makes complement of a DNAStrand.
     * In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G".
     *
     * @param dna to DNAStrand.
     * @return the complement of a DNAStrand.
     */
    public String makeComplement(String dna) {
        return dna.replace("T", DOT)
                .replace("A", "T")
                .replace(DOT, "A")
                .replace("C", DOT)
                .replace("G", "C")
                .replace(DOT, "G");

    }

}

