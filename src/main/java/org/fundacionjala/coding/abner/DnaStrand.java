package org.fundacionjala.coding.abner;

/**
 * This class DNA.
 */
public class DnaStrand {

    /**
     * This class change character.
     *
     * @param dna the old dna.
     * @return the new dna.
     */
    public String makeComplement(String dna) {
        return dna.replace("T", "W")
                .replace("A", "T")
                .replace("W", "A")
                .replace("C", "W")
                .replace("G", "C")
                .replace("W", "G");
    }
}
