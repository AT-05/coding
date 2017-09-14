package org.fundacionjala.coding.franco;

/**
 * Created by Administrator on 9/14/2017.
 */
public class DNAStrand {
    private static final String[][] DNA_COMPLEMENTS = {{"A", "T"}, {"T", "A"}, {"C", "G"}, {"G", "C"}};
    public static final int CONS_ZERO = 0;
    public static final int CONS_ONE = 1;

    /**
     * This method appends complement of a DNAStrand.
     *
     * @param chain is a DNAStrand.
     * @return the complement of this DNAStrand.
     */
    public String makeComplement(String chain) {
        final StringBuilder result = new StringBuilder();
        final String[] dna = chain.split("");

        int i = CONS_ZERO;
        while (i < dna.length) {
            result.append(getComplement(dna[i]));
            i++;
        }
        return result.toString();
    }

    /**
     * This method finds the complement of an individual Letter.
     *
     * @param character is a Letter.
     * @return the complement of this letter.
     */
    public String getComplement(String character) {
        String result = "";
        int i = 0;

        while (i < DNA_COMPLEMENTS.length) {
            if (DNA_COMPLEMENTS[i][CONS_ZERO].equals(character)) {
                result = DNA_COMPLEMENTS[i][CONS_ONE];
                break;
            }
            i++;
        }
        return result;
    }
}
