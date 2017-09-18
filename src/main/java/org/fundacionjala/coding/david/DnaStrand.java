package org.fundacionjala.coding.david;

/**
 * This class DNA.
 */
public class DnaStrand {
    /**
     * This method change words.
     *
     * @param word is a word.
     * @return word.
     */
    public String makeComplement(String word) {

        return word.replace('T', 'X')
                .replace('A', 'T')
                .replace('X', 'A')
                .replace('G', 'X')
                .replace('C', 'G')
                .replace('X', 'C');
    }
}
