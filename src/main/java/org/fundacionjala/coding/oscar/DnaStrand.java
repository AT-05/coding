package org.fundacionjala.coding.oscar;

/**
 * Created by Oz64 on 14/09/2017.
 */
public class ComplementaryDNA {
    public static String makeComplement(String stringDNA) {
        stringDNA = stringDNA.replace("A","T");
        stringDNA = stringDNA.replace("C","G");
        return stringDNA;
    }
}
