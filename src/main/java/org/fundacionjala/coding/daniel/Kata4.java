package org.fundacionjala.coding.daniel;

/**
 * Created by Administrator on 30/08/17.
 */
public class Kata4 {

    /**
     * @param sentence
     * A string.
     * @return
     * Spin words of sentence.
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
     * A String.
     * @return
     * A reverse of this string.
     */
    private String spin(String word) {
        return new StringBuilder(word).reverse().toString();

    }
}
