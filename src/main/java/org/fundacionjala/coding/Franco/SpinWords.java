package org.fundacionjala.coding.Franco;

/**
 * Created by Administrator on 8/29/2017.
 */
public class SpinWords {
    private static final int MAX_LETTERS = 5;

    /**
     * This method reverses words from a sentence that larger than 5 letters.
     *
     * @param stringOfWords is a sentence.
     * @return sentence with larger than 5 letter words reversed.
     */
    public String[] spinWord(String stringOfWords) {
        final String[] words = stringOfWords.split(" ");

        for (int i = 0; i < words.length; i++) {

            if (words[i].length() > MAX_LETTERS) {
                StringBuilder reverseWord = new StringBuilder(words[i]);
                reverseWord.reverse();
                words[i] = reverseWord.toString();
            }
        }
        return words;
    }

    /**
     * This method fills the result sentence.
     *
     * @param arrayOfWords is an array of words.
     * @return a sentence containing all words separated by spaces.
     */
    public String fillString(String[] arrayOfWords) {
        final int maxValue = arrayOfWords.length - 1;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arrayOfWords.length; i++) {
            result = (i < maxValue) ? result.append(arrayOfWords[i]).append(" ") : result.append(arrayOfWords[i]);
        }
        return result.toString();
    }
}
