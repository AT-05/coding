package org.fundacionjala.coding.german;

/**
 * Created by German on 9/15/2017.
 */
public class DnaStrand {
    /**
     * This method makes complement of a DNAStrand.
     * In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G".
     *
     * @param dna to DNAStrand.
     * @return the complement of a DNAStrand.
     */
    public String makeComplement(String dna) {
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < dna.length(); i++) {
            char a = dna.charAt(i);

            switch (a) {
                case 'A':
                    res.append("T");
                    break;
                case 'T':
                    res.append("A");
                    break;
                case 'C':
                    res.append("G");
                    break;
                case 'G':
                    res.append("C");
                    break;
                default:
                    break;

            }
        }

        return res.toString();


    }

}

