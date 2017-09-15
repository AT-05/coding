package org.fundacionjala.coding.oscar;

/**
 * Created by Oz64 on 14/09/2017.
 */
public final class DnaStrand {
    /**
     * constructor.
     */
    private DnaStrand() {
    }

    /**
     * This method change the letter for them complement.
     *
     * @param stringDNA is the DNA string.
     * @return the new string.
     */
    public static String makeComplement(String stringDNA) {
        return stringDNA.replace("A", "x")
                .replace("T", "A")
                .replace("x","T")
                .replace("C", "y")
                .replace("G","C")
                .replace("y","G");
    }
}