package org.fundacionjala.coding.daniel;

/**
 * Created by Administrator on 30/08/17.
 */
public class Kata4 {

    /**
     * @param sentence
     * string.
     * @return
     * spin words of string.
     */
    public String spinWords(String sentence) {
        String[] words = sentence.split("[\\s]");
        StringBuilder spinnedSentence = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            spinnedSentence.append(words[i].length() >= 5 ? spin(words[i]) : words[i]);
            if (i < words.length - 1) {
                spinnedSentence.append(" ");
            }
        }
        return spinnedSentence.toString();
    }

    /**
     * @param word
     * a string.
     * @return
     * reverse string of the word.
     */
    private String spin(String word) {
        return new StringBuilder(word).reverse().toString();

    }
}
