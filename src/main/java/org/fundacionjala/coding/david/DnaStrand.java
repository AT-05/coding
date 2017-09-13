package org.fundacionjala.coding.david;
/**
 * This class DNA.
 */
public class DnaStrand {


    /**
     * This method change words.
     * @param word is a word.
     * @return word.
     */
    public  String makeComplement(String word) {
        String[] listWord = word.split("");
        StringBuilder newWord = new StringBuilder();
        for (String item : listWord) {
            newWord.append((item.equals("A")) ? "T" : ((item.equals("T")) ? "A" : ((item.equals("C")) ? "G" : "C")));

        }
        return newWord.toString();

    }
}
