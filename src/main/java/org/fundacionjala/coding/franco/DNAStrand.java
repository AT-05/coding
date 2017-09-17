package org.fundacionjala.coding.franco;

/**
 * Created by Administrator on 9/14/2017.
 */
public class DNAStrand {
    /**
     * This method replaces al DNAStrand occurrences of
     * A, T, C and G.
     *
     * @param chain is a DNAStrand.
     * @return the complement of this DNAStrand.
     */
    public String makeComplement(String chain) {
        return chain.replace("A", "1")
                .replace("C", "2")
                .replace("G", "C")
                .replace("T", "A")
                .replace("1", "T")
                .replace("2", "G");
    }
}
