package org.fundacionjala.coding.abner.dna;

/**
 * This class DNA.
 * Created by Abner on 9/15/2017.
 */
public class DnaStrand {

    /**
     * This class change character.
     *
     * @param dna the old dna.
     * @return the new dna.
     */
    public String makeComplement(String dna) {
        String aux;
        dna = dna.replace("T", "W").replace("A", "T").replace("W", "A");
        dna = dna.replace("C", "W").replace("G", "C").replace("W", "G");
        return dna;
    }
}
