package org.fundacionjala.coding.Franco;

/**
 * Created by Administrator on 8/29/2017.
 */
public class SpinWords {
    private static final int MAX_LETTERS = 5;
    private static final int CONS_ONE = 1;
    public static final int CONS_ZERO = 0;

    /**
     * This method reverses words of a sentence which are larger than 5 letters.
     *
     * @param stringOfWords is a sentence.
     * @return sentence with larger than 5 letter words reversed.
     */
    public String spinWord(String stringOfWords) {
        final String[] words = stringOfWords.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > MAX_LETTERS) {
                StringBuilder reverseWord = new StringBuilder(words[i]);
                reverseWord.reverse();
                words[i] = reverseWord.toString();
            }
        }

        return String.join(" ", words);
    }
}
