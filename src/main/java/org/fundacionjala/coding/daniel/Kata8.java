package org.fundacionjala.coding.daniel;

/**
 * Created by Administrator on 13/09/17.
 */
final class Kata8 {

    /**
     * Kata8 Constructor.
     */
    private Kata8() {
    }

    /**
     * @param dna A representation string of DNA.
     * @return It gets the complements of dna string passed.
     * ("A" and "T" are complements of each other, as "C" and and "G").
     */
    static String makeComplement(String dna) {
        dna = dna.replaceAll("A", "Z");
        dna = dna.replaceAll("T", "A");
        dna = dna.replaceAll("Z", "T");
        dna = dna.replaceAll("C", "Z");
        dna = dna.replaceAll("G", "C");
        dna = dna.replaceAll("Z", "G");
        return dna;
    }
}


