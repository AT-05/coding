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
        String[] list = stringDNA.split("");
        for (int index = 0; index < list.length; index++) {
            switch (list[index]) {
                case "A":
                    list[index] = "T";
                    break;
                case "T":
                    list[index] = "A";
                    break;
                case "C":
                    list[index] = "G";
                    break;
                case "G":
                    list[index] = "C";
                    break;
                default:
                    break;
            }
        }
        return String.join("", list);
    }
}
