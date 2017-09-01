package org.fundacionjala.coding.Oscar;

/**
 * Created by Oz64 on 29/08/2017.
 */
public class SpinWords {

    public static final String DELIMITER = " ";

    /**
     * This method checks when the length is greater or equal to 5 in a word, that word is reversed.
     *
     * @param stringWords the string with the words
     * @return the string with the word reversed if is necessary.
     */
    public String spinWord(String stringWords) {
        String[] words = stringWords.split(DELIMITER);
        for (int index = 0; index < words.length; index++) {
            if (words[index].length() >= 5) {
                StringBuilder builder = new StringBuilder(words[index]);
                words[index] = builder.reverse().toString();
            }
        }
        return String.join(DELIMITER, words);
    }
}